package credu.step08;

public class MainJob {

  public static void main(String[] args) {
     MyJob[] m =new MyJob[] {
           new MyJob(),
           new MyJob(),
           new MyJob()};
     
     m[0].setName("Ruri");
     m[1].setName("Ruse");
     m[2].setName("Ruro");
     
     m[0].setJob("Programmer");
     m[1].setJob("Employee");
     m[2].setJob("SalesMan");
     for( MyJob r : m){
       System.out.println(r.getName()+" "+ r.getJob());
     }
     
  }

}
