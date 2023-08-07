package p2023_07_19;

//p227
//class가 2개

class Car {   //class가 2개 , //메인메소드가 없는 클래스 ,메인메소드가 없어서 컴파일까지만 실행만 가능하고 독립적실행불가.
	          //파일명 CarExample과 같지않아도되고 class앞에 public을쓰면 오류발생(class가 2개인경우??) ex) public class car
	 //필드(field)
	 String company="현대자동차";  //초기값 설정
	 String model="그랜저";
	 String color="검정";
	 int maxSpeed=350;
	 int speed;  //필드 int형이라 0으로 초기값이 설정된다. 지역변수는 자동0으로 초기화x
} 

public class CarExample {   //mian메소드가 가진 class명인 CarExample과 파일명 CarExample같으면 됨. 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성
		Car myCar= new Car();
		
		System.out.println("제작회사:"+myCar.company);
		System.out.println("모델명:"+myCar.model);
		System.out.println("색깔:"+myCar.color);
		System.out.println("최고속도:"+myCar.maxSpeed);
		System.out.println("현재속도:"+myCar.speed);
		
		//필드값 변경
		myCar.speed=60;
		System.out.println("수정된 속도:"+myCar.speed);//60

	}

}
