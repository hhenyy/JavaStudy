﻿package p2023_08_02;
//과제.  1~45 사이의 정수중에서 6개의 숫자를 추출하는 
//로또 프로그램을 작성하세요?
//
//1) Set자료구조를 사용해서 중복 숫자가 나오지 않도록 작성하세요.
//2) 추출된 6개의 숫자를 오름차순으로 정렬해서 출력하세요.

import java.util.*;

public class SetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
//		Set s = new HashSet(); //중복이 되진않지만 오름차순도되지않음
		TreeSet s = new TreeSet(); //중복x오름차순o
		
		Random r = new Random();		
		
		while(true){
			n = r.nextInt(45)+1;	// 1 ~ 45 난수 발생
			s.add(n);
			if(s.size() == 6){
				System.out.println(s);
				break;
			}
		}
	}

}
