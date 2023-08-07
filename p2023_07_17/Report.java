package p2023_07_17;

import java.util.Scanner;

public class Report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 키보드를 이용해서 입력한 정수의 팩토리얼을
//		   구하는 프로그램을 작성 하세요?
//			ex) 3! = 3 * 2 * 1
//		     5! = 5 * 4 * 3 * 2 * 1
		
		System.out.println("정수입력");
		Scanner sc= new Scanner (System.in);
		int n= sc.nextInt(); 
	    int f=1;  //초기값설정

		for (int i=n;i>=1;i--) { 
			f=f*i; 
//	          1	5	
//            5 4
//           20 3
//           60 2
//           120 1
		}  System.out.println(n+"!="+f); 
			
		}
	
}
