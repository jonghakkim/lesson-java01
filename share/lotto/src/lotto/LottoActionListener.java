package lotto;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

class LottoActionListener implements ActionListener {

  JLabel[] label,label2;
  JPanel panel1_2;
  String str="";
  NumberArr arr;

  Random lottoNum = new Random();
  
  
  //생성자로 이벤트에 사용할 모든 값을 받아온다
  LottoActionListener(JPanel panel1_2, JLabel[] label, JLabel[] label2, NumberArr arr){
    this.panel1_2=panel1_2;
    this.label=label;
    this.label2=label2;
    this.arr=arr;
  }
  
  @Override
  //ActionListener 인터페이스를 implements할 때 오버라이딩해야하는 메소드
  public void actionPerformed(ActionEvent arg0) {
    // TODO Auto-generated method stub
    str = "";
       
    
    for (int i = 0; i < arr.no.length; i++) {
      arr.no[5][i] = lottoNum.nextInt(45) + 1;// 0~44까지 난수를 발생시켜서 1을 더함

      while (true) {
        boolean dupl = false;// 중복을 검사하는 변수
        for (int j = 0; j < i; j++) {
          if (arr.no[5][i] == arr.no[5][j]) {
            dupl = true;// 중복이 발생하면 true로 변환
          }
        }
        if (dupl == true) {
          arr.no[5][i] = lottoNum.nextInt(45) + 1;
        } else {
          break;// 중복값이 없으면 while문을 빠져나감
        }
      }
    }
    
    label2[0].setText("<html><font color=red><b>  Lotto</b></font>Number</html>");
    panel1_2.add(label2[0]);
    panel1_2.add(label2[1]);
    
    //int 값 → string 값 
    String str2[][]=new String[6][6];
    for(int i=0;i<arr.no.length;i++){
      for(int j=0;j<arr.no[0].length;j++){
        str2[i][j]=""+arr.no[i][j];
      }
    }
    
    for(int i=0; i<arr.no.length; i++){ 
      for(int j=0; j<arr.no.length-1; j++){
        for(int e=0; e<arr.no[0].length; e++ ){
          if(str2[5][i].equals(str2[j][e])){  //lotto번호와 같을경우 red값 지정
            str2[j][e]="<font color=red><b>"+str2[j][e]+"</b></font>";
          }else{
            
            
          }
          
        }
        
      }
    }
    //str3[]에 초기값 지정. str3은 label에 쓰기 위한 string값
    String str3[]={"","","","","",""};
    for(int i=0;i<str2.length;i++){
      for(int j=0;j<str2[0].length;j++){
        if(str2[i][j].equals("0")){    //선택하지 않은경우(값이 없는경우) break;
          str3[i]="";
          break;
        }
        str3[i]+=str2[i][j]+"   ";  //html 적용했기 때문에, 공백.
      }
    }
    
    
    
    //str3배열에 html추가
    str3[0]="<html><font size=3>"+str3[0]+"</font></html>";
    str3[1]="<html><font size=3>"+str3[1]+"</font></html>";
    str3[2]="<html><font size=3>"+str3[2]+"</font></html>";
    str3[3]="<html><font size=3>"+str3[3]+"</font></html>";
    str3[4]="<html><font size=3>"+str3[4]+"</font></html>";
    
    
    /*
     * Label에 쓰는 부분
     */

    for(int i=0;i<5;i++){
      label[(2*i+1)].setText(str3[i]);
    }
      
    
    //lotto번호 
    for(int i=0;i<arr.no.length;i++){
      str=str+(arr.no[5][i])+"   ";
      
      label2[1].setText(str);
    }
    
    //다 끝내고 값초기화?
    for(int i=0;i<str2.length;i++){
      for(int j=0;j<str2[0].length;j++){
        str2[i][j]="";
      }
    }
    
    for(int i=0;i<str3.length;i++){
      str3[i]="";
    }
    
    
    

  }

}