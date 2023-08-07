package p2023_08_01;

// DAO(Data Access Object) 클래스 :직접 접근,처리하는 클래스

import java.util.ArrayList;
import java.util.Scanner;

public class BoardSVC {

	ArrayList<BoardVO> boardList;  //BoardVO클래스로 만든객체만 list에 저장
	
	public BoardSVC(){
		boardList =  new ArrayList<BoardVO>();		
	}
	
	// 글 입력  처리 메소드
	public void writeArticle(Scanner sc){
		System.out.println("게시판에 글을 작성 하세요?");
		System.out.print("작성자:");
		String register=sc.next();
		
		System.out.print("이메일:");
		String email=sc.next();
		
		System.out.print("비밀번호:");
		String passwd=sc.next();
		
		System.out.print("제목:");
		String subject=sc.next();
		
		System.out.print("글내용:");
		String content=sc.next();
		
		BoardVO boardVO=new BoardVO(register,subject,email,content,passwd);
		//boardVO.register="홍길동"; 필드의 접근제어자가 private이라서 접근x
		addArticle(boardVO);		
	}
	
	// 글 작성
	private void addArticle(BoardVO boardVO){ //boardVO객체 
		boardList.add(boardVO); //boardList 0번방에 저장
	}
	
	// 글목록 출력
	public void listArticles(Scanner sc){ //Scanner sc객체
		if(boardList.size()>0){ //작성된 글이 있으면 
			for(int i=0; i<boardList.size(); i++){
				System.out.println(boardList.get(i).toString());
			}
		}else{
			System.out.println("등록된 글이 없습니다.");
		}
	}
	
	// 삭제할 글의 작성자 및 비밀번호 입력하는 메소드
	public void removeArticle(Scanner sc){  //매개변수가 1개인 removeArticle()메소드 
		System.out.println("저장할 글의 작성자와 비밀번호를 입력 하세요?");
		System.out.print("작성자:");
		String register=sc.next();
		
		System.out.print("비밀번호:");
		String passwd=sc.next();
		
		removeArticle(register,passwd);
	}
	
	//글 삭제                                                   //메소드 오버로딩
	public void removeArticle(String register, String passwd){ //매개변수가 2개인 removeArticle()메소드
		if(boardList.size()>0){      //삭제할 글이 있으면                    
			int index=-1; //직접 입력한 작성자명과 비번을 메모리상에 저장된 값과 비교//-1을 초기값으로 설정
			for(int i=0; i<boardList.size(); i++){
				if(boardList.get(i).getRegister().equals(register)){ //작성자명 비교
					//i번방에있는 BoardVO객체를 불러와서 저장된 값을 get()로 불러와서 register값과 비교
					if(boardList.get(i).getPasswd().equals(passwd)){
						boardList.remove(boardList.get(i)); //일치하는글이 있으면 삭제 remove()
						index=i; //글이저장된 인덱스값을 할당하고빠져나옴
					}
				}
			}
			if(index==-1){  //작성자명과 비번이 일치되지 않는경우 초기값과 그대로 -1
				System.out.println("해당 작성자가 없거나 비밀번호가 일치하지 않습니다.");
				return;
			}
		}else{
			System.out.println("작성된 글이 존재하지 않습니다.");
		}
	}
}
