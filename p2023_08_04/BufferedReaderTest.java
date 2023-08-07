package p2023_08_04;

import java.io.*;

public class BufferedReaderTest {
    public static void main( String[] args ) {
		
	InputStream is = System.in;
	InputStreamReader isr = new InputStreamReader( is );
	BufferedReader br = new BufferedReader( isr );

	//한줄로 만들면
	/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
*/
	System.out.print( "Input Data : " );
		
	try {
	    String inputString = br.readLine(); //입력한 한줄을 모두읽음.
	    System.out.println();
	    System.out.println("Output String = " + inputString );	   
	} catch ( IOException io ) {
	    System.out.println( io.getMessage() );
	}
    }//main() end
}
