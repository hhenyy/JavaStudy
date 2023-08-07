package p2023_07_14;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1~10까지 합을 구하는 프로그램을 작성 하세요.  
		int sum=0;  //지역변수(local variable) :main메소드안에서 사용하기때문에
		for(int i=1; i<=10; i++) {           //sum=0 초기값 0으로설정
			sum=sum+i; //sum+=i;
	//      1 = 0 + 1
    //      3 = 1 + 2
//			6 = 3 + 3
//		    10 =6 + 4
			System.out.println("1~"+i+"="+sum);
 			
	}
//		System.out.println(i);   //오류발생(i변수가 지역변수)for문 벗어나는 순간 사라짐.
  		System.out.println("sum="+sum);
	}

}
