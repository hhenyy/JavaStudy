package p2023_07_19;

class MyDate05{   
  private int year;    //field, int형이라 초기값 0
  private int month;    
  private int day;

  //기본 생성자는 객체를 생성할때 컴파일러가 자동으로 만들어 주지만,예외적으로 
  //매개변수를 가진 생성자가 있을 경우에는 더이상 기본 생성자를 만들어 주지 않는다. 
  //그래서 기본 생성자를 사용하기때문에 주석처리하거나 만들지 않으면 오류발생한다.
  //그래서 형식적으로 만들어주어야한다.
  
  public MyDate05(){  //기본 생성자 (매개변수가 없는 생성자)
  }
  
// 생성자의 매개변수명과 필드명이 같은 이름인 경우에는 값전달이 되지 않음.(다른이름이면 매개변수명이 필드명으로 할당됨 )
//괄호한의 변수를 매개변수라함. 매개변수를 가진 생성자//원하는값으로 필드값 초기화
  public MyDate05(int new_year, int new_month, int new_day){  
    year=new_year;    //2023   <- year(필드명)=new_year;(매개변수명)                   
    month=new_month;  //7       
    day=new_day;      //19
  }  
  public void print(){
    System.out.println(year+ "/" +month+ "/" +day); 
  }
}
public class ConstructorTest05 {     
  public static void main(String[] args) {
    MyDate05 d=new MyDate05();  //MyDate(); <-기본생성자호출
    d.print();  

    MyDate05 d2=new MyDate05(2023, 7, 19); //MyDate05(2023, 7, 19); <-매개변수를 가진 생성자 호출
    d2.print();     
    }
}      