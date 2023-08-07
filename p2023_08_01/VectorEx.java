package p2023_08_01;

import java.util.List;
import java.util.Vector;

//p561 ~562

class Board extends Object{ // Board클래스(사용자정의클래스)는 Object클래스의 묵시적으로 내부적 상속되어있어서 extends Object생략가능
	String subject; //필드값저장 (defalt접근제어자라 메소드가없어도 접근가능)
	String content; 
	String writer;
	
	//매개변수가 있는 생성자
	public Board(String subject, String content, String writer) { 
		this.subject = subject; //매개변수로 전달된 값이용해서 필드값초기화 
		this.content = content;
		this.writer = writer;
	} 	
}

public class VectorEx { //메인메소드를 가진 클래스

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  //제네릭(Generic):자료구조에 특정 자료형의 데이터만 저장할 수 있도록
	  //              만들어주는 역할
	  //<> Board클래스로 만든객체만 저장     
	  //Vector 자료구조에는 Board클래스로 만든 객체만 저장할 수 있다.
		List<Board> list = new Vector<Board>(); //업캐스팅 vector객체가 만들어짐.
	
	//	list.add("자바");
//		list.add(50);
		
		//boolean add(Object e) :Object e = new Board();  
		list.add(new Board("제목1","내용1","글쓴이1")); //add()메소드로 데이터추가
		list.add(new Board("제목2","내용2","글쓴이2")); //업캐스팅
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		
		list.remove(2); //인덱스 2번 원소(객체)를 삭제
		list.remove(3); //인덱스 3번 원소(객체)를 삭제
		
		//Object get(int index)  //Object로 결과를 돌려줌
		for(int i=0;i<list.size();i++) {
			
			//제네릭을 사용하면, 부모인 Object형을 자식클래스인 Board 클래스형으로
			//자료형 변환을 할때, 제네릭으로 설정된 자료형은 생략이 가능하다.
			
			//Object형-->Board형으로 변환 (다운 캐스팅)
			Object b= list.get(i);  //다운 캐스팅??
			Board board= (Board) list.get(i); //다운 캐스팅
			                        //generic으로 설정된 (Board)자료형은 생략가능
			System.out.println(board.subject+"\t"+
					           board.content+"\t"+
			                   board.writer);
		}
	}
}
