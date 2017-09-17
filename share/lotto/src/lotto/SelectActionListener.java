package lotto;
import java.awt.event.*;
import javax.swing.*;

class SelectActionListener implements ActionListener {

  Checkbox ch;
  JFrame f;
  
  
  //생성자로 이벤트에 사용할 모든 값을 받아온다
  SelectActionListener(Checkbox ch){
    this.ch=ch;
  }
  
  @Override
  //ActionListener 인터페이스를 implements할 때 오버라이딩해야하는 메소드
  public void actionPerformed(ActionEvent arg0) {
    // TODO Auto-generated method stub
    if(ch.close<1){
      ch.onoff=true;
      ch.makeCheckbox();
      ch.close+=1;
    }
    else{
      JOptionPane.showMessageDialog(f,"창이 이미 열려있습니다.", "에러메세지", JOptionPane.ERROR_MESSAGE);
    }

  }

}