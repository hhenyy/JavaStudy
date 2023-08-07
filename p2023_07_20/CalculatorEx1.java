package p2023_07_20;
//p260
//클래스 내부에서 메소드 호출
//:일반 메소드 안에서 다른 메소드 호출
class Calculator1{
	int plus(int x, int y) {
		int result = x+y;   //17
		return result;
	}
	double avg(int x, int y) {
		double sum= plus(x,y);  //plus()메소드 호출
		double result = sum/2;  //8.5
		return result;
	}
	void execute() {
		double result = avg (7,10);  //avg()메소드 호출
		println("실행결과:"+result);  //println()메소드 호출
	}
	void println(String message) {
		System.out.println(message);
	}
	
}
public class CalculatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 mycal=new Calculator1();
		
		//main()메소드 안에서 method를 호출하기 위해서는 method를 가진
		//클래스로 객체를 생성한 후에 생성된 객체를 이용해서 method를 호출해야 한다.
		mycal.execute(); //execute()메소드 호출

	// execute();  '// 오류발생
		
		
	}

}
