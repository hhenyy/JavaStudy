package p2023_07_28;

interface IHello04{  //부모 인터페이스
  public abstract void sayHello(String name); //추상 메소드 //인터페이스에서는 public abstract생략가능
}                                                        //생략가능이유 인터페이스는 상수와 추상메소드를 가지기때문
abstract class GoodBye04{ //부모 추상 클래스
  public abstract void sayGoodBye(String name); //추상 메소드 //추상 클래스에서는 public abstract생략가능
}                                                    //생략불가이유 추상 클래스는 일반메소드도 가질수있기때문에 구분하기위해

//클래스와 인터페이스를 동시에 상속을 받을때는 클래스를 먼저 상속을 받고, 그런 다음에
//인터페이스를 나중에 상속을 받아야 한다.(상속받는 순서가 바뀌면 오류가 발생한다.)
class SubClass04 extends GoodBye04 implements IHello04 {
  public void sayHello(String name){
    System.out.println(name+"씨 안녕하세요!");
  }
  public void sayGoodBye(String name){
    System.out.println(name+"씨 안녕히 가세요!");
  }
}
class AbstractTest04{
  public static void main(String[] args) {
	  SubClass04 test= new SubClass04();
    test.sayHello("홍길동");
    test.sayGoodBye("이순신");
  }   
}                          