package p2023_07_20;

// this () : 같은 클래스 안에 있는 생성자를 호출하라는 의미로 사용됨.
class MyDate{   

  private int year;    //field,멤버변수
  private int month;    
  private int day;

  //생성자 오버로딩: 한개의 클래스에 여러개의 생성자를 정의 하는것.
  //조건: 매개변수의 자료형, 매개변수의 갯수, 매개변수의 순서 다르게 설정
  
  //매개변수 갯수가 다른 생성자들
  public MyDate(){                     //기본 생성자
    this(2023, 1, 1);                  //같은 클래스 안의 생성자 호출                 
  }  
  public MyDate(int new_year){
    this(new_year, 1, 1);             //같은 클래스 안의 생성자 호출       
  }   // 2023
  public MyDate(int new_year, int new_month){
     this(new_year, new_month, 1);    //같은 클래스 안의 생성자 호출  
  }  //    2023          7     1
public MyDate(int new_year,int new_month,int new_day){
    year=new_year;   //2023       7            19
    month=new_month;
    day=new_day;
  }    

  public void print(){
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}

public class ConstructorTest10 {     
  public static void main(String[] args) {
    MyDate d=new MyDate(2023, 7, 19);  
    d.print();    //MyDate(2023, 7, 19); <-생성자 호출
    MyDate d2=new MyDate(2023, 7);     
    d2.print();  // MyDate(2023, 7);  <-생성자 호출
    MyDate d3=new MyDate(2023);       
    d3.print();  //MyDate(2023); <-생성자 호출
    MyDate d4=new MyDate();           
    d4.print();   // MyDate();<-기본 생성자 호출
  }
}