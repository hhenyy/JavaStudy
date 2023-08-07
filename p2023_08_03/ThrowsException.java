package p2023_08_03;

public class ThrowsException {

    // 나눗셈을 구하는 메소드
    public void occurException() {
    	try {
		int result = 3/0;  //예외처리
		System.out.println( result );//2. 예외가 발생하면, 예외가 발생한 라인 아랫쪽의 내용은 실행되지 않고,
	                                 //   catch구문에서 예외를 받아서 예외처리를 한다.
    }catch(ArithmeticException e) {
        e.printStackTrace();//메소드자체적으로 출력기능이 내장되어있음(오류 설명같은거 나옴,주석처리시 밑내용만 나옴)
    	System.out.println("0으로 나눌수 없습니다.");
    }
    }

    public static void main( String[] args ) {
		// 객체를 생성
		ThrowsException te = new ThrowsException();

		// 메소드 호출
		te.occurException();
    }
}

