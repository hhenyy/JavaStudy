package p2023_07_14;

public class For06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//구구단(2~9단)을 출력하는 프로그램을 작성 하세요.
		//다중 for문 (for문 안에 for문이 들어가는것)
		//바깥쪽 for문이 기준
		for(int dan=2; dan<=9; dan++) { //단
			System.out.println("["+dan+"단]");  //단 title
			for(int i=1; i<=9; i++) {
				System.out.println(dan+"*"+i+"="+dan*i);
			}
			System.out.println();  //각단 줄 간격 벌리기
		}
		
	}

}
