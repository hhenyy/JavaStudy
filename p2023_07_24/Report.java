package p2023_07_24;

import java.util.Calendar;

public class Report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Calendar now = Calendar.getInstance(); 
		
		int date = now.get(Calendar.DATE);      //일
		int hour = now.get(Calendar.HOUR);         //12시간
		int week = now.get(Calendar.DAY_OF_WEEK);  //1~7 -> week-1 :0~6
	//	System.out.println(week);  //2
		String [] week1= {"일","월","화","수","목","금","토"}; //0~6
	
	    System.out.print(date+"일 "+hour+"시 "+week1[week-1]+"요일");
				
	}

}

