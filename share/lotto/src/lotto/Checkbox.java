package lotto;
import java.awt.*;

import javax.swing.*;

class Checkbox {

  int checkValue[] = new int[45];     //check값을 저장하는 배열
  JCheckBox ck[]= new JCheckBox[45];  //checkbox 생성
  
  String name;
  int x;
  boolean onoff=false;
  JLabel[] label;
  
  int close=0;    // 창을 하나만 띄우기 위한 조건 int변수
  NumberArr arr;  // 배열이 있는 객체 생성
  
  
  Checkbox(String name, int x, NumberArr arr, JLabel[] label){
    this.name=name;
    this.x=x;
    this.arr=arr;
    this.label=label;
    makeCheckbox();
  }
  
  void makeCheckbox() {
    
    //프레임 구성
    JFrame myNumberframe = new JFrame("로또("+name+")");
    myNumberframe.setLocation(280+(240*x), 420);
    myNumberframe.setPreferredSize(new Dimension(240,360));
    
    
    Container contentPane = myNumberframe.getContentPane();
    JPanel myNumberframe_panel1 = new JPanel();
    JPanel myNumberframe_panel2 = new JPanel();
    
    JButton myNumberframe_button1 = new JButton("직접");
    JButton myNumberframe_button2 = new JButton("자동");
    JButton myNumberframe_button3 = new JButton("취소");
    
    
    //체크박스 생성. 값은 checkValue[]에 저장
    for (int i=0;i<45;i++){
      checkValue[i]=i+1;
      if(i<9){
        ck[i]=new JCheckBox("0"+(i+1));
      }else{
        ck[i]=new JCheckBox((i+1)+"");      
      }     
    }
    
    for (int i=0;i<45;i++){
      myNumberframe_panel1.add(ck[i]);
    }
    
    //panel2에 버튼 3개 추가
    myNumberframe_panel2.add(myNumberframe_button1);
    myNumberframe_panel2.add(myNumberframe_button2);
    myNumberframe_panel2.add(myNumberframe_button3);
    
    //각 버튼 액션
    myNumberframe_button1.addActionListener(new InsertActionListener(myNumberframe,this,arr,x,label));
    myNumberframe_button2.addActionListener(new RandomActionListener(arr,label,x,this,myNumberframe));
    myNumberframe_button3.addActionListener(new CloseActionListener(myNumberframe,this));
    
    //contentPane에 panel 추가(레이아웃지정)
    contentPane.add(myNumberframe_panel1,BorderLayout.CENTER);
    contentPane.add(myNumberframe_panel2,BorderLayout.SOUTH);
    
    //myNumberframe.setDefaultCloseOperation(new CloseActionListener(myNumberframe,this));
    myNumberframe.pack();
    myNumberframe.setVisible(onoff);
  }
}