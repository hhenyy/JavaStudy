package p2023_08_02;

import java.util.*;
class HashTableTest02{
  public static void main(String[] args) {
	  
 //제네릭을 설정해서 Hashtable객체를 생성하고 있으며, key의 자료형은 
 //String형,value값의 자료형도 String형으로 설정되어 있다. 	
    Hashtable<String, String> ht= new Hashtable<String, String>( );
    
//  put(Object key, Object value) 
    //업캐스팅: 매개변수가 Object형일떄 
    ht.put("사과", "Apple");
    ht.put("딸기", "StrawBerry");
    ht.put("포도", "Grapes");         
 // ht.put("test", 30); //오류발생(String형만 저장할 수 있다.)        
 
    //방법1. key를 알고 있는 경우에 사용하는 방법
    
   //제네릭이 설정되어 있으면, get()메소드로 key를 이용해서 value값을
   //구해올때 Object형을 자식클래스형으로 형변환할때 자료형을 생략할수 있다.
    //Object get(Object key) 
    //다운캐스팅: 결과를 돌려주는 자료가 Object형일때 자식클래스에 저장할떄
    // 해쉬 테이블의 값을 키를 이용하여 얻는다.
    String Val = ht.get("포도"); //(String) 자료형을 생략할 수 있다.
    if(Val != null) {
      System.out.println("포도-> " + Val);
    }  
    
    //방법2. key를 모르는 경우에 사용하는 방법
    //keys():key값을 구해옴.
    //열거형(Enumeration) : 사과, 딸기, 포도 
    Enumeration<String> Enum = ht.keys();  //해쉬 테이블의 키 요소들에 대한 Enumeration 객체 반환
    while(Enum.hasMoreElements()){  //key값이 있으면 true리턴해서 while문 실행
      String  k = Enum.nextElement();  //(Stirng)생략가능
      String  v = ht.get(k);           //(Stirng)생략가능  
      System.out.println(k + " : "+ v ); 
    }
  }    
} 