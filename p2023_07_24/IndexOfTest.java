package p2023_07_24;

//indexOf(): 특정 문자의 인덱스 번호를 구해주는 메소드

public class IndexOfTest {
	public static void main( String[] args ) {
		
	String message = "Java program creates many objects.";

	//가장 먼저 나오는 'a'의 인덱스 번호를 구해준다.
	int index1 = message.indexOf( 'a' );  //1
	// 10진수 아스키코드값(97)에 해당되는 문자('a')의 인덱스 번호를 구한다.
	int index2 = message.indexOf( 97 );  //1

	System.out.println( index1 );
	System.out.println( index2 );

	//index번호 13번째 이후에서 a의 인덱스 번호를 구해준다.
	int index3 = message.indexOf( 'a', 13 ); //16
	System.out.println( index3 );
	
    // 가장 먼저 나오는 'av'의 인덱스 번호를 구해준다.
	int index4 = message.indexOf( "av" ); //1
	System.out.println( index4 );

	//index번호 12번째 이후에서 av의 인덱스 번호를 구해준다.
	int index5 = message.indexOf( "man", 12 );
	System.out.println( index5 );

	//찾는 문자가 없을 경우에는 -1을 리턴한다.
	int index6 = message.indexOf( "java" );
	System.out.println( index6 );
    }
}



