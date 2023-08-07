package p2023_07_28;

public abstract class AbsClass { //추상 클래스
	int a;
	
	//추상메소드: 메소드 이름만 있고, 내용이 없는 메소드
	public abstract void check(); //추상 메소드 (일반메소드랑 구분하기위해 abstract를 붙이고 이름만 있고 내용이없기때문에 ; 붙임)
    public void check01() {
    	System.out.println("일반 메소드");
    }
}
