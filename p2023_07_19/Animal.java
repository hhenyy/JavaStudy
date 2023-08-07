package p2023_07_19;

public class Animal {
	//       사용자 정의 클래스
	
	int age; //변수생성 , 필드(field),멤버변수,전역변수 :  heap메모리 영역에 저장  
	         //메소드 바깥쪽에 정의되는 변수  //int형이라 초기값설정하지않아도 초기값 0으로 설정됨
	
	public Animal () {   //<-Animal이 생성자, ()를 가짐. 클래스명과 동일
		                  //기본 생성자(Default constructor)
		                  //매개변수가 없는 생성자
		System.out.println("생성자 호출 성공");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10; //지역변수: stack 영역에 저장
		
		String str = new String("자바");  //string클래스로 string객체를 만듬

		Animal    a1   = new    Animal();   //Animal은 사용자정의 클래스
//      클래스 레퍼런스변수  연산자   생성자 호출   //Animal();<-생성자가 아니고 생성자를 호출하는 코드
		
//		System.out.println(age);    //오류발생 지역변수라서? heap메모리의 age값을 불러올떄 heap메모리의 어떤영역의age인지 모름.
		System.out.println(a1.age); //0
		a1.age= 5;                  //age의 값을 5로 수정
		System.out.println(a1.age); //5
		
		Animal a2 = new Animal();
		System.out.println(a2.age);  //0
		
		if (a1==a2) {         //주소값을 비교
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
//		System.out.println(a1.equals(a2)); //false oper04참고
	}

}
