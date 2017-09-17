package com.example.homan.what_is_the_weather;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

import pl.droidsonroids.gif.GifDrawable;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener{

    EditText cityName;
    GifDrawable gifEarth;
    TextView weatherData;
    ImageView weatherIcon;
    String apiKey;
    String weatherWebsite;
    String cityCmd;
    String iconLink;
    MediaPlayer bkgndMusic;
    MediaPlayer soundEffect;
    
    private TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weatherWebsite = "http://api.openweathermap.org/data/2.5/weather?";
        cityCmd = "q=";
        apiKey = "&appid=3e22d9aad215aff59ecc31ad2c9743ad";
        iconLink = "http://openweathermap.org/img/w/";

        cityName = (EditText) findViewById(R.id.cityInput);
        weatherData = (TextView) findViewById(R.id.weatherData);
        weatherIcon = (ImageView) findViewById(R.id.weatherIcon);

        textToSpeech = new TextToSpeech(this, this);

        //(((((((((((((((((((((((( end vars ))))))))))))))))))))))))))))))

        //background music
        playBackgroundMusic();

        //animated earth
        try {
            gifEarth = new GifDrawable( getResources(), R.drawable.earth3 );
        } catch (IOException e) {
            e.printStackTrace();
        }

        //animate gif start
        gifEarth.reset();
        gifEarth.setSpeed(0.1f);
        gifEarth.start();

        weatherData.setText("Waiting for....");
    }

    //set locale
    public void onInit(int text) {
        if (text == TextToSpeech.SUCCESS) {
            int language = textToSpeech.setLanguage(Locale.US);
        }
    }//end onInit

    //speech function
    private void speakOutNow(String text) {
        textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }


    //function of button: what's the weather?
    public void findWeather(View view) {
        Log.i("tms city", cityName.getText().toString());

        //sound effect
        playSoundEffect("pop");

        //keyborad
        view.setFocusable(false);
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);

        String city = null;
        try {
            city = URLEncoder.encode(cityName.getText().toString(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(), "City Not Found", Toast.LENGTH_LONG).show();
        }

        if (!city.isEmpty()) {

            DownloadTask task = new DownloadTask();

            String combineLink = weatherWebsite + cityCmd + city + apiKey;
            Log.i("tms LINK", combineLink);
            task.execute(combineLink);
        } else {
            playSoundEffect("alert");

            weatherIcon.setImageResource(R.drawable.error_red);
            weatherData.setText("Please enter a city!");
        }

    } //end find weather

    //Download image form web
    public class ImageDownloader extends AsyncTask<String, Void, Bitmap> {

        @Override
        protected Bitmap doInBackground(String... urls) {
            try {
                URL url = new URL(urls[0]);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.connect();

                InputStream inputStream = connection.getInputStream();
                Bitmap myBitmap = BitmapFactory.decodeStream(inputStream);

                return myBitmap;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }
    } //end image downloader

    //download weather resource
    public class DownloadTask extends AsyncTask<String, Void, String> {


        @Override
        protected String doInBackground(String... urls) {

            URL url;
            HttpURLConnection urlConnection = null;

            Log.i("tms URL", urls[0]);

            try {
                String result = "";

                url = new URL(urls[0]);
                urlConnection = (HttpURLConnection) url.openConnection();

                int code = urlConnection.getResponseCode();
                Log.i ("tms code", String.valueOf(code));

                if (code == 404) {
                    Log.i("tms code sent", "true");
                    return "404";
                }

                InputStream inpt  = urlConnection.getInputStream();

                return readStream(inpt);

            } catch (Exception e) {
                Toast.makeText(getApplicationContext(), "City Not Found", Toast.LENGTH_LONG).show();
            }
            return null;
        } // end background

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            Log.i("tms PostExecute", s);

            //check HTTP 404
            if (!s.equals("404")) {

                //convert string to jason
                try {
                    String message = "";
                    String inputName = cityName.getText().toString();

                    JSONObject jsonObject = new JSONObject(s);
                    String weatherInfo = jsonObject.getString("weather");
                    String cityNameFromSite = jsonObject.getString("name");

                    Log.i("tms name <>", cityNameFromSite + " vs " + inputName + " True");

                    //check input name and err message
                    if ( cityNameFromSite.equalsIgnoreCase(inputName) ) {


                        JSONArray array = new JSONArray(weatherInfo);

                        for (int i = 0; i < array.length(); i++) {
                            JSONObject jsonPart = array.getJSONObject(i);

                            String main = "";
                            String description = "";
                            String icon = "";
                            String iconUrl = "";

                            main = jsonPart.getString("main");
                            description = jsonPart.getString("description");
                            icon = jsonPart.getString("icon");

                            if (main != "" && description != "") {
                                message = "City: " + cityNameFromSite + "." +
                                        "\nCondition: " + main + "." +
                                        "\nDescription: " + description + ".";
                                iconUrl = iconLink + icon + ".png";

                                weatherData.setText(message);
                                weatherIcon.setImageBitmap(getIcon(iconUrl));

                                //text to speech
                                speakOutNow(message);

                                //clear text input
                                cityName.setText("");

                            } else {
                                Toast.makeText(getApplicationContext(), "Could not find weather", Toast.LENGTH_LONG).show();
                            }
                        }//endfor
                    } else {
                        Log.i("tms name <>", cityNameFromSite + " vs " + inputName + " False");

                        errorHandler();

                    }
                } catch (JSONException e) {
                    Toast.makeText(getApplicationContext(), "Could not find weather", Toast.LENGTH_LONG).show();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }


            } else {
                errorHandler();
            }
        }
    } //end download task

    private String readStream(InputStream stream) throws Exception {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(stream))) {
            String line;
            while ((line = in.readLine()) != null) {
                builder.append(line); // + "\r\n"(no need, json has no line breaks!)
            }
            in.close();
        }
        Log.i("tms JSON:", builder.toString());
        return builder.toString();
    }

    //error speech and message
    public void errorHandler() {
        playSoundEffect("wrong");

        weatherIcon.setImageResource(R.drawable.error_red);

        String errMsg = "Try Again!\nOr\nCity Not Found!";
        weatherData.setTextColor(getResources().getColor(R.color.colorAccent));
        weatherData.setText(errMsg);
        speakOutNow(errMsg);
        Toast.makeText(getApplicationContext(), "Could not find weather", Toast.LENGTH_LONG).show();

        //clear text input
        cityName.setText("");
    }

    //download image icon from web
    public Bitmap getIcon(String url) throws ExecutionException, InterruptedException {
        ImageDownloader imageTask = new ImageDownloader();
        Bitmap iconImage = null;

        try {
            iconImage = imageTask.execute(url).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        return iconImage;
    }

    public void playBackgroundMusic() {
        AssetFileDescriptor descriptor = null;
        bkgndMusic = new MediaPlayer();

        //wav files are stored in "assets/sound"
        try {
            descriptor = getAssets().openFd("sound/epic_strings.mp3");
            bkgndMusic.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
            descriptor.close();
            bkgndMusic.setLooping(true);
            bkgndMusic.prepare();
            bkgndMusic.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//end Back Ground Music

    public void playSoundEffect(String sound) {
        AssetFileDescriptor descriptor = null;
        soundEffect = new MediaPlayer();

        //wav files are stored in "assets/sound"
        try {
            switch (sound) {
                case "pop":
                    descriptor = getAssets().openFd("sound/bottle_pop.wav");
                    break;
                case "alert":
                    descriptor = getAssets().openFd("sound/computer_alert.mp3");
                    break;
                case "wrong":
                    descriptor = getAssets().openFd("sound/game_sound_wrong.mp3");
                    break;
                default:
                    System.out.println("Invalid sound file.");
                    break;
            }
            soundEffect.setDataSource(descriptor.getFileDescriptor(), descriptor.getStartOffset(), descriptor.getLength());
            descriptor.close();
            soundEffect.prepare();
            soundEffect.start();

            soundEffect.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer soundEffect) {
                    soundEffect.stop();
                    if (soundEffect != null) {
                        soundEffect.reset();
                        soundEffect.release();
                    }

                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }//end sound effect

}
