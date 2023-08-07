package p2023_07_21;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 난수 발생 방법 : 1. Math.random()
//		         2. Random 클래스
		
		java.util.Random r1= new java.util.Random();
		
	//자동 import 단축기: Ctrl + Shift + 오(o)
		Random r =new Random();
		
		int n1 = r.nextInt(10); //0~9
		System.out.println("n1="+n1);
		
		//1~45 사이의 난수를 발생
		int n2 = r.nextInt(45)+1; //1~45
		System.out.println("n2="+n2);
		         
	}

}
