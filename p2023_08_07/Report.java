package p2023_08_07;

import java.io.File;

public class Report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		    // File 객체 생성
			// c:/java01/temp 폴더가 생성되고, 현 위치 하위에 
			//  test폴더가 생성됨 (선언만한것)
		    File temp = new File( "C:/java01", "temp" ); //절대경로
		  //  File tempFile = new File( "test" );         //상대경로

		    // 디렉토리 생성(mkdirs()는 디렉토리를 만들면 true를 
			// 반환함)//디렉토리(폴더)가 만들어진것//mkdirs()<-폴더를 만드는 메소드
		    System.out.println( "create directory state : " + temp.mkdirs() );
	     // System.out.println( "create directory state : " + tempFile.mkdirs() );

		    // 2.비어있지 않는 디렉터리 삭제(과제)
			 // 파일클래스로들어가서 지원메소드로 그 메소드는 일차원배열형태를 루핑해서 삭제후 비어있는
			  //디렉토리는 delete()로 지우면 됨.
		    File file[] = temp.listFiles();
		    
		    for(int i=0; i<file.length;i++) {
		    	file[i].delete();
		    			    
		    }
		  //3. 자식 디렉토리 삭제 //temp디렉토리 삭제됨
		    temp.delete();
		  //4. 부모 디렉토리 삭제 //c:/java01 디렉토리 삭제됨
		    temp.getParentFile().delete();
			    
		
		
	        } catch ( Exception e ) {
		}
	    }
	


	}


