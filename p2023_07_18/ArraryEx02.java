package p2023_07_18;

public class ArraryEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores= {83,90,87};
		
		System.out.println("scores[0]:"+scores[0]);
		System.out.println("scores[1]:"+scores[1]);
		System.out.println("scores[2]:"+scores[2]);
		
		int sum=0;
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i]; //sum=sum+scores[i]
		}
		System.out.println("총점:"+sum);  //총점:260
		
//		double avg = sum/3; 
	//	System.out.println("평균:"+avg); //평균:86.0
		double avg = (double) sum/3; //강제형변환  (분모나 분자에 double)
		System.out.println("평균:"+avg); //평균:86.66666666666667
		
	//평균값을 소숫점 2쨰자리까지 출력 하세요.
		System.out.printf("평균:%.2f",avg);   // 12일 Variable참고//평균:86.67
	}                                         //printf 로  (?)

}
