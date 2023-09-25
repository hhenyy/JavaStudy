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
// 가능하면 2명 이상의 회원 정보도 입력 받아서 처리 해본다.)
//
//2명 이상의 정보를 처리할때 List 자료구조를 이용해서 해결하세요.
//
//예)   
// MemberInput클래스 	
//public static void main(String[] args){
//
//}
//
// MemberInfo클래스
//private String name;
//	 private int age;
//	 private String email;
// private String address;
//
// setter 메소드
//
// getter 메소드

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MemberInfo extends Object{
	private String name;
	private int age;
	private String email;
	private String address;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

public class MemberInput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<MemberInfo> list = new ArrayList<MemberInfo>();

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("성명");
			String name = sc.nextLine();

			System.out.println("나이");
			int age = sc.nextInt();
			sc.nextLine();

			System.out.println("이메일");
			String email = sc.nextLine();

			System.out.println("주소");
			String address = sc.nextLine();

			MemberInfo m = new MemberInfo();
			m.setName(name);
			m.setAge(age);
			m.setEmail(email);
			m.setAddress(address);

			// boolean add(Object e)
			list.add(m);  //list배열에 값을 넣으려면 add()이용

			System.out.println("계속하려면 y,멈추려면 n을 입력하세요");
			String yn = sc.nextLine();
			if (yn.equals("y") || yn.equals("Y")) {
				continue;
			} else if (yn.equals("n") || yn.equals("N")) {
				break;
			}

		} while (true);

		for(int i=0;i<list.size();i++) {
			// Object get(int index)
			MemberInfo m = list.get(i); //get(i)이용해서 list의 인덱스값을 m에 저장 
			                          //다운캐스팅 (MemberInfo)자료형 생략하려면 list배열 생성할떄 <<MemberInfo>제네릭 넣기
			
			System.out.println(m.getName());
			System.out.println(m.getAge());
			System.out.println(m.getEmail());
			System.out.println(m.getAddress());
		}
		
		
		
	}

}