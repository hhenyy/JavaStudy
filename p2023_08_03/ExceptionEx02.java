package p2023_08_03;

//p458
//예외처리

public class ExceptionEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//args[0]="10", args[1]="20":예외 발생 안함
		//args[0]="a", args[1]="b":예외 발생 함(NumberFormatException)

		try {
			String data1=args[0];  //예외발생
			String data2=args[1];
			int value1 = Integer.parseInt(data1); //예외발생
			int value2 = Integer.parseInt(data2);
			int result = value1+value2;
			System.out.println(data1+"+"+data2+"="+result);
		}catch(ArrayIndexOutOfBoundsException e) { //값 부족시 예외발생
			System.out.println("실행 매개값의 수가 부족합니다.");
		}catch(NumberFormatException e) { //문자매개값일때 예외발생
			System.out.println("숫자로 변환할 수 없습니다.");
		}finally {
			System.out.println("다시실행하세요.");
		}
	}

}
