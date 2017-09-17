package lotto;

import java.awt.event.*;
import java.util.*;

import javax.swing.*;



class RandomActionListener implements ActionListener {
  LottoP p = new LottoP();
  NumberArr arr;
  Random lottoNum = new Random();
  JLabel[] label;
  JFrame f;
  int x;
  Checkbox ch;

  // 생성자로 이벤트에 사용할 모든 값을 받아온다
  RandomActionListener(NumberArr arr, JLabel[] label, int x, Checkbox ch, JFrame f) {
    this.arr=arr;
    this.label=label;
    this.x=x;
    this.ch=ch;
    this.f=f;
  }

  @Override
  // ActionListener 인터페이스를 implements할 때 오버라이딩해야하는 메소드
  public void actionPerformed(ActionEvent arg0) {
    // TODO Auto-generated method stub
    for (int i = 0; i < arr.no.length; i++) {
      arr.no[x][i] = lottoNum.nextInt(45) + 1;// 0~44까지 난수를 발생시켜서 1을 더함

      while (true) {
        boolean dupl = false;// 중복을 검사하는 변수
        for (int j = 0; j < i; j++) {
          if (arr.no[x][i] == arr.no[x][j]) {
            dupl = true;// 중복이 발생하면 true로 변환
          }
        }
        if (dupl == true) {
          arr.no[x][i] = lottoNum.nextInt(45) + 1;
        } else {
          break;// 중복값이 없으면 while문을 빠져나감
        }

      }
    }
    
    p.bubbleSort(arr.no[x]);//Random 값을 정렬
    
    String str=p.numtoString(arr.no[x]);  //num값을 String으로 저장
    
    /*
     * Label에 쓰는 부분
     */
    if(x==0){
      label[0].setText("  A Number");
      label[1].setText(str);
    }else if(x==1){
      label[2].setText("  B Number");
      label[3].setText(str);
    }else if(x==2){
      label[4].setText("  C Number");
      label[5].setText(str);
    }else if(x==3){
      label[6].setText("  D Number");
      label[7].setText(str);
    }else if(x==4){
      label[8].setText("  E Number");
      label[9].setText(str);
    }
    
    f.setVisible(false);
        ch.close-=1;
    
    

  }


} 

