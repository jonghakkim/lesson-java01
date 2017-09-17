package credu.step09;

public class BB extends AA {
  private int b;

  public BB(){}
  public BB(int a, int b){
    super(a);
    this.b=b;
  }
  
  public int getB() {
    return b;
  }
  public void setB(int b) {
    this.b = b;
  }
  
  public int getHap(){
    //return  this.getA()+b; 
    // return a+b; X
    return  this.getA()+ getB();
  }
}

