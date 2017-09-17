package lotto;

import java.awt.*;
import javax.swing.*;

class LottoEx {
  public static void main(String[] args) {

    /*
     * NumberArr 객체생성. 
     * 각 액션리스너에서 동일한 배열값을 사용하기 위한 작업.
     */
    NumberArr arr=new NumberArr();

    //label배열생성
    JLabel lottoExframe_label[] = new JLabel[10];
    for(int i=0;i<10;i++){
      lottoExframe_label[i] = new JLabel();
    }
    //lotto버튼 눌렀을때 사용하는 label
    JLabel lottoExframe_lotto_label[] = new JLabel[2];
    lottoExframe_lotto_label[0]=new JLabel();
    lottoExframe_lotto_label[1]=new JLabel();

    /*
     * A~E 5개의 Checkbox 프레임 생성
     * Checkbox 생성하면, makeCheckbox()메소드 실행 → 창 생성
     * 창은 이미 생성되었으나 setVisible(false)로 되어있어서 보이지 않음
     */
    Checkbox A = new Checkbox("A",0,arr,lottoExframe_label);
    Checkbox B = new Checkbox("B",1,arr,lottoExframe_label);
    Checkbox C = new Checkbox("C",2,arr,lottoExframe_label);
    Checkbox D = new Checkbox("D",3,arr,lottoExframe_label);
    Checkbox E = new Checkbox("E",4,arr,lottoExframe_label);
    // 메인 프레임 구성
    JFrame lottoExframe = new JFrame("로또 실행 프로그램");
    lottoExframe.setPreferredSize(new Dimension(400, 220));
    lottoExframe.setLocation(710, 200);

    //contentPane생성
    Container contentPane = lottoExframe.getContentPane();

    // panel1, panel1_2생성
    JPanel lottoExframe_panel1 = new JPanel();
    JPanel lottoExframe_panel1_2 = new JPanel();


    // 폰트에 색을 입히는 예제
    //lottoExframe_label1.setText("<html><font color=red><b>Lotto</b></font>Number</html>");


    // A~E버튼, Lotto버튼 생성
    JButton lottoExframe_button1 = new JButton("A");
    JButton lottoExframe_button2 = new JButton("B");
    JButton lottoExframe_button3 = new JButton("C");
    JButton lottoExframe_button4 = new JButton("D");
    JButton lottoExframe_button5 = new JButton("E");
    JButton lottoExframe_buttonfinal = new JButton("Lotto");
    JButton lottoExframe_buttonclear = new JButton("Clear");


    // panel1에 생성한 버튼 추가
    lottoExframe_panel1.add(lottoExframe_button1);
    lottoExframe_panel1.add(lottoExframe_button2);
    lottoExframe_panel1.add(lottoExframe_button3);
    lottoExframe_panel1.add(lottoExframe_button4);
    lottoExframe_panel1.add(lottoExframe_button5);
    lottoExframe_panel1.add(lottoExframe_buttonfinal);
    lottoExframe_panel1.add(lottoExframe_buttonclear);

    // contentPane에 panel 추가. panel1은 NORTH, panel1_2는 CENTER.
    contentPane.add(lottoExframe_panel1,BorderLayout.NORTH);
    contentPane.add(lottoExframe_panel1_2,BorderLayout.CENTER);

    // panel1_2 레이아웃 지정-GridLayout
    lottoExframe_panel1_2.setLayout(new GridLayout(6, 2));
    // panel1_2 label[i] 추가
    for(int i=0;i<10;i++){
      lottoExframe_panel1_2.add(lottoExframe_label[i]);
    }

    //lottoExframe_panel1_2.add(lottoExframe_label1);


    //각 버튼에 대한 ActionListener추가
    lottoExframe_button1.addActionListener(new SelectActionListener(A));
    lottoExframe_button2.addActionListener(new SelectActionListener(B));
    lottoExframe_button3.addActionListener(new SelectActionListener(C));
    lottoExframe_button4.addActionListener(new SelectActionListener(D));
    lottoExframe_button5.addActionListener(new SelectActionListener(E));
    lottoExframe_buttonfinal.addActionListener(new LottoActionListener(lottoExframe_panel1_2,lottoExframe_label,lottoExframe_lotto_label,arr));
    lottoExframe_buttonclear.addActionListener(new ClearActionListener(lottoExframe_label,lottoExframe_lotto_label,arr));


    // 프레임 보여주기 부분
    lottoExframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    lottoExframe.pack();
    lottoExframe.setVisible(true);
  }

}