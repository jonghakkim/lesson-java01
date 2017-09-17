package credu.step08;

class SutdaCard {

  private int num;
  private boolean isKwang;
  
  public SutdaCard () {
    this(1, false); // 없어도 된다. 없으면 컴파일러가 자동으로 super() 붙인다.
                   // 생성자는 객체를 초기화하는 기능을 한다. 되도록 초기화 하는 코드를 넣어라.
  }
      
  public SutdaCard(int num, boolean isKwang) {
    //super(); //  없어도 된다. 없으면 컴파일러가 자동으로 붙인다.
    this.num = num;
    this.isKwang = isKwang;
  }
  
  @Override
  public String toString() {
    return "SutdaCard [num=" + num + ", isKwang=" + isKwang + "]";
  }

  public int getNum() {
    return this.num;
  }
  
  public void setNum(int num) {
    this.num = num;
  }
  
  public boolean isKwang() {
    return isKwang;
  }
  
  public void setKwang(boolean isKwang) {
    this.isKwang = isKwang;
  }
}

public class Ex01SutdaCard {
  public static void main(String[] args) {
    SutdaCard sutdaCard = new SutdaCard();
    SutdaCard sutdaCard2 = new SutdaCard(20, true);
    
    System.out.println("sutaCard 인스턴스 = " + sutdaCard);
    System.out.println("sutaCard2 인스턴스 = " + sutdaCard2);
    
    sutdaCard.setNum(100);
    sutdaCard.setKwang(true);
    
    sutdaCard2.setNum(1000);
    sutdaCard2.setKwang(false);
    
    System.out.println("sutdaCard 인스턴스 - num =" + sutdaCard.getNum()); 
    System.out.println("sutdaCard 인스턴스 - kwang =" + sutdaCard.isKwang());
    
    System.out.println("sutdaCard 인스턴스 - num =" + sutdaCard2.getNum()); 
    System.out.println("sutdaCard 인스턴스 - kwang =" + sutdaCard2.isKwang());
    
    
    System.out.println("sutaCard 인스턴스 = " + sutdaCard);
    System.out.println("sutaCard 인스턴스 = " + sutdaCard.toString()); // 위의 코드와 동일한 결과를 출력한다.
    
    System.out.println("sutaCard2 인스턴스 = " + sutdaCard2);
  } 
  
}







