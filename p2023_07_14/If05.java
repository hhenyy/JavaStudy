package p2023_07_14;

public class If05 {

	//p140
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//난수 발생 공식
		//난수=(정수화)(Math.random()*(상한값-하한값+1))+하한값;
		//난수 발생:      0.0 <= Math.random() <1.0   //Math클래스의 random메소드,생성자는 없음
		 //Math클래스는 여러개지만 난수발생 메소드는 random메소드
		// Math m= new Math(); <- 생성자가 없어서 객체생성시 오류발생
	       System.out.println("E="+Math.E); //자연로그
	       System.out.println("PI="+Math.PI); //원주율
	       System.out.println(Math.random()); //난수발생  
		//E, PI <- static이 붙어있는 정적필드라서 생성자가 없음.

		//주사위 번호 뽑기: 1         ~           6
		int num=(int)(Math.random()*6)+1; // 1~6  // random()은 static double형이라 정수화한다
		System.out.println("num="+num);
		
		if(num==1) {
			System.out.println("1번");
		}else if(num==2) {
		    System.out.println("2번");
	    }else if(num==3) {
		    System.out.println("3번");
	    }else if(num==4) {
		    System.out.println("4번");
	    }else if(num==5) {
	    	System.out.println("5번");
	    }else {
	    	System.out.println("6번");

        }
		System.out.println("1~45사이의 난수 발생");
		int r= (int)(Math.random()*45)+1;
		System.out.println("난수:"+r);
		
}
}
