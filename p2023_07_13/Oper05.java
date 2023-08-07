package p2023_07_13;

import java.util.Scanner;

public class Oper05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("정수 2개를 입력 하세요");
		
		// 표준입력 장치인 키보드로 입력을 받는 경우에 Scanner객체를 생성
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();  //스페이스바 or 엔터키로 구분함
		int n2 = sc.nextInt();  
		System.out.println("n1:"+n1);
		System.out.println("n2:"+n2); 
		
		if(n1>n2) {   //조건식이 참이면 if문 아래쪽을 실행
			System.out.println(n1+"이"+n2+"보다 크다");
		}else {        //조건식이 거짓이면 else문 아래쪽을 실행
			System.out.println(n2+"이"+n1+"보다 크다");
			
		}
		

	}

}
