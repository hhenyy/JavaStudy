package p2023_07_25;
//과제. 내가푼 오답
//1. 키보드를 통해서 주민번호를 입력 했을때 유효한 
//   주민번호 인지 아닌지를 판별하는 프로그램을 작성 
//   하세요?
//   (단, 유효하지 않은 주민번호의 경우에는 메시지를 출력)
//
//1. 주민번호 앞자리 6자리가 아니면 메시지 출력
//2. 주민번호 뒷자리 7자리가 아니면 메시지 출력
//3. 유효한 주민번호 아니면 메시지 출력

import java.util.Scanner;

public class Report {
	
//	public static boolean jumin();
	//메소드 만들어서 매개변수 이용해서 처리 (boolean)형으로 결과값 반환

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
    try { 
		System.out.println("주민번호 앞자리를 입력 하세요.");
		String jumin1= sc.nextLine(); //length,substring 등 string class로 지원되는 메소드 사용하려면 문자형태로 입력 받아야해서 nextLine과 String사용
		System.out.println("주민번호 뒷자리를 입력 하세요.");
		String jumin2= sc.nextLine(); //jumin2="1234567"
//		StringBuffer jumin2 = new StringBuffer(jumin1);  //문자 합치기
//		StringBuffer jumin2 = jumin1.append(jumin2);
		
	//	String g= jumin2.substring(i, i+1); //index번호 0번부터 시작해서 0번추출
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
		
			

//		}else {
//			System.out.println("똑바로 입력하세요.");
		}
	      String g= jumin2.substring(i, i+1);  //추출
	      int n = Integer.parseInt("g");                                   //형변환
	      String [] m = new String[]  //배열
	      for ( int i =0; i<g.length; i++)  //반복
	    		sum+=g[i]*(g+2)     //곱하기,합하기
	    		sum/11=m
	    		m%
		
	}catch(Exception e) {
		System.out.println("유효한 주민번호가 아닙니다.");
	}
  //곱하기작업은 for문, int형 배열, 
	


//    		
	}
	
}

//힌트
//문자 결합후  루프로 문자로 입력하고 substring으로 추출후 정수형으로 형변환 int n =Integer.parseInt(");
// 곱하기 한다