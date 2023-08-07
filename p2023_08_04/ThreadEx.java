package p2023_08_04;
//과제.
//Thread를 이용해서 현재 시간을 1초에 한번씩 출력하는 
//프로그램을 작성 하세요?


import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadEx implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		SimpleDateFormat sf = 
			new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		
		while(true){
			try{
				Date d = new Date();
				System.out.println(sf.format(d));
				Thread.sleep(1000); //1초동안 block상태로 빠짐
			}catch(Exception e){				
			}			
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx tx = new ThreadEx();
		Thread t = new Thread(tx);
		t.start();
	}

}
