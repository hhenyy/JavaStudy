package p2023_08_02;

import java.util.*;

class Collections05 {
  public static void main(String[] args) {

 //제네릭을 사용하지 않으면, 여러가지 자료형의 데이터를 모두 저장할수있다.
    Vector vec = new Vector();
    
  //boolean add(Object e) 결과를 돌려주는 자료가 boolean형(true,false)
	vec.add("Apple");   //업캐스팅
    vec.add("banana");
	vec.add("oRANGE");
//	vec.add(50);
//	vec.add(3.14);
//	vec.add('k');
//	vec.add(true);
	
//Object get(int index) 결과를 돌려주는 자료가 Object형
	String temp;  //String형으로 저장을 했기 떄문에 다른자료형 입력시 오류
    for(int i=0; i<vec.size(); i++){ //size() 3
		temp=(String) vec.get(i);    //다운 캐스팅 (제네릭이 없을떄는 (String)생략불가해서 생략시 오류발생)
//		temp=vec.get(i);
		System.out.println(vec.get(i));
		System.out.println(temp.toUpperCase());
	}    
  } 
}                                                                                           
