package p2023_07_24;

public class SubstringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//아래와 같은 주민번호가 있을때, 남자인지 여자인지를 판별하는 프로그램을 작성하세요.
//substring과 charAt 2가지 사용 가능하지만 일반적으로 substrint을 많이씀
		
		String jumin = "950101-22345"; // 1,3= 남자 2,4= 여자

		// 인덱스 번호 7번추출
		String gender = jumin.substring(7, 8);

//		if (string j==2 && j==4 ) {   //값비교시에는 equals사용
//			System.out.println("여자" );
//			else {
//				System.out.println("남자" );

		if (gender.equals("1") || gender.equals("3")) {
			System.out.println("남자 ");
		}else if (gender.equals("2") || gender.equals("4")){
			System.out.println("여자 ");
		}else {
			System.out.println("잘못된 정보입니다.");

	    }
		char c = jumin.charAt(7);
		if(c=='1'|| c=='3') {
			System.out.println("남자");
		}else if(c=='2'||c=='4') {
			System.out.println("여자");
		}else {
			System.out.println("잘못된 정보 입니다.");
		}


	}
}
