package p2023_07_12;
//p66
//이스케이프 문자 
//\t:탭키만큼 띄움
//\n:줄바꿈  <-new line이란 뜻
//\":"출력
//\':'출력
//\\:\출력
public class VariableEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("번호\t이름\t직업");
		System.out.print("행 단위 출력\n\n");
		System.out.print("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다.");   // \안넣으면 ""중첩으로 쓰고있어서 오류발생
		System.out.println("봄\\여름\\가을\\겨울");

	}

}
