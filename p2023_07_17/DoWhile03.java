package p2023_07_17;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner sc= new Scanner(System.in);
		String input;       //string class 주소값이나 값들끼리 비교
		
		do { 
			System.out.println(">");
			input= sc.nextLine();
			System.out.println("입력문자:"+input);
			
		}while(!input.equals("q"));        //equals 메소드 // i <-not 연산// input에 저장된 문자와 q와 같지 않으면 false지만 !로인해 true가됨. do실행문 반복
//      while (!"oracle".equals("q"))  //! false->ture  :loop문이 계속 실행된다.
//      while (!"q".equals("q"))       //! ture->false  :loop문을 빠져 나온다.
		
		System.out.println("프로그램종료");
		sc.close();
		
	}

}
