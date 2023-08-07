package p2023_08_02;

class TestClass2 {
  private Object member; // Object 최상위 클래스( 모든자식을 받을수있다.)
  
  public void setValue(Object value){
    member = value;
  }
  
   public Object getValue( ){  //값을돌려줄떄 Object의 자식클래스형태로 값을돌려줌(다운캐스팅)
    return member;            //저장된값에따라 돌려줄 자료형 결정
  }                
}
class GenericTest02{  
  public static void main(String[] args) { 
   TestClass2 obj01=new TestClass2(); 
   
   //Object value = new Integer(3) 박싱 + 업캐스팅(래퍼런스 형 변환, 자동형변환)
   //Object value = 3;             자동박싱 + 업캐스팅(자식객체가 부모객체에 전달하는것)
   obj01.setValue(3);
   System.out.println("되돌리는 값은->"+obj01.getValue( ));
   
   //다운 캐스팅(object->int형) + 언박싱
   int n1 = ((Integer)(obj01.getValue())).intValue();
   //다운 캐스팅(object->ing형) + 자동 언박싱( .intValue()생략시 자동언박싱)
   int n2 = ((Integer)(obj01.getValue()));

   //Object value = new Double(3.4); 박싱 + 업캐스팅
   //Object value = 3.4;             자동박싱 + 업캐스팅
   obj01.setValue(3.4);
   System.out.println("되돌리는 값은->"+obj01.getValue( ));
   
   //다운 캐스팅(object->double형) + 언박싱
   double d1 = ((Double)(obj01.getValue())).doubleValue();
   //다운 캐스팅(object->double형) + 자동 언박싱
   double d2 = ((Double)(obj01.getValue()));

   //Object value = new String("이해할 수 있다."); 박싱+업캐스팅
   obj01.setValue("이해할 수 있다.");
   System.out.println("되돌리는 값은->"+obj01.getValue( ));

   //다운 캐스팅 
   String str = (String)obj01.getValue();
  }
}                                                                                    
