package lotto;
import java.awt.event.*;

import javax.swing.*;

class CloseActionListener implements ActionListener {
  JFrame f;
  Checkbox ch;
  
  
  //이벤트에 사용할 모든 값을 받아온다
  CloseActionListener(JFrame f,Checkbox ch){
    this.f=f;
    this.ch=ch;
  }
  
  @Override
  //ActionListener 인터페이스를 implements할 때 오버라이딩해야하는 메소드
  public void actionPerformed(ActionEvent arg0) {
    // TODO Auto-generated method stub

        f.setVisible(false);
        ch.close-=1;

  }

}