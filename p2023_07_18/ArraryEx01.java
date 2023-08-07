package p2023_07_18;

public class ArraryEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열: 동일한 자료형의 데이터를 저장하기 위한 정적인 자료구조 ,크기확장불가
		//변수 -> 배열 -> 자료구조(List)     #여러자료형 사용가능,크기도 확장 가능.
		
		
// 1차원 배열 첫번째 형식 : 배열에 저장될 값이 정해져 있지 않는 경우에 주로 사용하는 형식.
		int[] score = new  int[3];
//		자료형 배열변수 연산자 자료형[배열의 크기]
//      int score[] = new  int[3];  <[] score뒤에 와도됨.
		
		//int 형 배열은 자동으로 0으로 초기화가 된다.
		System.out.println(score[0]);  //0
		System.out.println(score[1]);  //0
		System.out.println(score[2]);  //0
		
		score[0]=80;  //0번방에 80점 할당
		score[1]=90;
		score[2]=100;
		System.out.println(score[0]);  //80
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		//double 배열은 자동으로 0.0으로 초기화가 된다.
		double[] d= new double[3];
		System.out.println(d[0]);  //0.0
		System.out.println(d[1]);  //0.0
		System.out.println(d[2]);  //0.0
		
		// char 배열은 자동으로 초기화가 되지 않는다.
		char[] c = new char[3];
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		
		boolean[ ] b= new boolean[3];
		System.out.println(b[0]); //false
		System.out.println(b[1]); //false
		System.out.println(b[2]); //false
		
		
		String[] str= new String[3];
		System.out.println(str[0]); //null:값이 없다.
		System.out.println(str[1]); //null
		System.out.println(str[2]); //null
		
		str[0]="자바";
		str[1]="오라클";
		str[2]="스프링";
		System.out.println(str[0]); 
		System.out.println(str[1]); 
		System.out.println(str[2]); 
		
// 1차원 배열 두번째 형식 : 배열 선언과 동시에 초기화를 할때 주로 사용되는 형식.
//		               (배열에 할당될 값이 정해져 있는 경우에 주로 사용함)
		int[] s= {80,90,100};
		int[] s1= new int[] {80,90,100};
		System.out.println(s[0]); //80
		System.out.println(s[1]); //90
		System.out.println(s[2]); //100
		
		System.out.println("배열의 크기:"+s.length); //배열의 크기:3 (배열의 갯수)
		for(int i=0; i<s.length; i++)      //방은 0번부터 시작해서 i=0
			System.out.println(s[i]+"\t");
		System.out.println();
		
		double[] dd= {3.14, 10.5, 42.195, 50}; //double형배열에 int형배열을 할당하면 50은 정수지만 한가지 자료형으로 변환? 50.0으로 
		double[] d2= new double [] {3.14, 10.5, 42.195, 50}; 
		
		for(int i=0; i<dd.length; i++)
			System.out.println(dd[i]+"\t");
		System.out.println();
		
		char[] cc= {'j','a','v','a','자','바'};
		for(int i=0; i<cc.length; i++)
			System.out.println(cc[i]+"\t");
		System.out.println();
		
		boolean[] bb= {true, false, true};
		for(int i=0; i<bb.length; i++)
			System.out.println(bb[i]+"\t");
		System.out.println();
	
		String[] str1= {"자바","오라클","스프링","파이썬","텐스플로우"};
		String[] str2= new String[]{"자바","오라클","스프링","파이썬","텐스플로우"};
		for (int i=0; i<str1.length;i++)
			System.out.println(str1[i]+"\t");
		
	}
}
