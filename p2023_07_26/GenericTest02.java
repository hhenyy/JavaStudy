package p2023_07_26;

class TestClass {
  private Object member;
  public void setValue(Object value){
    member = value;
  }
   public Object getValue( ){  
    return member;    
  }                
}
class GenericTest02{  
  public static void main(String[] args) { 
   TestClass obj01=new TestClass();
   
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
