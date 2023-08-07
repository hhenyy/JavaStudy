package p2023_07_27;
//과제.
//
//1. 1~45사이의 숫자를 6개 추출 하는 프로그램을 작성 하세요? 
//    (단, 중복된 숫자는 1번만 출력 되도록 한다.)
//    Math.random()을 이용해서 프로그램을 작성 하세요.
//   
//
//          0.0 <= Math.random() < 1.0
//
//참고)package p2023_07_21;
//
//public class MathEx

import java.util.Arrays;

class Lotto1 {

	public static void main(String[] args) {

		int num[] = new int[6]; //배열만들기,배열크기 6설정/1차원배열은 거의계속써서 반드시 익히기

		for (int i = 0; i < num.length; i++) {  //i변수 배열크기(lengh속성사용)/비교)문자열의길이length()

			num[i] = (int) (Math.random() * 45) + 1;
//			num[0]=5, num[1]=5, 
			for (int j = 0; j < i; j++) {  //새로운변수j(이전발생난수값)
				if (num[i] == num[j]) {   //중복 난수 발생 
					i--;          //중복발생시 이전 방으로 1 감소시킴.
					break;    //안쪽for문만 빠져나옴
				} // if end     //중복값 해결문제 이방법 많이 사용.

			} // for end
		} // for end

	//정렬 ->실무에선 잘 안쓰지만 시험보려면 알아야함.	
		// 오름차순 정렬 : 버블정렬(자신의 옆자리에 있는 것과 비교)
//		int temp = 0;
//		for (int i = 0; i < num.length; i++){
//			for (int j = i+1; j < num.length; j++) {
//				if(num[i] > num[j]){
//					temp = num[i];
//					num[i] = num[j];
//					num[j] = temp;
//				}
//			}
//		}

		Arrays.sort(num); //오름차순 정렬
		                  //숫자: 1,2,3...
		                  //문자: 사전순 정렬  a,b,c ..

		for (int k : num) {
			System.out.print(k + "\t");
		}
	}
}

/*
 * 난수 발생 공식 난수 =(정수화) ((상한값-하한값+1)* Math.random()) + 하한값
 * 
 */