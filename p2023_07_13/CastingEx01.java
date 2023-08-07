package p2023_07_13;
//p78
//정수 타입의 연산
//서로 다른 자료형의 변수를 산술연산을 수행하면 큰자료형으로 자동 형변환 된다.
public class CastingEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte Value1=10;  //1byte
		int Value2= 100; //4byte
		long Value3= 1000L; //8byte
		long result= Value1+Value2+Value3; 
		System.out.println(result);
		
		int i =100;
		double d= 3.14;
		double result1 = i +d;
		System.out.println(result1);
		
		//1.같은 자료형의 변수를 산술연산을 수행하면 같은 자료형 처리된다.
		//2.서로 다른 자료형의 변수를 산술연산을 수행하면 가장큰자료형으로 자동 형변환 된다.
		int total=93;
		System.out.println(total/5);    //18
		System.out.println(total/5.0);  //18.6
		
		double result2=total / 5;   //같은int형으로 산술연산하면 int형으로 결과 처리된다.(int형끼리)
		double result3=total / 5.0;  //자동형변환 int->double (5.0은 double형이므로 int형을 double형으로 자동형변환됨)
		System.out.println(result2);  //18
		System.out.println(result3);  //18.6
		
		
	}

}
