package p2023_07_31;

import java.util.GregorianCalendar;
import java.util.Scanner;

//과제.
//키보드를 통해서 연도(ex) 2023)를  입력 받는다.
//이때 입력 받은 연도가 윤년인지 평년인지를 판별하는 
//프로그램을 작성하세요?
//(단, GregorianCalendar 클래스를 이용해서 처리 하세요.)
//
////1년 365.242374
////평년 = 365일 (2월달 - 28일까지)
////윤년 = 366일 (2월달 - 29일까지)
//
//
//GregorianCalendar 클래스에 윤년or평년 구하는 메소드 있음.


public class Report02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("년도 입력");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		GregorianCalendar c= new GregorianCalendar(); //정적메소드,정적필드가아니면 객체생성해서 메소드호출		
		if (c.isLeapYear(year)) {  //isLeapYear는GregorianCalendar클래스의 메소드인데 업캐스팅하면 부모메소드만 호출가능해서 불가
			System.out.println("윤년");         
		}else
			System.out.println("평년");
		

	}



}
