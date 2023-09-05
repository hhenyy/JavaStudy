package p2023_07_17;

public class MethodEx01 {

	//메소드: 여러가지 코드를 묶어 놓은것
	//메소드를 사용하는 이유는 코드를 재사용하기 위해서 메소드 사용한다.
	
	//사용자 정의 메소드
	//메소드안에 메소드x (중첩메소드 안됨), main메소드 위나 밑에입력!
	//사용자 정의 메소드는 프로그래머가 직접 호출해야 실행된다. 메인메소드 안에서 호출
	//정적메소드는 호출 class명 생략가능.?
	//쉽게호출하게만들떄만 static호출?
	//void: 값을 돌려주지않아도된다.
	//return: 값을 돌려줘야한다.
	
	public static void check() {  //정적 메소드(static이 붙은 메소드)//메소드정의
		System.out.println("메소드 호출 성공");        
		return;                    //return 생략가능
	}
	
	// 값 전달에 의한 메소드 호출 방식(Call by Value방식)
	static void check(int a) {  //int a는 매개변수(parameter): in a=30 <-30을 할당 받고 a출력함.
		System.out.println("전달된 값:"+a);
	}
	
	static void check (int a, double d) {    //메소드 오버로딩: 한개의 클래스에 여러 체크변수정의
		double result =a+d;  //a: 4바이트 d: 8바이트 ->double형으로   //지역변수
		System.out.println("전달될 값의 합:"+result);
	}
	
	static void check(char c) {    //char c='A'
		System.out.println("전달된 값:"+c);	
	}
	
	static void check(boolean b) {  // boolean b=true
		System.out.println("전달된 값:"+b);
	}
	
	//주소값 전달에 의한 메소드 호출방식(Call by Reference방식)
	static void check (String s) {  //string은 참조형 // String s ="자바"
		System.out.println("전달된 값:"+s);           // String s= new String("자바")
	}
	
	//return문 의 역할: 메소드를 호출한 곳에 값을 돌려주는 역할
	//return문은 메소드 가장 마지막 줄에 사용해야한다.
	static int check01() {  //int는자료형이라 return으로씀
		System.out.println("리턴구문"); 
		return 50; //메소드를 호출한곳에 50을 돌려주는역할  //<-50.7 double형으로 쓰면 오류발생 (int형 이라서)
	}
	
	static double check02 (int a, double d) {
		double result = a + d;
		return result;     //메소드 호출한곳에 값을 전달 
	}
	
	//main() 메소드는 자바가상머신(JVM:java.exe)으로만 호출된다.(JVM에 의해 호출됨)
	//main() 메소드는 프로그래머가 직접 호출 할 수 없다.
	public static void main(String[] args) {   //자바 가상머신으로만 호출 //메소드 호출
		// TODO Auto-generated method stub
		MethodEx01.check();  //check메소드 호출
		check();
		check(30);  //정수30을 매개변수에 전달 , 30을 할당 받고 a출력함.
		check(10,20.5);
		check('A');
		check(true);
		check("자바");
		check(new String("자바"));  //new연산자를 써서 string객체를 만들어서 호출해도됨.
		
		check01();  // return문으로 돌려주는 값이 출력되지 않는다.
		int result= check01();  //int형으로 돌려주기떄문에 int로 호출
		System.out.println("돌려받은 값1:"+result);
		System.out.println("돌려받은 값2:"+check01());
		
		double result2= check02(50,3.14);
		System.out.println("돌려받은 값3:"+result2);
		System.out.println("돌려받은 값4:"+check02(50,3.14));

	}

}
