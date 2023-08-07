package p2023_07_20;
//p236-237

class Korean{
     //필드
    String nation = "대한민국"; //<-생략(default) 접근제어자생략됨
	String name;
	String ssn;
	
	//생성자 : 생성자앞에는 접근제어자만 올수있음. 메인메소드가 없어서 컴파일까지만 가능
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
}


public class KoreanEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Korean k1 = new Korean ("박자바","011225-1234566");
        System.out.println("k1.name:"+k1.name);
        System.out.println("k1.name:"+k1.ssn);
        
        Korean k2 = new Korean ("김자바","930525-0623451");
        System.out.println("k1.name:"+k1.name);
        System.out.println("k1.name:"+k1.ssn);
	}

}
