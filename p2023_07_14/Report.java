package p2023_07_14;

import java.util.Scanner;

public class Report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		과제.
//	      1.
//	      키보드로 3개의 정수를 입력 받았을때 최대값과
//	      최소값을 구하는 프로그램을 작성 하세요?
//	      (단, 조건 연산자를 활용해서 작성하세요.)

		System.out.print("3개의 정수를 입력 하세요?");
		int n1, n2, n3, max, min;

		Scanner sc = new Scanner(System.in);      //키보드를 입력받기위한 class는 여러개, 그중 가장 가장 쉽게 입력받을 수있는 scanner
		n1 = sc.nextInt(); // n1=20;              // scanner는 import해야한다. 파이썬은 함수로 되어있고 자바는 class로 되어있음.
		n2 = sc.nextInt(); // n2=10;                //생성자는 객체를 생성함 // nextInt
		n3 = sc.nextInt();

		// 최대값
		max = (n1 > n2) ? n1 : n2;
		max = (max > n3) ? max : n3;		
//		max = (n1>n2 && n1>n3) ? n1 : (n2>n3) ? n2: n3;
		
		
		// 최소값		
		min = (n1 < n2) ? n1 : n2;
		min = (min < n3) ? min : n3;		
//		min = (n1<n2 && n1<n3) ? n1 : (n2<n3) ? n2: n3;
		
		System.out.println("max=" + max);
		System.out.println("min=" + min);		
		
	}

}
