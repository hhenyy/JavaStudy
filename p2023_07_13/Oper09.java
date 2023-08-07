package p2023_07_13;

public class Oper09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 확장 대입 연산자
// +=, -=, *=, /=, %=
//
//	 ex) a+=b;	// a = a + b;   
//		 a-=b; 	// a = a - b;
//		 a*=b; 	// a = a * b;
//		 a/=b; 	// a = a / b;
//		 a%=b;	// a = a % b;
		
		int a=10, b=3;              //a,b 초기값 할당
		System.out.println(a+=b);   // a = a + b  13
		System.out.println(a-=b); 	// a = a - b  13-3=10
		System.out.println(a*=b);	// a = a * b  10*3=30
		System.out.println(a/=b);	// a = a / b  30/3=10
		System.out.println(a%=b);   // a = a % b  10%3=1
		
	}

}
