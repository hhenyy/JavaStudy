package p2023_07_14;

public class while04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//while문을 이용해서 구구단(2~9단)을 출력하는 프로그램을 작성하세요.
		//다중while문
		
		int dan = 2, i;  //초기값
		while (dan<=9) {  //조건식:단
			System.out.println("["+dan+"단]");
			i=1;        //i값 초기화, 하지않으면 2단만 출력됨.
			while(i<=9) {   //조건식
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;           //증감식
		}
		dan++;             //증감식
//		i=1;  <-여기에서 i값 초기화 해도됨.
		System.out.println();
	}
	}
}
