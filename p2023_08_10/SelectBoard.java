package p2023_08_10;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class SelectBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null; // 데이터전송관련객체
		PreparedStatement pstmt = null; // SQL문 실행객체
		ResultSet rs01 = null; // select sql문실행할때만 사용 (select sql문만 결과를 Resultset 돌려주기때문)
		ResultSet rs02 = null;  //ResultSet 두개로 설정
		int count = 0; // 총데이터 갯수

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, "scott", "tiger");//계정접속하면 con이 만들어짐   //getConnection은 결과를 Connection으로 돌려줌
			
			String sql = "select count(*) from board";
			
			pstmt = con.prepareStatement(sql);  //PreparedStatement<-d뺴야함 //sql문을 읽어와서 pstmt를 만듬
			rs01= pstmt.executeQuery(); //select SQL문 실행
			
			//boolean next() : 데이터를 1개씩 가져오는 역할
			if(rs01.next()) {
				count = rs01.getInt(1);
	//			count = rs01.getInt("count(*)"); //둘중 한문장 같음
			}
			System.out.println("총 데이터 갯수:"+count);
			
			sql = "select * from board order by no desc";
			
			pstmt = con.prepareStatement(sql); 
			rs02= pstmt.executeQuery(); //select SQL문 실행
			
			//글작성 시간을 연,월,일 시분초로 출력
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E요일"); //while문이나 try문 바깥에 만들기
			
			System.out.println("번호\t작성자명\t비밀번호\t제목\t\t내용\t\t날짜");
			System.out.println("------------------------------------------------------------------------");
			
			while(rs02.next()) {
				int no = rs02.getInt("no");
				String writer = rs02.getString("writer");
				String passwd = rs02.getString("passwd");
				String subject = rs02.getString("subject");
				String content = rs02.getString("content");
				Timestamp ts= rs02.getTimestamp("reg_date");
						
				System.out.print(no+"\t"+writer+"\t"+passwd+"\t");
				System.out.print(subject+"\t\t"+content+"\t\t"+sd.format(ts)+"\n");
			
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs01!= null) rs01.close();
				if(rs02!= null) rs02.close();
				if(pstmt!= null) rs01.close();
				if(con!= null) rs01.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
 
	}
	}
}
