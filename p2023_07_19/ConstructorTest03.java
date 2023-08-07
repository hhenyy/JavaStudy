package p2023_07_19;

class MyDate03 {   //같은 패키지 안에 같은 class명이면 오류발생 (class명이 중첩되면)
  private int year;    //field,멤버변수, int형은 0으로 초기화(값저장)
  private int month;    
  private int day;
  
  //생성자 : 객체를 생성할때 호출되고, 필드값을 초기화 시켜주는 역할을 한다.
  public MyDate03(){ // 기본 생성자 (매개변수가 없는 생성자) 
    year=2023; 
    month=4;
    day=1;
  }  
  public void print(){
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}// MyDate end

public class ConstructorTest03 {     
  public static void main(String[] args) {
    MyDate03 d=new MyDate03();
    d.print();    //MyDate03(); <-생성자 호출/print메소드는 public접근제어자라 호출가능.
    
    //private 접근제어자는 외부 클래스의 접근을 허용하지 않기 때문에
    //직접 접근할 수 없다.
//    System.out.println(d.year); //오류발생
  }
}               