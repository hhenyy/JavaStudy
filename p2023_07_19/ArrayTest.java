package p2023_07_19;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max, min;
		int[] s = new int[5];      
//		max = s[0];
//		min = s[0];        <- //max,min값은 키보드로 방에 입력값저장후에 설정해야함, 초기값이 0일때설정하면 min값이 0으로나옴

		
		
		System.out.print("정수 5개를 입력 하세요?");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < s.length; i++) {
			s[i] = sc.nextInt();             //입력값을 s배열에 배열하고 저장하는 for문
		}
		max = s[0]; 
		min = s[0];   //max,min값은 키보드로 방에 입력값저장후에 설정해야함, 초기값이 0일때설정하면 min값이 0으로나옴
		for (int i = 1; i < s.length; i++) {
			if (max < s[i]) max = s[i];
			if (min > s[i]) min = s[i];
		}
		System.out.println("max=" + max);
		System.out.println("min=" + min);
	}

}
