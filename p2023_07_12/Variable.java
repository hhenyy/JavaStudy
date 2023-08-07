package p2023_07_12;

import java.util.ArrayList;
import java.util.List;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//변수: 메모리상에 데이터를 저장하기 위한 기억 공간의 이름
//변수를 만드는 방법 : 자료형 변수명 = 데이터(값);
		
//기본 자료형 변수
//1.정수형 변수
		byte b1=10;   //-128~127
//	    byte b2=130;   //오버플로우 발생
	    short s=100;   //-32768~32767
	    int i = 1000;   //-21억~21억   , 주로사용
	    long l = 100000L;   //대문자 or 소문자 L 붙이기
		
		System.out.println("b1="+b1);
	    System.out.println("s="+s);
	    System.out.println("i="+i);
		
//	2.실수형 변수
	    float ft1 = 3.14f;    //flot형은 f를 붙여야 한다.(대문자 or 소문자)
	    float ft2 = 3.14F;    
	    float ft3 = (float)3.14; //double형(3.14)을 float형으로 강제 형변환 /f붙이지 않으면 double형으로 
	    double d =42.195;          
	    
	    System.out.println("ft1="+ft1);
	    System.out.println("ft2="+ft2);
	    System.out.println("ft3="+ft3);
	    System.out.println("d="+d);
	    System.out.printf("%.1f\n", d);    //소수 첫쨰자리까지 출력: 42.2
	    System.out.printf("%.2f\n", d);    //소수 둘쨰자리까지 출력: 42.20
	    
// 3. 문자형 변수
	    char c1= 'A';
//	    char c2= 'AB';  //오류발생
	    char c3= '안';
	    
	    System.out.println("c1="+c1);
	    System.out.println("c3="+c3);
	    
//	    4.논리형 변수
	    boolean bn1= true;
	    boolean bn2= false;
	    
	    System.out.println("bn1="+bn1);
	    System.out.println("bn2="+bn2);
	    
//	    참조형 변수: 클래스
	    String s1="자바";
	    String s2=new String("자바");
	    
	    System.out.println("s1="+s1);
	    System.out.println("s2="+s2);
	    
	    if(s1==s2) {  //주소를 비교
	    	System.out.println("같은 주소");
	    }else {
	    	System.out.println("다른 주소");
	    }
	    if(s1.equals(s2)) { //데이터(값)을 비교
	    	System.out.println("같은 값");
	    }else {
	    	System.out.println("다른 값");
	    	
	    }
	    
	    
//	    참조형 변수: 배열 - 동일한 자료형의 데이터를 저장하는 정적인 자료구조
	    int[] score = {80,90,100};    // <-double형인 3.14가 들어가면 오류, 동일한 자료형만 저장하는 정적인 구조
	    
	    System.out.println(score[0]);  //80
	    System.out.println(score[1]);  //90
	    System.out.println(score[2]);   //100
	    
	    for(int j=0; j<score.length; j++) {    //length 크기  //for반복문
	    	System.out.print(score[j]+"\t");
	    	
	    }
	    System.out.println();
	    
//	    참조형 변수: 인터페이스(List)         //List가장 많이씀 80프로 이상, 나머지 20프로는 map
//	    1.순차적인 자료구조
//	    2.여러가지 자료형의 데이터를 모두 저장할 수 있다.
//	    3.동적으로 공간의 크기를 늘릴 수 있다.
	    
	    //인터페이스는 자체적으로 객체 생성을 할 수 없다.
//	    List list= new List();   //오류발생->list는 인터페이스임,인터페이스는 자체 객체생성 x,그러므로 import생성시 오류발생
	    List list= new ArrayList();   
	    list.add(30);
	    list.add(3.14);
	    list.add('j');
	    list.add(true);   
	    list.add("자바");
	    
	    for(int k=0; k<list.size(); k++)
	    	System.out.println(list.get(k)+"\t");
	}

}
