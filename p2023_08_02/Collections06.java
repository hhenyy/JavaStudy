package p2023_08_02;

import java.util.*;

class Collections06 {
  public static void main(String[] args) {
	  
// 제네릭(Generic) : 자료구조에 한가지 자료형의 데이터만 저장 하도록 해주는 역할
    Vector<String> vec = new Vector<String>();

  //boolean add(Object e) 결과를 돌려주는 자료가 boolean형
	vec.add("Apple");
    vec.add("banana");
	vec.add("oRANGE");
//	vec.add(50);  //String형 데이터만 저장할 수 있다.
	
//제네릭을 사용하게 되면, 자료구조에서 데이터를 구해올때 제네릭으로 설정된 자료형은
//생략할 수 있다.
  //Object get(int index) 결과를 돌려주는 자료가 Object형
	String temp;
    for(int i=0; i<vec.size(); i++){
      temp=(String) vec.get(i);//다운캐스팅//<String>으로 설정되어서 (String)생략가능
      System.out.println(temp.toUpperCase());
    }
  } 
}                                                                                           
