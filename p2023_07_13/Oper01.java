package p2023_07_13;

public class Oper01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//산술 연산자: +,-,*,/,%(나머지)
		//int형과 int형을 산술연산을 수행하면, 결과는 int형으로 처리된다.
		int a=10, b=3, c;
		
		c=a+b;     //초기값설정하지 않으면 오류발생?
		System.out.println("a+b="+c);      //13
		System.out.println("a+b="+(a+b)); //13
		System.out.println("a-b="+(a-b)); //7
		System.out.println("a*b="+(a*b)); //30
		System.out.println("a/b="+(a/b)); //3(몫)  소수점이하버려짐. 같은 자료형의 변수를 산술연산을 수행하면 같은 자료형 처리된다.
		System.out.println("a%b="+(a%b)); //1(나머지)
	}

}
