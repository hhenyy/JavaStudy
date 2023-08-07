package p2023_07_13;
//p75
//강제 형 변환
public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue=44032;
		char charvalue= (char) intValue; //강제 형 변환
		System.out.println(charvalue);   //가
		
		long longValue=500;
		intValue= (int)longValue;      //강제 형 변환
		System.out.println(intValue);  //500
		
		double doubleValue=3.14;
		intValue=(int)doubleValue;     //강제 형 변환  (double형을 int형으로 변환하는 경우가 가장많다)
		System.out.println(intValue);  //3

	}

}
