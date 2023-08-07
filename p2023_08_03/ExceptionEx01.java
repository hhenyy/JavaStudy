package p2023_08_03;

//p456
//예외처리
//ArrayIndexOutOfBoundsException : 배열의 범위를 벗어 났을때 발생하는 예외
//NumberFormatException : 숫자 외의 값을 입력했을때 발생되는 예외

public class ExceptionEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data1 = null; //args[0]="10"
		String data2 = null; //args[1]="20"
		try {
			data1=args[0]; //값을 쓰진않으면 예외발생
			data2=args[1];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			return;  
		}           
		//return구문으로 main()메소드를 빠져나가기때문에 아랫쪽의 내용은이 실행되지 않음.
		//반복문 빠져나갈때는 break;
		
		try {
			int value1=Integer.parseInt(data1); //숫자변환 불가능시 예외발생
			int value2=Integer.parseInt(data2);
			int result=value1+value2;
			System.out.println(data1+"+"+data2+"="+result);
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환 할 수 없습니다.");
			
//finally 안에 들어있는 내용은 예외가 발생하든 발생하지 않든 무조건 실행된다.
		}finally {
			System.out.println("다시실행하세요.");
		}
	}

}
