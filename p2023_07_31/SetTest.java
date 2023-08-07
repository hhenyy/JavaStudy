package p2023_07_31;

// HashSet과 Date 클래스가 있는 패키지를 임포트
import java.util.*;

public class SetTest {
    public static void main( String[] args ) {
    
        // HashSet 클래스의 객체 생성
		Set hs = new HashSet();  //업캐스팅 상속해준 메소드만 사용가능
//      HashSet hs = new HashSet(); //하위 클래스로 객체생성도가능,상속받은 메소드 상속해준 메소드둘다 사용가능
        
	   //boolean add(Object e)
        // hs 객체에 데이터 객체 보관
        hs.add( "gemini" );  //업캐스팅
        hs.add( "johnharu" );
//		Date d=new Date();
//      hs.add( d );
	    hs.add( new Date() ); 

        // hs 객체가 보관하고 있는 데이터 객체 출력
        System.out.println( "hs의 내용 : " + hs );
        
        // "johnharau" 데이터 객체를 hs 객체에서 제거
        hs.remove( "johnharu" );
        System.out.println( "hs의 내용 : " + hs );
        
        // hs 객체에 있는 데이터 개체의 갯수를 출력
        System.out.println("hs의 데이터 갯수" + hs.size()); //2
    }
}            