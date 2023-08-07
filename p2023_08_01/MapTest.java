package p2023_08_01;

//iv. Map 인터페이스  - HashMap, HashTable (상속받는 클래스)
//1. 여러가지 자료형의 Data를 모두 저장할 수 있다.
//  ex) int, double, char, boolean, String etc
//2. Data를 저장할 때 Key, Value 를 동시에 저장한다.
//3. key 값은 중복이 되면 안된다.
//   만약에 중복된 key가 있으면, 가장 마지막에 설정된 value만 사용할 수 있다.
//4. value값은 중복이 되어도 상관없다.	


import java.util.*;

public class MapTest {
    public static void main( String[] args ) {
    	//Map은 인터페이스이기 때문에 자체적으로 객체 생성을 할 수 없다.
    	//Map m = new Map();  //오류발생
    	
        //HashMap 객체 생성
		Map hm = new HashMap();  //업캐스팅
   //   HashMap hm = new HashMap(); //자식클래스로 객체생성
		
        //키와 데이터 쌍을 삽입
		//put(Object key, Object value) 
        hm.put( "woman", "gemini" ); //내부적 업캐스팅 
        hm.put( "man", "johnharu" );
        hm.put( "age", new Integer(10) );
        hm.put( "city", "seoul" );
        hm.put( "city", "busan" );
        //중복된 key가 있으면, 가장 마지막에 설정된 value만 사용
        
        //HashMap에 있는 객체들을 출력
        System.out.println( hm );
        
        //키 값만 출력
        System.out.println( hm.keySet() );
        
        //키를 이용해 해당 데이터를 출력
        //Object get(Object key)
        System.out.println( hm.get( "woman" )); 
        System.out.println( hm.get( "city" ));
    }
}        
         
         
        