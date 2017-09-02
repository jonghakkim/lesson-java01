package credu.step08;

public class MAddress {
  
  public static void main(String[] args) {
    
    MyAddress  ar=new MyAddress();
    ar.setName("홍길동");
    ar.setAddr("서울시 강남구 도곡동");
    System.out.println("name :"+ ar.getName());
    System.out.println("addr :"+ ar.getAddr());
    
    MyAddress  ar1=new MyAddress();
    ar1.setName("Dominica");
    ar1.setAddr("서울시 강남구 도곡동 000");
    System.out.println("\nname :"+ ar1.getName());
    System.out.println("addr :"+ ar1.getAddr());
    
    MyAddress  ar2=new MyAddress();
    ar2.setName("Dominico");
    ar2.setAddr("서울시 강남구 도곡동 111");
    System.out.println("\nname :"+ ar2.getName());
    System.out.println("addr :"+ ar2.getAddr());
  }
  
}
