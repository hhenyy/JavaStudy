package p2023_07_28;

abstract class Hello{  //추상클래스
  public abstract void sayHello(String name); //추상메소드(abstract, ;붙여야함)
}
abstract class GoodBye{ //추상클래스
  public abstract void sayGoodBye(String name); //추상메소드
}

//자바에서는 클래스의 다중상속을 허용하지 않는다. (인터페이스는 가능)
//class SubClass03 extends GoodBye,Hello {  
  class SubClass03 extends GoodBye { 
  public void sayHello(String name){
      System.out.println(name+"씨 안녕하세요!");
  }
  public void sayGoodBye(String name){
      System.out.println(name+"씨 안녕히 가세요!");
  }
}
class AbstractTest03{
   public static void main(String[] args) {
     SubClass03 test= new SubClass03();
     test.sayHello(args[0]);
     test.sayGoodBye(args[0]);
   }   
}                                                       
