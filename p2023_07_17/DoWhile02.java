package p2023_07_17;

public class DoWhile02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//do~while문으로 1~100까지 홀수, 짝수의 합을 구하는 프로그램 작성.
		
		int i=1, odd=0,even=0;  //초기값
		do {
			if(i%2==1) {  //홀수
				odd+=i;
			}else {
				even+=i;  //짝수
			}
			i++;           //증감식
		}while (i<=100);  //조건식
		System.out.println("홀수합"+odd);
		System.out.println("짝수합"+even);

	}

}
