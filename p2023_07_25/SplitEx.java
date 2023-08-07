package p2023_07_25;

import java.util.StringTokenizer;

public class SplitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //String[] split(String regex)       
		
		String jumin = "950101-1234567";
		
		//방법1.StringTokenizer
		StringTokenizer st = new StringTokenizer(jumin,"-");
		String j1 = st.nextToken();
		String j2 = st.nextToken();
		System.out.println("주민번호 앞자리:"+j1);
		System.out.println("주민번호 뒷자리:"+j2);

		//방법2. split() 쓰기 더 편해서 다루기수월하여 더많이씀
		String[] j = jumin.split("-");
		System.out.println("주민번호 앞자리:"+j[0]);
		System.out.println("주민번호 뒷자리:"+j[1]);
		for(int i=0;i<j.length; i++) //기본 for문
			System.out.println(j[i]);
		
		for(String s: j)     //향상된 for문  (값을받는 변수 s, 배열j) s<-j
			System.out.println(s);
		
		String tel = "010-1234-5678";
		String [] t = tel.split("-");
		System.out.println("전화번호 앞자리:"+t[0]);    //010
		System.out.println("전화번호 중간자리:"+t[1]);  //1234
		System.out.println("전화번호 끝자리:"+t[2]);    //5678
		
		String email = "totoro@naver.com";
		String[] e = email.split("@");     //변수 email.split
		System.out.println("아이디"+e[0]);  //totoro
		System.out.println("도메인"+e[1]);  //naver.com
		
		
	}

}
