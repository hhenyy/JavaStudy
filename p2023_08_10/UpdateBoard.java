package p2023_08_10;

import java.awt.image.DataBufferDouble;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName(driver); 
			con = DriverManager.getConnection(url, "scott", "tiger"); //계정접속하면 con이 만들어짐
		                                    //getConnection은 결과를 Connection으로 돌려줌
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("수정할 글번호를 입력 하세요?");
			int no = Integer.parseInt(br.readLine());
			System.out.print("작성자명을 입력 하세요?");
			String writer = br.readLine();
			System.out.print("비밀번호를 입력 하세요?");
			String passwd = br.readLine();
			System.out.print("제목을 입력 하세요?");
			String subject = br.readLine();
			System.out.print("내용을 입력 하세요?");
			String content = br.readLine();
			
			String sql = "update board set writer=?,passwd=?,subject=?,";
			       sql+= "content=?,reg_date=sysdate where no=?";
			       
			pstmt = con.prepareStatement(sql); //sql문을 읽어와서 pstmt를 만듬
			pstmt.setString(1, writer); //값할당
			pstmt.setString(2, passwd); //값할당
			pstmt.setString(3, subject); //값할당
			pstmt.setString(4, content); //값할당
			pstmt.setInt(5, no); //값할당
			
			int result = pstmt.executeUpdate(); //update SQL문 실행// executeUpdate는 값을 int형으로 돌려줌
		    if(result ==1) {
		    	System.out.println("글수정 성공");
		    }else {
		    	System.out.println("글수정 실패");
		    	
		    }
			
		
		}catch(Exception e ) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!= null)pstmt.close();
				if(con!= null)con.close();
			}catch (Exception e ) {
				e.printStackTrace();
			}
		}

	}
}


