package p2023_07_19;

public class Report01 {

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

//		int [] dan = new int[] 
//		int h=1,w=1;
//		for (int i=0;i<h.length;i++) {//행기준
//			h+=i
//					for(int i=0;i<w.length;i++)
//						w+=i
//		}
//		
		int[][] gugu=new int[8][9];
		int dan,i; //변수선언
		for (dan=0;dan<8;dan++) {   //행기준
			for(i=0;i<9;i++) {
				gugu[dan][i]=(dan+2)*(i+1);
				
				System.out.print((dan+2)+"*"+(i+1)+"="+gugu[dan][i]+"\t");
			}
			System.out.println();
		}
		
	}

}

