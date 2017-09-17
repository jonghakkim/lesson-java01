package lotto;
import java.awt.event.*;

import javax.swing.*;

class InsertActionListener implements ActionListener {
  LottoP p = new LottoP();
  Checkbox ch;
  JFrame f = new JFrame();
  String str="";
  int x;
  NumberArr arr;
  JLabel[] label;
  
  
  InsertActionListener(JFrame f, Checkbox ch, NumberArr arr, int x, JLabel[] label){
    this.f=f;
    this.ch=ch;
    this.arr=arr;
    this.x=x;
    this.label=label;
  }
  
  
  public void actionPerformed(ActionEvent arg0) {
    for(int i=0;i<arr.no.length;i++){
      arr.no[x][i]=0;
    }
    
    int j=0;
    for(int i=0;i<45;i++){
      if(ch.ck[i].isSelected()==true){  //checkbox에 check가 되어있다면...
        try{
          arr.no[x][j]=ch.checkValue[i];  //checkValue배열에 저장되어있는 값을 arr.no배열로 옮겨옴
          j++;
        }catch (Exception e) {  //check값이 6개를 초과할경우 에러메세지 출력
          JOptionPane.showMessageDialog(f, "숫자는 6개만 체크해주세요", "에러메세지", JOptionPane.ERROR_MESSAGE);
          return;
        }
      }
    }
    if(j<6){  //check 값이 6개 미만일 경우 에러메세지 출력
      JOptionPane.showMessageDialog(f, "숫자를 6개 체크해주세요", "에러메세지", JOptionPane.ERROR_MESSAGE);
        System.out.println("Error");
      return;
    }
    
    
    p.bubbleSort(arr.no[x]);//Insert 값을 정렬
    
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