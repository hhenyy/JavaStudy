package p2023_07_20;

class StaticTest3{
  private static int a=10; //정적필드,정적멤버변수
  private int b=20;  //필드, 인스턴스멤버변수
  
  public static void printA(){    //정적메소드
	  System.out.println(a);      //정적 메서드에서는 this를 사용하지 못함   
//    System.out.println(this.a);   //컴파일 에러 발생 
                         //this.는 개별적 객체를 의미하기떄문에 정적필드앞에 this붙이면 안됨. 
                         //this.는일반적 필드에서는 사용가능함. (정적필드 아닌경우에는 사용가능)
      //정적 메소드 안에는 정적 필드만 사용 할수 있다.
//    System.out.println(b);
  }
  public void printB(){    //this는 인스턴스 메서드에서 여러 객체에 의해서 
	 //일반 메소드 안에는 필드와 정적필드를 모두 사용 할 수 있다.
	  System.out.println(a); //메서드가 호출될 때 이를 구분하기 위해서 사용된다. 
      System.out.println(b); //메서드가 호출될 때 이를 구분하기 위해서 사용된다. 
  }                           
}
public class StaticTest03 {
  public static void main(String[] args) {
    StaticTest3.printA();  //정적 메소드 호출
    StaticTest3 s1 = new StaticTest3();
    StaticTest3 s2 = new StaticTest3();
    s1.printB();
    s2.printB();
  }    
}     