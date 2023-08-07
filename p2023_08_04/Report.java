package p2023_08_07;

//과제. 
//키보드로 입력한 문장을 파일(result.txt)로 저장하는 
//프로그램을 작성하세요?	

import java.io.*;

public class Report {
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
	    
	    FileWriter fw = new FileWriter( "result.txt" );
			fw.write( inputString ); // 다른 파일에 쓰는 부분 //
			br.close();
		    fw.close();
	    } catch ( IOException io ) {
	    System.out.println( io.getMessage() );
	}
    }//main() end
}

