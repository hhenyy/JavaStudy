package p2023_07_25;

public class InsertStringBuffer {
    public static void main( String[] args ) {
	StringBuffer sb1 = new 
			      StringBuffer("gemini is beautiful" );
	System.out.println( sb1 );

	sb1.insert( 10, "very" ); //지정된위치에 삽입 ,b가10번위치
	System.out.println( sb1 );

	sb1.insert( 0, 1004 );
	System.out.println( sb1 );
    }
}
