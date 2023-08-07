package p2023_07_31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//p568~569
//Set 자료구조

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//제네릭(Generic) 
		//:자료구조에 1가지 자료형의 데이터만 저장 할 수 있도록 해준다.
		Set<String> set = new HashSet<String>();
		
//		set.add(30);       //string형이 아니므로 오류발생
		set.add("Java");
		set.add("JDVBC");
		set.add("Servlet/JSP");
		set.add("Java");   //중복된 데이터를 저장할 수 없다.
		set.add("iBatis"); 
		
		int size = set.size(); //저장된 원소의 갯수
		System.out.println("총 객체수:"+size); //4
		
		//반복자
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
			
		}
		
		// remove() : 특정 원소를 삭제하는 역할
		set.remove("JDBC");
		set.remove("iBatis");
		System.out.println("총 객체수:"+set.size());//2
		
		//반복자
		iterator = set.iterator();
		for(String element : set) {
			System.out.println("\t"+element);
			
		}
		//clear () : 모든 원소를 삭제하는 역할
		set.clear();
		if(set.isEmpty()) {  //isEmpty(): 해당 자료 구조가 비어 있을때 true리턴
			System.out.println("비어있음");
		}

	}

}
