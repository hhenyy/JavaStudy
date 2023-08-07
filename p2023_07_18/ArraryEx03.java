package p2023_07_18;

import java.util.Scanner;

public class ArraryEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드로 5과목의 점수를 입력 받아서, 총점과 평균을 구하는 프로그램작성
		
		int[]s= new int[5];
		
		System.out.println("5과목 점수 입력");
		Scanner sc = new Scanner (System.in); //입력한 점수값이 방에 저장됨./
		                                      //배열에 저장하는 방법(변수를 여러개저장하는게 배열)
		int sum=0;
		for(int i=0; i<s.length; i++){
			s[i]=sc.nextInt();   //배열에 저장하는 방법(변수를 여러개 저장하는게 배열)
		    sum+=s[i];  //sum=sum+s[i];
		}
		double avg = sum/5.0; // <-sum이 int형이라 double형으로 출력위해 5.0으로
		System.out.println("총점:"+sum);
		System.out.println("평균:"+avg);
		
//		n1=sc.nextInt();    <- 변수에 저장하는방법, 입력값이 많아지면 코드가 많아져서 배열로 처리하면 코드가 간결해짐.
//		n2=sc.nextInt();
//		n3=sc.nextInt();
//		n4=sc.nextInt();
//		n5=sc.nextInt();
//		int[]s= new int {n1,n2,n3,n4,n5}

	}

}
