package p2023_07_27;

//p318~319
//1.메소드 재정의(Method Overriding)
//: 부모 클래스로 부터 상속받은 메소드를 자식 클래스에서 재정의 해서 사용하는 것
//2.자식 클래스로 객체를 생성한 다음에 메소드를 호출하면, 메소드 오버라이딩된 메소드만 호출된다.
//3.부모 클래스로 상속 해주는 메소드는 더 이상 사용할 수 없는 은닉 메소드가 된다.
//4.부모 클래스의 은닉 메소드를 사용하기 위해서는 자식클래스의 메소드안에서 
//super.parentPrn() 형식으로 호출해서 사용할 수 있다.

class Calculator{                   //부모 클래스
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle()실행");
		return 3.14159 * r * r;
	}
}
class Computer extends Calculator{ //자식 클래스


	@Override  //어노테이션
	double areaCircle(double r) {  //메소드 오버라이딩/ 자료형 매개변수의 자료형 메소드명 같음 
		// TODO Auto-generated method stub
		System.out.println("Calculator 객체의 areaCircle()실행");
		return Math.PI * r * r;
	}
	
}

public class ComputerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r = 10;
		
		Calculator cal = new Calculator();
		System.out.println("원의 면적:"+cal.areaCircle(r));
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("원의 면적:"+com.areaCircle(r));
		// 자식 클래스에서 메소드 오버라이딩된 메소드가 호출된다.
		
	}

}
