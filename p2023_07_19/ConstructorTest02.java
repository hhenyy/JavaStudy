package p2023_07_19;


class MyDate{   
  private int year;     //field:멤버변수  private:접근제어자(외부class의 접근은 허용하지않는다) 
  private int month;    
  private int day;

  public  MyDate(){  //public접근제어자 //MyDate(): 매개변수가 없는 생성자 ,기본 생성자(Default Constructor), class명과 반드시동일,형식상()꼭 
    System.out.println("[생성자] : 객체가 생성될 때 자동 호출됩니다.");  //메인메소드가없어서 컴파일까지만가능.
  }  
  public void print(){   //print(): 메소드(method)/ static이 없는상태. void나 자료형이 꼭와야함. void는 return구문생략가능.return값을 돌려주지않아도됨. 
	System.out.println(year+ "/" +month+ "/" +day);   //자료형인경우 return함.?값을돌려준다?// static은 특별한경우사용
  }
}// MyDate end

public class ConstructorTest02 {     
  public static void main(String[] args) { 
	  
	//생성자는 객체를 생성할 때 호출된다.
    MyDate d =  new MyDate();	
    d.print();              //생성자 호출
    
  //필드의 접근제어자가 private이기 때문에, 외부 클래스에서 접근할 수 없다.
//	System.out.println(d.year); // 접근제어자 private때문에 접근시도시 오류발생
//	System.out.println(d.month); // 접근제어자 private때문에 접근시도시 오류발생
//	System.out.println(d.day); // 접근제어자 private때문에 접근시도시 오류발생
//	MyDate dd =  new MyDate();
 }
} 