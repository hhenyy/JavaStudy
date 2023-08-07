package p2023_07_18;

import java.util.Scanner;

public class Report01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		과제.
//	       1.키보드를 이용해서 정수 5개를 입력 받은후 int형
//	         배열에 저장한다. 이때 배열에 저장된 값중에서
//	         최대값과 최소값을 구하는 프로그램을 작성하세요?
//입력값 3 +더블형변환후 최대최소값 4	/.변수의 초기화 문제 발생 참고/ 입력을 포문으로쓰고 비교포문따로
	       
			int[]data = new int[5];
			
			System.out.println("5과목 점수 입력");
			Scanner sc = new Scanner (System.in); //입력한 점수값이 방에 저장됨./
			                                      //배열에 저장하는 방법(변수를 여러개저장하는게 배열)
			
			
			int max, min;	
			for(int i=0; i<data.length; i++) {  // 왜 for문 써야하는지? 배열의 값을 출력해야해서?
			data[i]=sc.nextInt();  //<- syso 를 여러번 안써도되서?
			} 
			
			max= data[0]; // data 0번방의 값을 max변수로 초기값설정
			min= data[0];  //data 0번방의 값을 min변수로 초기값설정
		                         
		  
		   for(int i=0; i<data.length; i++) { //<-0번방이 0번과 비교필요는 없어서 i=1로 해도됨//
			   if(data[i]>max) max= data[i];
			   if(data[i]<min) min= data[i];
		   }
		       System.out.println("max:"+max);  //max:13.6
		       System.out.println("min:"+min);  //min:7.0
		
	}
}
