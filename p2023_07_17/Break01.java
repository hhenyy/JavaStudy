package p2023_07_17;

public class Break01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//무한루프: for문
		//break: 반복문을 빠져 나오는 역할
		//'무한출력'을 100번 출력
		for(int i=1;;i++) {      //break문에 조건식이있어서 for문에는 조건식 생략가능.
			System.out.println(i+"무한출력");
			if(i==100) break;
		}

	}

}
