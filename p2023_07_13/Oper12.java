package p2023_07_13;

import java.util.Scanner;

public class Oper12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       조건 연산자
	    

		
		int n1, n2, n3, max, min;        //변수선언
		System.out.println("정수 3개를 입력 하세요?");
		
		Scanner sc= new Scanner(System.in);
	    n1=sc.nextInt(); 
		n2=sc.nextInt();  
		n3=sc.nextInt();   
		
		max= (n1>n2)? n1:n2 ;  
		max= (max>n3)? max:n3 ;  
		min= (n1<n2 )? n1:n2 ;  
		min= (min<n3 )? min:n3 ; 
		
		System.out.println("max:"+max);  
		System.out.println("min:"+min);
		
	}

}
