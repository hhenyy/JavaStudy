package p2023_07_21;
//과제. 
//키보드를 통해서 각 회원들의 정보를 입력 받는 클래스(MemberInput)를 작성한다. 
//이때 입력 받는 회원의 정보는 성명, 나이, 이메일, 주소를 입력 받는다. 
//그리고 키보드로 입력한 회원의 정보는 새로운 회원정보를 저장하는 클래스(MemberInfo)의 멤버변수에 
//저장을 시킨후 출력하는 프로그램을 작성하시오.
//1. MemberInfo클래스의 멤버변수를 초기화 방법은 생성자를 이용하세요.
//2. 1명의 회원정보를 입력 받아서 처리한다. 
// 가능하면 2명 이상의 회원 정보도 입력 받아서 처리 해보자.(객체배열 이용)

import java.util.Scanner;

public class MemberInputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 배열
		MemberInfoEx[] m = new MemberInfoEx[5];
		int i = 0;
		String yn;
		Scanner sc = new Scanner(System.in);
		String name, email, address;
		int age;
		do {						
			System.out.print("성명을 입력하세요? ");
			name = sc.nextLine();  //띄어쓰기있어도 한줄모두 인식  next();는 띄어쓰기 인식?
			System.out.print("나이를 입력하세요? ");
			age = sc.nextInt();// 숫자를 입력받은후에 enter키를  
			sc.nextLine();	    // 누르면 null값을 return하게 됨
			System.out.print("E-Mail을 입력하세요? ");
			email = sc.nextLine();			
			System.out.print("주소를 입력하세요? ");
			address = sc.nextLine();		
	
			m[i] = new MemberInfoEx(name, age, email, address); //MemberInfoEx(name, age, email, address);<-생성자호출
			//m[i].name="홍길동";
			i++;

			System.out.print("계속할려면 y, 멈출려면 n을 입력?");
			yn = sc.nextLine();
			if (yn.equals("y") || yn.equals("Y")) {
				continue;
			} else if (yn.equals("n") || yn.equals("N")) {
				break;
			}

		} while (true);

		for (int j = 0; j < i; j++) {
			System.out.println("성명:" + m[j].getName());
			System.out.println("나이:" + m[j].getAge());
			System.out.println("E-Mail:" + m[j].getEmail());
			System.out.println("주소:" + m[j].getAddress());
			
			m[j].print();
		}
	}

}

//DTD(Data Transfer Object)
class MemberInfoEx {
	private String name;//주소값이 있어도 private접근자라 class내에서만사용 메인메소드에서 사용불가? 다이렉트 접근금지 정보은닉
	private int age;
	private String email;
	private String address;

	public MemberInfoEx(String name, int age, String email, String address) {    //생성자 :필드값 초기화만함.
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}
	
	public void print(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(email);
		System.out.println(address);
	}


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

}
