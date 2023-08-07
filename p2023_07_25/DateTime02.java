package p2023_07_25;

//과제.
//Calendar 클래스를 이용해서 오늘 날짜, 시간, 요일을 
//출력하는 프로그램을 작성 하세요?

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTime02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 3.Calendar
		
	//	Calendar c2 = new Calendar();
		
	//	Calendar c1 = new GregorianCalendar();//업캐스팅
		
		Calendar c = Calendar.getInstance();
		
		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH)+1;// 0~11
		int d = c.get(Calendar.DATE);
		
		int h1 = c.get(Calendar.HOUR);	// 12시간
		int ap = c.get(Calendar.AM_PM);	//0:오전	
									    //1:오후
		int h2 = c.get(Calendar.HOUR_OF_DAY); //24시간
		int mm = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);
		
		System.out.println(y+"년 "+ m+"월 "+d+"일");
		if(ap == 0){
			System.out.println("오전");
		}else{
			System.out.println("오후");
		}
		System.out.println(h1+":"+mm+":"+s);		
		
		//요일구하는 필드찾기(정적필드)->숫자를 문자로 변환
		int w = c.get(Calendar.DAY_OF_WEEK);//1~7  
		System.out.println("w="+w);
		// 1:일, 2:월, 3:화, 4:수, 5:목, 6:금, 7:토
		String[] week={"일","월","화","수","목","금","토"}; //값이 정해져있어서 1차원배열, 일요일부터 시작
//		week[0]="일"
//		week[1]="월"
//		week[2]="화"
//		week[3]="수"
//		week[4]="목"
//		week[5]="금"
//		week[6]="토"
		
		
		System.out.println(week[w-1]+"요일");
		
//if문으로 할때
//		if(w==1) {
//			System.out.println("일요일");
//		}else if(w==2) {
//			System.out.println("월요일");
//		}else if(w==3) {
//			System.out.println("화요일");
//		}
		
//swich case문 가능
		
		
	}

}
