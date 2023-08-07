package p2023_07_19;

class MyDate04{   
  int year;     //field,멤버변수
  int month;    
  int day;  

  public MyDate04(){  //기본 생성자
    year=2023;    
    month=4;    
    day=1;
  }
  
 //this: 내부 레퍼런스 변수
//필드명과 매개변수명 같으면 오류가 발생하진 않지만 값전달이 되지 않음, this.을 붙이면 필드가 됨. (이클립스로만들수있음)
public MyDate04(int year, int month, int day) { //매개변수를 가진 생성자
	this.year = year;  //2023
	this.month = month; //7
	this.day = day;     //19
}


  public void print(){
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}// MyDate end

public class ConstructorTest04 {     
  public static void main(String[] args) {
    MyDate04 d=new MyDate04();	// MyDate04();	<-기본생성자호출
    d.print();
    
// 접근제어자가 없는 생략(defalt)접근제어자라 클래스, 같은패키지내의 소속은 접근가능함.
    System.out.println(d.year);  //2023  
    System.out.println(d.month); //4
    System.out.println(d.day);   //1

    MyDate04 d2=new MyDate04(2023, 7, 19);
    d2.print();
    System.out.println(d2.year);  //2023  
    System.out.println(d2.month); //7
    System.out.println(d2.day);   //19
  }
}            