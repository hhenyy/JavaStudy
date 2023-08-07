package p2023_07_25;

public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int형 변수의 최대값과 최소값
		System.out.println("max="+Integer.MAX_VALUE);//max=2147483647
		System.out.println("max="+Integer.MIN_VALUE);//max=-2147483648

		//String형을 int형으로 형변환 : "20" -->20
		int n = Integer.parseInt("20"); //반드시 기억할 식
		System.out.println(n);    //20 : 정수
		System.out.println(n+10); //30 : 산술연산 가능함
		
		//parseInt()메소드 안에는 숫자로 형변환이 가능한 문자만 사용해야 한다.
	//	int n2 = Integer.parseInt("a"); //a라는 문자는 형변환 되지않아서 오류발생
		
		//10진수를 2진수로 변환
		System.out.println("2진수:"+Integer.toBinaryString(10));

		//10진수를 8진수로 변환
		System.out.println("8진수:"+Integer.toOctalString(10));

		//10진수를 16진수로 변환
		System.out.println("16진수:"+Integer.toHexString(10));
		
		//Integer in = new Integer(); //매개변수가 int형이나 string형이 있어야함.
	}

}
