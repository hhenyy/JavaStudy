package p2023_08_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = null; //Connection객체//데이터베이스 연결 객체
		PreparedStatement pstmt = null; //PreparedStatement객체//SQL문(select,delete,insert,update)을 실행 시켜주는 객체
		
		String driver = "oracle.jdbc.driver.OracleDriver"; 
		String url = "jdbc:oracle:thin:@localhost:1521:xe";//localhost<-ip주소/ 1521 <-port넘버 /ip주소로 접근해서 port넘버로 비교해서 둘이맞아야 소켓연결됨
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
	
		try {
			//db처리할떄 공통적으로사용해야할 문장 +예외처리도해야함.
			Class.forName(driver); //JDBC Driver Loading//driver로 들어감. 
			con= DriverManager.getConnection(url,"scott","tiger"); //오라클 계정에 접속 .url주소,scott계정,tiger비번.지정된곳에 들어감.
			                                                   //getConnection메소드로 xe데이터베이스 접속후 connection리턴
			                                                  //DriverManager<-클래스이름
			                                                  //계정접속하면 con이 만들어짐
			System.out.println("작성자명을 입력 하세요");
		    String writer = br.readLine();
		    System.out.println("비밀번호를 입력 하세요");
		    String passwd = br.readLine();
		    System.out.println("제목을 입력 하세요");
		    String subject = br.readLine();
		    System.out.println("내용을 입력 하세요");
		    String content = br.readLine();
			
			
		    String sql = "insert into board "; 
		           sql+= "values(board_seq.nextval,?,?,?,?,sysdate)"; //sysdate 현재의시각 천분의일초단위까지//오라클에서 지원되는 함수 sysdade (괄호없음)
		                                                              //Timestamp만들지 않고 사용할수잇음.
		           pstmt = con.prepareStatement(sql); //prepareStatement()<- sql문(select,delete,insert,update)을 오라클에 전송하는 메서드
		           pstmt.setString(1,writer);
		           pstmt.setString(2,passwd);
		           pstmt.setString(3,subject);
		           pstmt.setString(4,content);
		           
		           int result = pstmt.executeUpdate();//insert SQL문 실행
		           if(result==1) {
		        	   System.out.println("글작성 성공");
		           }else {
		        	   System.out.println("글작성 실패");
		           }
		           
		}catch(Exception e ) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
