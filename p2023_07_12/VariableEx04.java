package p2023_07_12;
//p68
//float과 double타입
public class VariableEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//실수값 저장
		//float var1=3.14;   //컴파일 에러  float var1=(float)3.14; 으로 강제 형변환해야함 또는 뒤에 f붙이기
		float var2=3.14f;
		double var3=3.14;
		
		//정밀도 테스트
		//float:소수점이하 7자리까지 정밀도를 가짐
		//double:소수점이하 15자리까지 정밀도를 가짐
		float var4=0.1234567890123456789f;     //var4:0.12345679  <-마지막 자리 반올림?
		double var5=0.123456789123456789;      //var5:0.12345678912345678  
		
		System.out.println("var2:"+var2);
		System.out.println("var3:"+var3);
		System.out.println("var4:"+var4);
		System.out.println("var5:"+var5);
	
		//e사용하기
		double var6 =3e6;              //10의 6승 
		float var7= 3e6f;             //10의 6승 
		double var8 = 2e-3;           //10의 -3승
		System.out.println("var6:"+var6);
		System.out.println("var7:"+var7);
		System.out.println("var8:"+var8);
		
	}

}
