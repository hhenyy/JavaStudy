package p2023_07_31;

import java.util.ArrayList;
import java.util.List;

//p560
//ArrayList
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>list = new ArrayList<String>(); //업캐스팅
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP"); //Servlet/JSP는 2번에서 3번으로 이동
		list.add(2,"Database"); //인덱스2번 위치에 Database 추가
		list.add("iBatis");
		
		int size = list.size();
		System.out.println("총 객체수:"+size); //5
		System.out.println();
		
		//인덱스 2번 원소를 구해와서 skill변수에 저장후 출력
		String skill = list.get(2);
		System.out.println("2:"+skill); //2:Database
		System.out.println();
		
		for(int i =0; i <list.size();i++) {   //0:Java
			String str =  list.get(i);        //1:JDBC
			System.out.println(i+":"+str);    //2:Database
		}                                     //3:Servlet/JSP
		System.out.println();                 //4:iBatis
		 
		//remove(int index):특정 인덱스 번호를 가진 원소를 삭제하는 역할
		list.remove(2); //Database 삭제
		list.remove(2); //Servlet/JSP 삭제
		list.remove("iBatis"); //iBatis 삭제
		
		for(int i =0; i <list.size();i++) {   //0:Java
			String str =  list.get(i);        //1:JDBC
			System.out.println(i+":"+str);    
		}                                 
		
	}

}
