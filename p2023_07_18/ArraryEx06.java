package p2023_07_18;

public class ArraryEx06 {
//p198
	public static void main(String[] args) {  //main메소드는 자바가상머신으로만 실행
		// TODO Auto-generated method stub     // main메소드는 직접호출불가
//향상된 for문(= 확장 for문)                      //매개변수명 args-> ar변경가능 //String[] args-> String ar[]  괄호위치변경가능
//형식: for(변수: 순차적인 자료구조(배열,List)){
//         실행될 문자;
//	}
		int [] score = {95, 71, 84, 93, 87};
		
//		1.기본 for문
		int sum =0;
		for(int i=0; i<score.length; i++)
			sum+= score[i];
		System.out.println("총합:"+sum);

		
//		2. 향상된 for문
		int sum1 =0;
		for(int s: score)
			sum1+= s;
		System.out.println("총합:"+sum1);
		
		
		
	}
}
