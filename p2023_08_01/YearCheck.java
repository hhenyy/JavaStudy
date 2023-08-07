package p2023_08_01;
//
//과제.
//키보드를 통해서 연도(ex) 2023)를  입력 받는다.
//이때 입력 받은 연도가 윤년인지 평년인지를 판별하는 
//프로그램을 작성하세요?
//(단, GregorianCalendar 클래스를 이용해서 처리 하세요.)

//1년 365.242374
//평년 = 365일 (2월달 - 28일까지)
//윤년 = 366일 (2월달 - 29일까지)

import java.util.*;

public class YearCheck {

	public static void main(String[] args) {
		System.out.print("연도를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
//		업캐스팅이 되면 부모가 상속해준 메소드만 호출할 수 있다.
//		Calendar y = new GregorianCalendar();  // 업캐스팅
		GregorianCalendar y = new GregorianCalendar();

		if (y.isLeapYear(year)) {
			System.out.println(year + "은 윤년입니다");
		} else {
			System.out.println(year + "은 평년입니다");
		}

	}

}
