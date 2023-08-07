package p2023_07_20;

import java.util.Scanner;

//과제. 
//키보드를 통해서 각 회원들의 정보를 입력 받는 클래스(MemberInput)를 작성한다. 
//이때 입력 받는 회원의 정보는 성명, 나이, 이메일, 주소를 입력 받는다. 
//그리고 키보드로 입력한 회원의 정보는 새로운 회원정보를 저장하는 클래스(MemberInfo)의 멤버변수에 
//저장을 시킨후 출력하는 프로그램을 작성하시오.
//1. MemberInfo클래스의 멤버변수를 초기화 방법은 생성자를 이용하세요.
//2. 1명의 회원정보를 입력 받아서 처리한다. 
//   가능하면 2명 이상의 회원 정보도 입력 받아서 처리 해보자.(객체배열 이용)

//예)   
class MemberInfo{
	private String name;  //필드 ,전역변수선언  private 다른클래스접근불가{}안만가능 정보보안문제로..?
	private int age;
	private String email; 
    private String address;
    
    public MemberInfo(){  //기본 생성자 (매개변수가 없는 생성자)  
    	                  //생성자 : 생성자앞에는 접근제어자만 올수있음. 메인메소드가 없어서 컴파일까지만 가능
    	                  //자바소스파일 -컴파일->바이트 코드파일
    }
      
    public MemberInfo(String name, int age, String email, String address) { //매개변수를 가진 생성자 //public은 모두접근가능
    	this.name = name;  
    	this.age = age;
    	this.email = email;    
    	this.address = address;   
    }


      public void print(){ //class를 호출한 상태이면 메소드역할세가지 MyDate06 참고 수정(세터),값확인(게터),출력(프린트)
    	System.out.println(name+ "/" +age+ "/" +email+"/"+address); 
      }
}

public class MemberInput {

	public static void main(String[] args) {    //메인메소드있어야 실행. 없으면 컴파일만
		// TODO Auto-generated method stub
		System.out.println("회원의 정보 성명, 나이, 이메일, 주소를 입력하세요.");  //<-메인메소드에 적어야 되는이유..?
		Scanner sc= new Scanner(System.in); 
		String name;  //변수선언
		int age;
		String email;
		String address;
		name=sc.nextLine(); //입력칸만들고
		age=sc.nextInt();   
		sc.nextLine();     //엔터도 문자로인식
		email=sc.nextLine();
		address=sc.nextLine();
	
		
		MemberInfo d = new MemberInfo(name,age,email,address);	//생성자완성
		d.print(); //프린트메소드실행 MyDate05참고

	}

}
