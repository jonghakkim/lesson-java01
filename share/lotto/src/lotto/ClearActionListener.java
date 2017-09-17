package lotto;

import java.awt.event.*;

import javax.swing.*;

public class ClearActionListener implements ActionListener {

  JLabel label[];
  JLabel label2[];
  NumberArr arr;

  ClearActionListener(JLabel label[], JLabel label2[], NumberArr arr) {
    this.label = label;
    this.label2 = label2;
    this.arr=arr;
  }

  public void actionPerformed(ActionEvent arg0) {

    /*
     * Label에 쓰는 부분
     */

    for (int i = 0; i < label.length; i++)

    {
      label[i].setText("");
    }

    for (int i = 0; i < label2.length; i++)

    {
      label2[i].setText("");
    }
    
    //배열초기화
    for(int i=0;i<arr.no.length;i++){
      for(int j=0;j<arr.no[0].length;j++){
        arr.no[i][j]=0;
      }
    }

  }
}