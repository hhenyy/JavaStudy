package p2023_07_18;

import java.util.Scanner;

public class FatorialEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, f=1;  //곱셈은 1로 초기값설정, 덧셈은 0으로 초기값설정
		System.out.print("정수를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=n; i>=1; i--){
			f = f * i;      // f *= i;
		}
		System.out.println(n+"!="+f);	
	}

}
