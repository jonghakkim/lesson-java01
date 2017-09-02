package credu.step08;

public class DoitScore {  
  
  private String name ;
  private int kor, eng, mat, tot;
  private double avg;
  private char grade;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getKor() {
    return kor;
  }

  public void setKor(int kor) {
    this.kor = kor;
  }

  public int getEng() {
    return eng;
  }

  public void setEng(int eng) {
    this.eng = eng;
  }

  public int getMat() {
    return mat;
  }

  public void setMat(int mat) {
    this.mat = mat;
  }

  public int getTot() {
    tot = this.getKor() + this.getEng() + getMat();
    //tot= kor+eng+mat;
    return tot;
  }

  public double getAvg() {
    avg = getTot() / 3.0;//kor+eng+mat 
    return avg;
  }

  public char getGrade() {
    switch ((int) getAvg() / 10) {
    case 10:
    case 9:
      grade = 'A';
      break;
    case 8:
      grade = 'B';
      break;
    case 7:
      grade = 'C';
      break;
    default:
      grade = 'D';
    }
    return grade;
  }
  
  public void Prn() {
    System.out.printf("\n %-5s %5d %5d %5d %5d %5.1f %3c \n", 
                      getName(),
                      getKor(), getEng(), getMat(), 
                      getTot(), getAvg(), getGrade());

  }
  
  
  public static void main(String[] args) {
    System.out.println(" 이름          국어   영어   수학  총점  평균  학 점");
    
    DoitScore  s1=new DoitScore();
    DoitScore  s2=new DoitScore();
    DoitScore  s3=new DoitScore();
     
    s1.setName("도미니꼬");
    s1.setKor(76);
    s1.setEng(85);
    s1.setMat(100);
     
     
    s2.setName("폴리오");
    s2.setKor(65);
    s2.setEng(83);
    s2.setMat(92);
     
     
    s3.setName("루오");
    s3.setKor(88);
    s3.setEng(76);
    s3.setMat(54);
     
    s1.Prn();
    s2.Prn();
    s3.Prn();
    System.out.println("=============================");
     
    int kor_tot= s1.getKor()+ s2.getKor()+ s3.getKor();
    int eng_tot= s1.getEng() + s2.getEng()+ s3.getEng();
    int mat_tot= s1.getMat()+ s2.getMat()+ s3.getMat();
     
    System.out.printf("세명의 국어 합 =%5d \n", kor_tot );
    System.out.printf("세명의 영어 합 =%5d \n", eng_tot );
    System.out.printf("세명의 수학 합 =%5d \n", mat_tot );
  }

}
