package p2023_08_02;

class TestClass {
  private int member; //필드 
  
  public void setValue(int value){
    member = value;        //3
  }
   public int getValue( ){  
    return member;    
  }                
}
class GenericTest01{  
  public static void main(String[] args) { 
     TestClass obj01=new TestClass();
     //private 접근제어자는 외부 클래스의 접근을 허용하지 않기 때문에
     //필드로 직접 접근 할수 없다.
  // obj01.member=30; //오류발생
     obj01.setValue(3);
     System.out.println("되돌리는 값은->" + obj01.getValue( ));
     
     obj01.setValue(3.4); //double형->int형 오류발생 (변수의자료형을 Object로하거나, 오버로딩한다)
     System.out.println("되돌리는 값은->" + obj01.getValue( ));
     
     obj01.setValue("이해할 수 있다."); //string형->int형 오류발생(변수의자료형을 Object로하거나, 오버로딩한다)
     System.out.println("되돌리는 값은->" + obj01.getValue( ));
  }
}                                                                                    
