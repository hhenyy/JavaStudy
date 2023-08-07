package p2023_07_20;
//p250~251
class Calculator{  //생략default접근제어자 Calculator CalculatorEx 같은 패키지안에있어서 접근가능
	    //powerOn() <-메소드
	void powerOn() {  //void: 값을 돌려주지않아도된다.->return생략가능
		System.out.println("전원을 켭니다.");
		return;                //생략가능
	}
	
	//return문: plus() 메소드를 호출한 곳에 값을 돌려주는 역할
	//return문은 메소드 가장 마지막 줄에 사용해야 한다.
	int plus(int x, int y) {  //int(자료형):값을 돌려주어야함->return사용
		int result = x+y;           //지역변수:x,y,result
		return result; 
//		System.out.println("test"); //return구문 밑에 실행시 오류 발생
	} 
	double divide(int x, int y) { //자동형변환: byte->int
		double result = (double) x / (double)y; //강제형변환: int->double
		return result;
		
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	
	}
}


public class CalculatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc= new Calculator();
		myCalc.powerOn();
		
		int result1= myCalc.plus(5,6);
		System.out.println("result1:"+result1);
		
		byte x = 10;
		byte y =4;
		double result2 = myCalc.divide(x,y);
		System.out.println("result:"+result2);

	}

}
