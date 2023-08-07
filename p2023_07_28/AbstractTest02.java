package p2023_07_28;

//메소드의 다형성  
//:부모 추상 클래스를 상속을 받으면, 자식 클래스들은 추상메소드(draw())를 모두 
//오버라이딩을 해서, 동일한 이름을 가지고 있지만 서로 다른내용으로 
//동작하는 것을 메소드의 다형성이라 함.
//참고) 객체지향 언어의 특성(상속,캡슐화,다형성)
abstract class ShapeClass{  //부모 추상 클래스
	abstract void draw();   //추상 메소드 
}
class Circ extends ShapeClass{ 
	void draw(){      //메소드 오버라이딩
		System.out.println("원을 그린다");
	}
}
class Rect extends ShapeClass{
	void draw(){   //메소드 오버라이딩
		System.out.println("사각형을 그린다");
	}
}
class Tria extends ShapeClass{
	void draw(){    //메소드 오버라이딩
		System.out.println("삼각형을 그린다");
	}
}
public class AbstractTest02{
	public static void main(String args[]){
		Circ c =  new Circ();
		Rect r = new Rect();
		Tria t=  new Tria();
	
		c.draw();
		r.draw();
		t.draw();
	}
}

