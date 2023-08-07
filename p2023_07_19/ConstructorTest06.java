package p2023_07_19;

class MyDate06 {
	// field:객체가 생성될때 heap메모리상에서 값을 저장하는 역할
	private int year;
	private int month;
	private int day;

	// 생성자 : 객체가 생성될때 호출되면서, 필드값을 초기화 시키는 역할
//  public MyDate(){//default 생성자,  기본생성자를 호출하는 코드가 없기때문에 기본생성자를 만들어주지 않아도됨.
//  }  
	public MyDate06(int new_year, int new_month, int new_day) {
		year = new_year;   // 2023
		month = new_month; // 7
		day = new_day;     // 19
	}

//	public void SetYear(int year) {
//		// this.year=year;
//		year = year;
//	}
//
//	public void SetMonth(int new_month) {
//		month = new_month; // month=8
//	}
	
	
//1.메소드: 필드값을 출력하는 역할
	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}

	//2.getters 메소드 : 필드값을 메소드를 호출한 곳에 돌려주는 역할
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	//3. setters 메소드:필드값을 수정, 변경하는 역할 (생성자를 이용하면 방이 또 생성되기때문에 메소드를 이용해야함)
	public void setYear(int year) {
		this.year = year;    //2023->2024
	}

	public void setMonth(int month) {
		this.month = month;  //7->10
	}

	public void setDay(int day) { 
		this.day = day;            //19->25
	}
	
}

public class ConstructorTest06 {
	public static void main(String[] args) {
		MyDate06 d = new MyDate06(2023, 7, 19);
		d.print();
		
		d.setYear(2024); // year을 2024년으로 수정
		d.print();
		
		d.setMonth(10); // Month를 10월로 수정
		d.print();
		
		d.setDay(25);  //Day를 25일로 수정
		d.print();
		
	    System.out.println("돌려받은 year:"+d.getYear());   //2024
	    System.out.println("돌려받은 month:"+d.getMonth()); //10
	    System.out.println("돌려받은 day:"+d.getDay());     //25

	}
}