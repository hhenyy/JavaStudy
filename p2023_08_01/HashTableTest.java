package p2023_08_01;

import java.util.*;

class HashTableTest {
  public static void main(String[] args) {
	  
    //1. 업캐스팅 되면 참조 가능한 영역의 축소가 일어난다.
	//2. 업캐스팅 되면 부모가 상속해준 메소드만 접근 할 수 있다.
	//3.keys()메소드는 부모인 Map이 상속해준 메소드가 아니기 때문에
	//   업캐스팅 방식으로 Map객체를 생성하면 사용 할 수 없다.
    //부모인Map클래스가 상속해주는 메소드만 접근가능한데 keys()는 Hashtable클래스가 가진 메소드라 호출불가
	  
	//Map ht = new Hashtable(); //업캐스팅  
     Hashtable ht= new Hashtable();
     
     //put(Object key,Object value)
     // 해쉬 테이블에 키/데이터를 입력한다. 
	 ht.put("딸기", "StrawBerry"); //내부적 업캐스팅(object의 자식들은 다 저장가능)
     ht.put("사과", "Apple");     
     ht.put("포도", "Grapes");         
     ht.put("count",10);         

 //방법1. key를 알고 있는 경우
     // 해쉬 테이블의 값을 키를 이용하여 얻는다.
     //Object get(Object key)   //get()는 내부적으로 업캐스팅되서 Object로 자료형저장되고  Object로 결과를 돌려줌
	 // Object obj = ht.get("포도");
     String Val = (String)ht.get("포도"); //다운캐스팅
     if(Val != null) {
       System.out.println("포도-> " + Val);
     }  
     
     String s = (String)ht.get("딸기");      //다운캐스팅
     String a = (String)ht.get("사과");
     Integer it = (Integer)ht.get("count"); //다운캐스팅
     int i  = it.intValue();               //언박싱
     
     //다운캐스팅 + 언박싱 (위 두줄 한줄로작성시)
     int ii = ((Integer)ht.get("count")).intValue(); 
     
// 방법2. key를 모르는 경우
//      열거형(Enumeration) : 딸기, 사과, 포도 
     Enumeration Enum = ht.keys(); //Map의 모든 Key를 구해옴
     while(Enum.hasMoreElements()){
    //   String k = (String)Enum.nextElement();  //count값이 integer형이라 object로 구해야함.
         Object k = Enum.nextElement();
         Object  v = ht.get(k);
         System.out.println(k + " : "+ v );
     }
   }    
}                                                
