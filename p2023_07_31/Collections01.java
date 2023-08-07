package p2023_07_31;

import java.util.*;

class Collections01 {
  public static void main(String[] args) {
	  
	// Set은 인터페이스이기 때문에 자체적으로 객체를 생성 할 수 없다.
//	Set s= new Set(); //오류발생
	
    Set set = new HashSet();  //업캐스팅(오 부모<-왼 자식)
//	HashSet	set = new HashSet(); //이방법도 가능함(상속받는 클래스로 객체 생성), 위방법과 다른부분은있음.(참조가능영역?_
	System.out.println("요소의 갯수->"+set.size()); //0
	
	//boolean add(Object e)
	set.add("하나");	       //업캐스팅  add(Object e)라서 자식클래스형은 모두 업캐스팅가능
    set.add(2);
	set.add(3.42);
	set.add("넷");
	set.add("five");
	set.add(6);	
	set.add(6);     
	
	//set은 중복데이터를 저장할 수 없다.
	System.out.println("요소의 갯수->"+set.size());  //6중복된 데이터라 요소의 갯수가 7이아니라 6으로 나옴.
	System.out.println(set);  //순서대로 나오지 않음. 
                          //중복문제 해결할떄 외에는 순차적이지 않고 중복데이터저장하지 않아 다루기 어려워 사용빈도 낮음.
	
	//Interator(반복자):2,6,넷,하나, 3.42,five
	Iterator elements=set.iterator();  //  데이터를 한꺼번에 가져와서 elements에 넘겨줌.
	while(elements.hasNext()) {  //hasNext()는 boolean형이라 가져올 데이터가 있을때 True리턴
      System.out.println("\t\t" + elements.next()); //next():데이터를 가져오는 역할
	}


/*  Vector에만 적용
	Enumeration enu = set.elements();
	while( enu.hasMoreElements()){
		System.out.println( enu.nextElement() );
	}
*/	
  }    
}                                                                                           
