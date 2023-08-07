package p2023_07_20;

class StaticTest2{          //private접근제어자;  외부접근허용하지않는다.
  private static int a=10;   //정적필드/정적 멤버변수 (정적멤버,정적필드)
  private int b=20;          //인스턴트 멤버 변수/ 멤버변수(전역 변수, field**)
  
  public static void setA(int new_a){   //정적 메소드
     a = new_a; //10000
  }
  public static int getA(){             //정적메소드
    return a;
  }
}
public class StaticTest02 {
  public static void main(String[] args) {
	  //a가 private으로 선언되어서 컴파일 에러 발생
 // System.out.println(StaticTest2.a);//오류발생
    System.out.println(StaticTest2.getA());  //10

    StaticTest2 s1=new StaticTest2();
    StaticTest2 s2=new StaticTest2();
  
//  StaticTest2.getA(1000);
    s1.setA(10000); 
    
 // int res1=StaticTest2.getA();
    int res1=s1.getA();
    System.out.println(res1); ///10000
    System.out.println(s2.getA()); ///10000
 }    
}              