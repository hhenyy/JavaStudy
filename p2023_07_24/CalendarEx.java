package p2023_07_24;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//3. Calender 클래스 #하나씩구해야해서 번거로워서 특별한경우만 사용, 주로 Date,Timestamp사용함

//		Calendar c1 = new Calendar();         //오류발생 ?? Calendar는 추상클래스라 new연산자 사용해서 인스턴스 생성 못함. 
		Calendar c2 = new GregorianCalendar();//업캐스팅(자식객체를 부모에 전달).세번째 자료형변환
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);              //1690168200856 (유닉스타임)
		System.out.println(Calendar.YEAR);  //1
		
		int y = c.get(Calendar.YEAR);      //연:2023
		int m = c.get(Calendar.MONTH)+1;   //월:0~11 (실제월과 같으려면 +1)
		int d = c.get(Calendar.DATE);      //일
		
		System.out.println(y+"-"+m+"-"+d);
		
		int h1 = c.get(Calendar.HOUR);          //12시간
		int h2 = c.get(Calendar.HOUR_OF_DAY);   //24시간
		
		int ap = c.get(Calendar.AM_PM);         //0:오전,1:오후
		if(ap==0) {
			System.out.print("오전");
		}else {
			System.out.print("오후");
		}
		
		int mm = c.get(Calendar.MINUTE);   //분
		int s = c.get(Calendar.SECOND);    //초
		
		System.out.println(h1+":"+mm+":"+s); //12시간제
		System.out.println(h2+":"+mm+":"+s); //24시간제
		
	}

}
