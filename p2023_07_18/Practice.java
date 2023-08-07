package p2023_07_18;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열: 동일한 자료형의 데이터를 저장하기 위한 정적인 자료구조 ,크기확장불가
		//변수 -> 배열 -> 자료구조(List)     #여러자료형 사용가능,크기도 확장 가능.
		
		
		int[] scores= {83,90,87};
		
		int sum=0;
		for(int i=0;i<scores.length;i++){
			sum+=scores[i];
		}
		double avg= (double)sum/3;
		
	 
			System.out.printf("평균:%.2f",avg);
		
		

		}
		}
		
	