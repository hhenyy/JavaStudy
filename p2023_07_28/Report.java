package p2023_07_28;

//과제.
//키보드를 통해서 연도(ex) 2023)를  입력 받는다.
//이때 입력 받은 연도가 윤년인지 평년인지를 판별하는 
//프로그램을 작성하세요? 
//(윤년의 정의를 이용해서 프로그램을 작성하세요?) 

//1년 365.242374
//평년 = 365일 (2월달 - 28일까지)
//윤년 = 366일 (2월달 - 29일까지)
//
//* 윤년의 정의
//
//1. 해당 연도를 4로 나누어 떨어지면 윤년 
//
//2. 그 중에서 100으로 나누어 떨어지면 윤년이 아님 
//
//3. 그 중에서 400으로 나누어 떨어지면 윤년

import java.util.Scanner;

public class Report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		System.out.println("연도를 입력하세요");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		if(n%4==0) {
			if(n%100==0) {
			System.out.println("윤년이 아님");
			}
			else if(n%400==0){
			System.out.println("윤년");
			}else {
				n%100!=0 || n%400!=0;
			}
		}else {
		System.out.println("윤년이 아님");
	
	}
	}
}
