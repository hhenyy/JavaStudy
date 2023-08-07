package p2023_07_27;
//과제   
//
//1.  반지름(r)이 5인 경우에 다음을 구하는 프로그램을 작성 하세요.
//    (단, 결과는 소숫점 2째자리 까지 결과가 나타나도록 해야함)
//         DecimalFormat 클래스를 이용 해서 해결 하세요.
//
//    원주(원둘레) = 2 * PI * r
//    원의 면적 =  PI * r * r
//    구의 표면적 = 4 * PI * r * r
//    구의 체적(부피) = 4/3 * PI * r * r * r

import java.text.DecimalFormat;

public class Roport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//class명.PI(필드명) <-PI는 정적필드라서  // 정적필드가아니면 객체생성해서 객체명.필드명 (메소드도같음)
		int r=5;
		double a= 2 * Math.PI * r;
		double b= Math.PI * r * r;
		double c=  4 * Math.PI * r * r;
		double d= 4/3 * Math.PI * r * r * r;
				
		DecimalFormat m =new DecimalFormat();
		m.applyPattern("#,###.00");
		
		
		System.out.println("원주(원둘레) ="+ m.format(a));   
		System.out.println("원의 면적 ="+m.format(b));
		System.out.println("구의 표면적 ="+ m.format(c));
		System.out.println("구의 체적(부피) ="+ m.format(d));
	}

}
