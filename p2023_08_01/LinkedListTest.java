package p2023_08_01;

import java.util.*;

class LinkedListTest {
	public static void main(String[] args) {

// 큐(Queue) : FIFO(First Input First Output)구조

		//Queue는 인터페이스이기 때문에 자체적으로 객체 생성을 할 수 없다.
//		Queue q = new Queue();
		
		//offer()
		Queue q= new LinkedList(); //업캐스팅
		LinkedList myQue = new LinkedList();
		myQue.offer("1-자바");
		myQue.offer("2-C++");
		myQue.offer("3-API");
		myQue.offer("4-MFC");
		
		System.out.println(myQue.poll());//1-자바
		System.out.println(myQue.poll());//2-C++
		System.out.println(myQue.poll());//3-API
		System.out.println(myQue.poll());//4-MFC
		System.out.println(myQue.poll());//null
		//큐(Queue)가 비어있으면 null값을 리턴함.

		//peek(), poll()
		while (myQue.peek() != null) // 큐가 비어있지 않다면
			System.out.println(myQue.poll()); // 큐에서 데이터를 꺼내온다.
	}
}