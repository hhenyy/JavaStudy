package p2023_08_02;

public class ExceptionEx3 {

	public static void main(String[] args) {
		int var = 50;
		// args[0] = "5" 예외 발생 안함
		// args[0] = "a" 예외 발생 :NumberFormatException
		// args[0] = "0" 예외 발생 : ArithmeticException
		try {
			int data = Integer.parseInt(args[0]);

			System.out.println(var / data);

		// 1.Exception 예외 클래스가 하위 예외 클래스들을
		// 모두 가지고 있기 때문에 먼저 정의해서는 안된다.
		// 2. catch구문에서 Exception클래스로 예외를 받을때는 가장 마지막에
		// 사용 해야 한다.
//		} catch (Exception e) { 
//			System.out.println("Exception !!");
	
		} catch (NumberFormatException ne) {
			System.out.println("숫자가 아닙니다.");
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나눌순 없죠?");
		} catch (Exception e) { // Exception 예외 클래스가 최상위라 가장마지막에써야함
			System.out.println("Exception !!");
		}
		System.out.println("프로그램 종료!");
	}
}
