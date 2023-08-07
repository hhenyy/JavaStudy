package p2023_07_21;
//p280

class Singleton{ //새로운 클래스 추가 , 1개의 파일에 2개의클래스
	
	//싱글톤(Singleton) :객체 생성을 1번만 수행하는것.
	private static Singleton s = new Singleton(); //정적 필드 
	                                              //외부접근불가하도록 일반적으로 private로 막음.
	                                              //그래서 다이렉트로 접근불가하도록
	
	private Singleton() {} ; // 직접 객체 생성을 막아주는 역할

	//정적 메소드를 이용해서 공유를 한다.
	public static Singleton getInstance() { //정적 메소드
		return s;                       //s값 리턴받음
	}
	
	public void check() {
		System.out.println("메소드 호출 성공1");
	}
	public void check1() {
		System.out.println("메소드 호출 성공2");
	}
}

public class SingletonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// private접근 제어 때문에 외부 클래스에서 접근 할수 없음.
//		System.out.println(Singleton.s); //오류발생 
		
		Singleton obj1 = Singleton.getInstance(); //정적 메소드 호출
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
		if(obj1 == obj2) { //주소값 비교 (obj1,2는 공유되어서 같은주소임)
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}	
	//    Singleton s = new Singleton(); //오류발생
		
		obj1.check();
		obj1.check1();
		obj2.check();
		obj2.check1();
	
		
		}
	}

