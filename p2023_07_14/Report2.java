package p2023_07_14;

public class Report2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2.구구단(2~9단)을 열방향(세로방향)으로 출력하는 
//		   프로그램을 작성 하세요? (fore문 or while문 )
	  //초기값
		for (int dan=2; dan<=9; dan++)
			System.out.print("["+dan+"단]"+"\t");
			System.out.println();
		
		
		for(int i=1; i<=9; i++) {
		for (int dan=2; dan<=9; dan++)   //조건문
			System.out.print(dan+"*"+i+"="+dan*i+"\t");
			System.out.println();
	
			
			            

}
}
}
	
	