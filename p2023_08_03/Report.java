package p2023_08_03;
//과제.
//Thread를 이용해서 현재 시간을 1초에 한번씩 출력하는 
//프로그램을 작성 하세요?

import java.util.Date;

public class Report implements Runnable {
   
	public void run() {
		for( ; ; ) {
			Date d =new Date();
			System.out.println(d);
			

		try {
			//sleep() 메소드를 사용해 프로그래머가 강제로 
			// block 상태로 만듦.
		    // 1초 동안 thread을 block 상태에 빠트림
		    Thread.sleep( 1000 ); //(단위: 1/1000 초)
		} catch ( InterruptedException ie ) {		    
		    System.out.println( ie.toString() );
		}
	}//for end
    }// run() end

    public static void main( String[] args ) {
    	Report ts = new Report();
		
		// 두 개의 Thread를 생성시켜 실행시킴
		// 2개의 Thread가 동일한 우선 순위로 실행됨.(5인 상태)		
		Thread first  = new Thread( ts, "first1" );
	
		first.start();
		
    }
}

