package p2023_07_14;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//키보드로 정수 2개를 입력 받았을때, 최대값과 최소값을 구하는 프로그램을 작성하세요.
		
		int n1, n2, max, min;   //변수선언
		System.out.println("정수 2개를 입력 하세요.");
		Scanner sc = new Scanner (System.in);
		n1=sc.nextInt();     //Scanner에서 정수 입력받을때 nextInt // 스페이스바 or 엔터키로 구분함
		n2=sc.nextInt();     //ex) nextdouble(), nextLine() <-nextLine은 문자 입력시
		
		if(n1>n2) {
			max=n1;
			min=n2;
		}else {
			max=n2;
			min=n1;
		}
		System.out.println("max="+max);
		System.out.println("min="+min);

			
	}

}
