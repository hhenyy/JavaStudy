package p2023_07_25;

import java.util.Scanner;

public class JuminCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//키보드로 주민번호를 입력 받아서 남자인지, 여자인지를 판별하는 프로그램을 작성하세요.
//단, 주민번호 앞자리 6자리, 뒷자리는 7자리 인지를 유효성 검사를 한다.
		
		Scanner sc = new Scanner(System.in);
	
    try { 
		System.out.println("주민번호 앞자리를 입력 하세요.");
		String jumin1= sc.nextLine(); //length,substring 등 string class로 지원되는 메소드 사용하려면 문자형태로 입력 받아야해서 nextLine과 String사용
		System.out.println("주민번호 뒷자리를 입력 하세요.");
		String jumin2= sc.nextLine(); //jumin2="1234567"
		
		String g= jumin2.substring(0, 1); //index번호 0번부터 시작해서 0번추출
		                        //주민 뒷자리 입력 안했을때 추출하지못하여 예외발생 ->catch로 예외값 던짐. //try{}catch(Exception e)사용
		//if else문 조건충족시 빠져나감.
		if (jumin1.equals("")) {  // null인 경우
			System.out.println("주민번호 앞자리를 입력 하세요");
		}else if(jumin1.length()!=6) {
			System.out.println("주민번호 앞자리 6자리를 입력하세요");
		}else if(jumin2.equals("")) {
			System.out.println("주민번호 뒷자리를 입력 하세요.");
		}else if(jumin2.length()!=7) {
			System.out.println("주민번호 뒷자리 7자리를 입력하세요");
		}else if(g.equals("1")||g.equals("3")){
			System.out.println("남자 입니다.");
		}else if(g.equals("2")||g.equals("4")){
			System.out.println("여자 입니다.");
		}else {
			System.out.println("똑바로 입력하세요.");
		}
		
	}catch(Exception e) {
		System.out.println("잘못된 정보 입니다.");
	}
	}

}
