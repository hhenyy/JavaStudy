package p2023_07_28;

abstract class AbstractClassB{  //추상 클래스
	abstract void Method01();   //추상 메소드
	void Method02(){            //일반 메소드
	   System.out.println("Method02:  추상클래스에서 구현");
	 }
}
abstract class MiddleClass extends AbstractClassB{ //추상클래스가 추창클래스에 상속
	void Method01(){  //메소드 오버라이딩(부모클래스의메소드를 내용재정의),최종적으로 상속받는 subclassB에서 오버라이딩 해도됨.
	  System.out.println("Method01: 서브클래스에서 구현된 추상메소드");
	}
	public void Method03(){
	  System.out.println("Method03: 추상클래스에서 구현");
	}
}
class SubClassB extends MiddleClass{ //추상클래스가 구현클래스에 상속
//	void Method01(){   //메소드 오버라이딩,MiddleClass에서 오버라이딩 해도되고 최종적으로 상속받는 subclassB에서 오버라이딩 해도됨.(2곳중에 한곳)
//	  System.out.println("Method01: 서브클래스에서 구현된 추상메소드");
//	}
}
class AbstractTestB{
	public static void main(String args[]){
	   SubClassB obj =  new SubClassB(); //추상클래스는 객체생성 불가해서 구현클래스로 객체생성
	   obj.Method01(); //메소드 오버라이딩된 메소드가 호출된다.
	   obj.Method02(); //조상 클래스로 부터 상속받은 메소드를 호출한다.
	   obj.Method03(); //조상 클래스로 부터 상속받은 메소드를 호출한다.
	   
	   
	 }
}


