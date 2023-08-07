package p2023_07_28;

interface IHello06{  
  int a=10;
  public abstract void sayHello(String name);
}
interface IGoodBye06{
  public abstract void sayGoodBye(String name);
}
interface ITotal06 extends IHello06, IGoodBye06{
  public abstract void greeting(String name);
}

class SubClass06 implements ITotal06{
  public void sayHello(String name){
    System.out.println(name+"씨 안녕하세요!");
  }
  public void sayGoodBye(String name){
    System.out.println(name+"씨 안녕가세요!");
  }
  public void greeting(String name){
    System.out.println(name + ", 안녕!");
  }
}

class AbstractTest06{
  public static void main(String[] args) {
    SubClass06 test= new SubClass06();
    test.sayHello("홍길동");
    test.sayGoodBye("홍길동");
    test.greeting("홍길동");
    
    System.out.println("a="+IHello06.a); //<-static이 생략된 정적필드여서 클래스명.상수로 호출가능
    //IHello06.a=30; //a는 final이 생략되 상수이기 때문에 값을 수정할 수 없다.
  }
}         