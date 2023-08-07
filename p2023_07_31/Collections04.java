package p2023_07_31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Collections04 {

  public static void main(String[] args) {
    List list = new ArrayList();  //1.(왼 부모 <-오 자식)업캐스팅
//	ArrayList list = new ArrayList(); //2.하위상속을 받는 클래스로 객체생성.

	list.add("하나");
    list.add(2);
	list.add(3.42);
	list.add("넷");
	list.add("five");
//	list.add(6);
	System.out.println(list);  //1번째 방법:가장간단한 방법

	//Object get(int index) 
	System.out.println(list.get(2)); //인덱스 2번원소 추출: 3.42
	System.out.println(list.get(4)); //인덱스 4번원소 추출: five
	
	//Object get(int index)    
    for(int i=0; i<list.size(); i++){ //size():원소의 갯수
//  System.out.println( i + " 번째 요소는 " + list.get(i));
	Object s = list.get(i);
//	String s =(String)(list.get(i)); //string클래스로 형변환시 string자료형 아닌 데이터는 오류발생
	System.out.println(s);   //2번쨰 방법: 반복문,get()사용 가장많이 사용!!
}
  //3번쨰 방법: 반복자 :하나,2,3.42,넷,fiver,6
	Iterator elements=list.iterator();    
	while(elements.hasNext()) { //hasNext()은 boolean형이라 가져올 데이터가 있을때만 true리턴      
      System.out.println("\t\t" + elements.next());//next():데이터를 1개씩 가져오는 역할
	}	

    //4번쨰 방법 :향상된 for문
    //for(변수: 순차적인 자료구조)
    for(Object s : list) {
    	System.out.println(s+"\t");
    }
    System.out.println();
 } 
}                                                                                           
