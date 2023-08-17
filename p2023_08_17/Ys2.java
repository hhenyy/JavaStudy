package p2023_08_17;
//5. 60과 24의 최대 공약수를 구하는 프로그램을 작성 하시오? (20점)

public class Ys2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=60;
		int b=24;
		int ab=0;
		
		for (int i=1; i<=60;i++) {
			if(a%i==0&&b%i==0){
				ab=i;
			}
		}
		System.out.println(ab);

	}

}
