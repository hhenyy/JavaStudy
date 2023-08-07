package p2023_08_04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//키보드로 구구단 1개 단을 입력 받아서, 출력하는 프로그램을 작성하세요?
//단, BufferedReader 클래스로 처리 하세요.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("원하는 단을 입력하세요.");
		
		try {                       
		String str =br.readLine(); //readLine()는 반드시 예외처리해야함.
		int dan = Integer.parseInt(str); //Integer.parseInt(str) <- 반드시 예외처리 하지않아도되지만 예외발생 가능성있음.
		
		for (int i=1;i<=9; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		
		}catch(Exception e){		
			System.out.println("숫자만입력하세요.");
		}	
	}

}