package p2023_08_02;

//스택(Stack) 클래스 : LIFO(Last Input First Output) 구조
//마지막으로 입력된 자료가 가장 먼저 출력되는 구조 (후입선출)

import java.util.*;

public class StackTest01 {
  public static void main(String[] args) {
	  
    Stack myStack = new Stack();
    
    myStack.push("1-자바"); 
    myStack.push("2-C++"); 
    myStack.push("3-API"); 
    myStack.push("4-MFC"); 
    
    System.out.println( myStack.pop()); //4-MFC
    System.out.println( myStack.pop()); //3-API
    System.out.println( myStack.pop()); //2-C++
    System.out.println( myStack.pop()); //1-자바
    System.out.println( myStack.pop()); //EmptyStackException
//  Stack이 비어있으면 EmptyStackException이 발생한다.
    
    while(!myStack.isEmpty()) { //Stack이 비어있지 않으면
      System.out.println(myStack.pop());
    }
  }    
}                                                     
