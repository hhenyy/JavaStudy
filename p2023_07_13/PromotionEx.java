package p2023_07_13;
//p74
//자동 형변환
public class PromotionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue=10;
		int intValue=byteValue; //자동 형변환
		System.out.println("intValue:"+intValue);
		
 		//유니코드는 세계 각국의 문자를 2Byte로 표현 할 수 있는 숫자(0~65535)로 
		//매핑한 국제 규약
		char charValue='가';
		intValue=charValue;      //자동 형변환
		System.out.println("가의 유니코드:"+intValue);  //44032  영문은 아스키코드,문자들은 유니코드로 처리?
		
		intValue=50;
		long longValue= intValue;     //자동 형변환
		System.out.println("longValue:"+longValue);
		
		longValue=100;
		float floatValue= longValue;  //자동 형변환
		System.out.println("floatValue:"+floatValue);
		
		floatValue=100.5F;
		double doubleValue=floatValue;
		System.out.println("doubleValue:"+doubleValue);
		
		

	}

}
