package p2023_07_14;

import java.util.Scanner;

public class Report1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.키보드로 정수 3개를 입력 받았을때, 최대값과 최소값을 구하는 프로그램을 작성하세요?
//단, if else구문으로 작성하세요. (elseif도 가능)
		int n1, n2, n3, max, min;
		System.out.println("정수 3개를 입력하시오");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if (n1 >= n2 && n1 >= n3) {
			max = n1;
		} else if (n2 >= n1 && n2 >= n3) {
			max = n2;
		} else {
			max = n3;
		}
		if (n1 <= n2 && n1 <= n3) {
			min = n1;
		} else if (n2 <= n1 && n2 <= n3) {
			min = n2;
		} else {
			min = n3;
		}
		
		System.out.println("max="+max);
		System.out.println("min="+min);
	}

}
