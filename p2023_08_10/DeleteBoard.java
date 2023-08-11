package p2023_08_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import p2023_08_03.UserExceptionTest;

public class DeleteBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
   
		Connection con = null;
		PreparedStatement pstmt= null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName(driver);//가장먼저할것
			con= DriverManager.getConnection(url, "scott", "tiger");
			
			BufferedReader br= 
					new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("삭제할 글 번호를 입력 하세요.");
			int no =Integer.parseInt(br.readLine()); //숫자로 형변환 하지않으면 예외발생
		
			String sql = "delete from board where no=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			int result = pstmt.executeUpdate(); //delete SQL문 실행
			if 
			(result==1) {
				System.out.println("글 삭제 성공");
			}else {
				System.out.println("글 삭제 실패");
			}
			
		}catch(Exception e) {
	//		e.printStackTrace();
			System.out.println("숫자만 입력 하세요.");
		}finally {
			try {
				if(pstmt!= null) pstmt.close();
				if(con!= null) con.close();
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		

	}

}
