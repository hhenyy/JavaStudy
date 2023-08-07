package p2023_07_12;

//java.lang패키지 안에 들어있는 클래스는 import 생략 가능
import java.util.*;
//import java.lang.system;
//import java.lang.string;
import java.util.Date;
import java.util.Random;


public class Test {
//접근제어자    사용자 정의 클래스

//main()메소드는 자바 가상머신(JVM:java.exe)이 가장 먼저 호출하는 메소드이다.
//1개의 클래스가 독립적으로 실행되기 위해서는 반드시 main메소드가 필요하다.
	public static void main(String[] args) {
//접근제어자 공유(정적메소드) main메소드
		// TODO Auto-generated method stub

		System.out.println("java출력 성공");
		System.out.println("java출력 성공");
		System.out.println("java출력 성공");
		
		Date d=new Date();
		System.out.println(d);
		
		Random r=new Random();
		System.out.println(r.nextInt(10));  // 0~9 난수 발생 
		
	}

}
