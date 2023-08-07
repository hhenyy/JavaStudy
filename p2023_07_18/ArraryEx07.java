package p2023_07_18;

//p187
public class ArraryEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length !=2) {
			System.out.println("값의 수가 부족 합니다.");
			
			System.exit(0); // 프로그램을 강제로 종료
		}
		
		String strNum1= args[0];  //args[0]="10" <-0번방에 문자 형태인 "10"이 들어감,문자형태라 산술이 되지않음.
		String strNum2= args[1];  //args[1]="20"
		
//		Wrapper를 이용한 자료형 변환 (기본자료형 <---> 참조형 )
//		ex) int <---> String           Wrapper 클래스(박싱과 언박싱)
//		int n = Integer.parseInt("20");
		
		//문자를 숫자로 형변환 : "20" --->20
		int num1=Integer.parseInt(strNum1);
		int num2=Integer.parseInt(strNum2);
		
		int result = num1+num2;
		System.out.println(num1+"+"+num2+"="+result);

	}

}
