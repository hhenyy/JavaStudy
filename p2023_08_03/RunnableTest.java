package p2023_08_03;

//Thread(쓰레드): 1개의 process를 구성하는 논리적인 작업단위
//자바에서 Thread를 만드는 방법
//2. Runnable 인터페이스를 상속 받아서 만드는 방법

public class RunnableTest implements Runnable {
	
	@Override
	public void run() { //실행중인 상태 
		// TODO Auto-generated method stub
		for( int i=1 ; i<=20 ; i++ ) {
		System.out.println( "number = " + i );
	}
}

    public static void main( String[] args ) {
		// 객체 생성
		RunnableTest tt = new RunnableTest();
		// Thread 클래스 객체 생성
		Thread t = new Thread( tt );
		// Thread를 시작시킴
		t.start(); //실행 가능한 상태 : run() 메소드가 자동으로 호출된다.
		
		// main()내에서 화면에 101부터 120까지 출력
		for( int i=101 ; i<=120 ; i++ ) {
			System.out.println( "-------> main number = " + i );
		}
    }

}
	

