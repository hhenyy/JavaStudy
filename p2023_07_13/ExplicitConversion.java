package p2023_07_13;
//강제 형변환 : 프로그래머가 직접 자료형 변환을 해야되는 변환을 의미
//            큰 자료형 데이터를 작은 자료형 변수에 저장하는 경우

public class ExplicitConversion {

    public static void main( String[] args ) {
    	
	// int형 변수를 97로 초기화
	int intValue = 97;
	
	// char형 변수에 int형 변수 값을 할당
	//char charValue = intValue;  //앞에 (char)을 쓰면 강제 형변환
	char charValue = (char)intValue;       // 강제 형변환   
	System.out.println( "charValue = " + charValue );   // 결과값: a  //97->a

	// float형 변수 초기화.
	float floatValue = 3.14F;       //F빠트리면 오류
	
	// int형 변수에 float형 변수 값을 할당
	//int intValue2 = floatValue;
	int intValue2 = (int)floatValue;  // 강제 형변환 : foat-> int
	System.out.println( "intValue2 = " + intValue2 );

	// float형 변수 초기화
	double doubleValue = 21.12345;
	
	// float형 변수에 double형 변수 값을 할당
	//float floatValue2 = doubleValue;
	float floatValue2 = (float)doubleValue; // 강제 형변환 : double-> foat
	System.out.println( "floatValue3 = " + floatValue2 );

    }
}