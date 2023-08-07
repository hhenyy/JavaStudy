package p2023_07_18;
//p182
public class ArraryEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores;            //  int a;  a=10;
		scores= new int[] {83,90,87}; //new써야 힙메모리에 새로운공간 생성
	//	int[] scores=new int[] {80,90,87}; <-한줄로 작성시
		
		int sum1=0;
		for(int i=0; i<3; i++) {
			sum1+=scores[i];
		}
		System.out.println("총합:"+sum1); //총합:260
		
		//add 메소드를 호출해서 리턴된 총점을 sum2에 저장
		int sum2 = add(new int[] {83,90,87});  //add메소드 호출//sum이 int라 앞에 int붙임
		System.out.println("총합:"+sum2);    //총합:260

	}
//사용자 정의 메소드: 합을 구해서 리턴해주는 메소드
	public static int add(int[] scores) { //정적메소드(static이붙어있는메소드)//아직 주소값은 받지못했음.
		int sum=0;
		for(int i=0; i<3; i++) {
			sum+= scores[i];
		}
		return sum;               //add메소드호출한 18번에 값을 리턴
	
	}
}
