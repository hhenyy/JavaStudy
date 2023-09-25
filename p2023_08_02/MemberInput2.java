package p2023_08_02;
//과제. 
//키보드를 통해서 각 회원들의 정보를 입력 받는                        
//클래스(MemberInput)를 작성한다. 
//이때 입력 받는 회원의 정보는 성명, 나이, 이메일, 주소를  
//입력 받는다. 
//그리고 키보드로 입력한 회원의 정보는 새로운
//회원정보를 저장하는 클래스(MemberInfo)의 멤버변수에 
//저장을 시킨후 출력하는 프로그램을 작성하시오.
//(단, 1명의 회원정보를 입력 받아서 처리한다. 
//가능하면 2명 이상의 회원 정보도 입력 받아서 처리 해본다.)
//2명 이상의 정보를 처리할때 List 자료구조를 이용해서 해결하세요.

//예)   
// MemberInput클래스 	
//public static void main(String[] args){

//}

// MemberInfo클래스
//private String name;
//	 private int age;
//	 private String email;
// private String address;

 //setter 메소드

 //getter 메소드


import java.util.ArrayList;
import java.util.Scanner;

public class MemberInput02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList li = new ArrayList();
		MemberInfo mm;
		String yn;

        Scanner sc = new Scanner(System.in);
		
		do {			
			System.out.print("성명을 입력하세요? ");
			String name = sc.nextLine();
			System.out.print("나이를 입력하세요? ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("E-Mail을 입력하세요? ");
			String email = sc.nextLine();
			System.out.print("주소를 입력하세요? ");
			String address = sc.nextLine();

			MemberInfo m = new MemberInfo();
			// m.name="홍길동";
			m.setName(name);
			m.setAge(age);
			m.setEmail(email);
			m.setAddress(address);

			li.add(m);

			System.out.println("계속할려면 y, 멈출려면 n을 입력?");
			yn = sc.next();
			if (yn.equals("y")) {
				continue;
			} else if (yn.equals("n")) {
				break;
			}

		} while (true); //조건식이 true가 되면 다시 do{} 중괄호 내부를 반복 실행

		for (int i = 0; i < li.size(); i++) {
			mm = (MemberInfo) li.get(i);

			System.out.println("성명:" + mm.getName());
			System.out.println("나이:" + mm.getAge());
			System.out.println("E-Mail:" + mm.getEmail());
			System.out.println("주소:" + mm.getAddress());
		}
	}

}

// DTO(Data Transfer Object)
class MemberInfo extends Object{
	private String name;
	private int age;
	private String email;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
