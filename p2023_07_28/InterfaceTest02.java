package p2023_07_28;

 interface IHello02{ //부모 인터페이스
  public abstract void sayHello(String name); //추상 메소드
}
interface IGoodBye02{ //부모 인터페이스
  public abstract void sayGoodBye(String name); //추상 메소드
}
//두 인터페이스로부터 상속을 받는 클래스 설계 : 인터페이스의 다중상속
//1.자바에서는 인터페이스의 다중 상속을 허용한다.
//2.인터페이스 2개를 상속 받을때 상속받는 순서는 바껴도 상관없다.
class SubClass02 implements IHello02, IGoodBye02{
  public void sayHello(String name){
     System.out.println(name+"씨 안녕하세요!");
  }
  public void sayGoodBye(String name){
     System.out.println(name+"씨 안녕히 가세요!");
  }
}
class InterfaceTest02{
  public static void main(String[] args) {
    SubClass02 test= new SubClass02();
    test.sayHello("홍길동");   // 메소드 오버라이딩 된 메소드가 호출
    test.sayGoodBye("이순신"); // 메소드 오버라이딩 된 메소드가 호출
  }   
}         