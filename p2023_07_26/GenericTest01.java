package p2023_07_26;

class TestClass2 {
  private Object member; //필드             Object 최상위 클래스( 모든자식을 받을수있다.)
  
  public void setValue(Object value){
    member = value;        //3
  }
   public Object getValue( ){  
    return member;    
  }                
}
class GenericTest01{  
  public static void main(String[] args) { 
     TestClass2 obj01=new TestClass2();
     //private 접근제어자는 외부 클래스의 접근을 허용하지 않기 때문에
     //필드로 직접 접근 할수 없다.
  // obj01.member=30; //오류발생
     obj01.setValue(3);
     System.out.println("되돌리는 값은->" + obj01.getValue( ));
     
     obj01.setValue(3.4);
     System.out.println("되돌리는 값은->" + obj01.getValue( ));
     
     obj01.setValue("이해할 수 있다.");
     System.out.println("되돌리는 값은->" + obj01.getValue( ));
  }
}                                                                                    
