package p2023_07_18;

public class ArraryEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열 복사 : for문으로 배열 복사
		
		int[]oldArray= {10,20,30}; //원본 배열
		int[]newArray= new int[5]; //새로운 배열
		
		for(int i=0; i<oldArray.length; i++) {
			newArray[i]= oldArray[i];  //배열 복사
		}
		// 복사된 배열 출력
		for (int i : newArray) {   //향상된 for문
			System.out.println(i+"\t");
		}

	}

}
