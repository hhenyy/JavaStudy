package p2023_08_02;

//try ~ catch ~ finally 형식
//1. finally 안에 들어있는 내용은 예외가 발생하든, 발생하지 않아도 무조건 실행된다.
//2. finally 안에 들어가는 내용은 주로 파일을 닫거나, 데이터베이스 연결은 끊는
//   내용이 주로 사용된다. ex)file.close(), con.close()

public class MultiExceptionHandling1 {
    public static void main( String[] args ) {
		
	int value = 20;
	int div = 0;

	int[] intArray = { 1, 2, 3 };
	//intArray[0]=1,  intArray[1]=2,  intArray[2]=3

	try {
		
		//ArithmeticException:0으로 나눌떄 발생되는예외
	    // 두수의 나눗셈을 구함
	    int result = value / div;  //무한대 (컴퓨터는 무한대 처리불가) ->예외발생(ArithmeticException)
	    System.out.println( result );

	    //ArrayIndexOutOfBoundsException
	    //:배열의 범위를 벗어난 값을 사용할떄 발생하는 예외
	    // 배열의 특정 값을 저장
            int arrayValue = intArray[4];
			System.out.println( arrayValue );

	    } catch ( ArithmeticException ae ) { //java.lang.ArithmeticException:
			System.out.println( ae.toString() ); /// by zero
			System.out.println("0으로 나눌수 없습니다."); //0으로 나눌수 없습니다.

	    } catch ( ArrayIndexOutOfBoundsException ai ) {
			ai.printStackTrace();
			System.out.println("배열의 범위를 벗어 났습니다.");

	    } finally {   //예외가 발생하지않아도 무조건 실행
	    	System.out.println("예외가 발생했음!"); //예외가 발생했음!

	    }	 
    }    
}



