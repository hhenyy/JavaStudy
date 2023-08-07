package p2023_07_13;

import java.util.Scanner;

public class Oper06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       조건 연산자
	    
//	    변수 = (조건식) ?  값1 :  값2;
//	    조건식이 참이면 값1을 변수에 할당하고,
//	    조건식이 거짓이면 값2를 변수에 할당한다.
		
// 키보드로 입력한 2개의 정수 중에서 최대값과 최소값을 구하는 프로그램을 작성하세요
		
		int n1, n2, max, min;        //변수선언
		System.out.println("정수 2개를 입력 하세요?");
		
		Scanner sc= new Scanner(System.in);
	    n1=sc.nextInt();  //스페이스바 or 엔터키로 구분함  10
		n2=sc.nextInt();  //스페이스바 or 엔터키로 구분함  20
		
		max= (n1>n2)? n1:n2;  //최대값  //조건연산자 /n1이n2보다 작기때문에 false이면 값2인 20이 max값
		min= (n1<n2)? n1:n2;  //최소값  //n1이n2보다 작기때문에 true이면 값1인 n1 10이 min값
		
		System.out.println("max:"+max);  
		System.out.println("min:"+min);
		
	}

}
