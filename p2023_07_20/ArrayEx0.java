package p2023_07_20;

public class ArrayEx0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		과제.
//	       구구단(2~9단)의 연산 결과를 2차원 배열에 저장하고,
//	       배열에 저장된 결과를 이용해서 구구단을 출력하는 
//	       프로그램을 작성하세요?
//		for문안에 fore문
//		불러와서 전체 출력(결과값만)
//		2차원 배열 1번째형식
//		8행 9열
		
		int[][] s = new int[8][9];  // 8행  9열
		System.out.println("행의 갯수:"+s.length); //8
		System.out.println("열의 갯수:"+s[0].length); //9
		
		
		// 구구단 세로로 한줄로 출력
//		for(int dan=0; dan<=7; dan++){				// 행
//			System.out.println("["+(dan+2)+"단]");
//			for(int i=0; i<=8; i++){				// 열
//				s[dan][i] = (dan+2)*(i+1);
//				
//				System.out.println((dan+2)+"*"+(i+1)+"="+s[dan][i]);
//			}
//			System.out.println("");
//		}	


		
		
		// 구구단을 각 단별로 출력
		for(int dan=0; dan<=7; dan++){				// 행
			for(int i=0; i<=8; i++){				// 열
				s[dan][i] = (dan+2)*(i+1);				
			}
		}		
		for(int dan=2; dan<=9; dan++)
			System.out.print("["+dan+"단]\t");
		System.out.println("");
		for(int i=0; i<=8; i++){	
			for(int dan=0; dan<=7; dan++){				
				System.out.print((dan+2)+"*"+(i+1)+"="+s[dan][i]+"\t");
			}
			System.out.println("");
		}		
		
				
	}

}
