package p2023_07_21;

public class MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Math 클래스 
//Math 클래스= 정적필드 +정적 메소드 / 클래스명.으로 만들어져있는 클래스를 불러오면 됨.
//Math 클래스는 생성자가 제공되지 않기 때문에, Math클래스로
//직접 객체를 생성할 수 없다.
//		Math m = new Math(); //오류발생
		
		System.out.println("E="+Math.E); //오일러 상수
		System.out.println("PI="+Math.PI); //원주율
		
		System.out.println("abs()="+Math.abs(-10)); //절대값:10
		System.out.println("ceil()="+Math.ceil(3.14)); //올림기능:4.0 (소수첫쨰자리에서 올림)
		System.out.println("round()="+Math.round(10.5)); //반올림기능:11 (소수첫쨰자리에서 반올림)
		System.out.println("floor()="+Math.floor(10.9)); //내림기능:10.0 (소수첫쨰자리에서 내림)
		System.out.println("max()="+Math.max(10,20)); //최대값:20 ,3개값쓰면 오류발생
		System.out.println("min()="+Math.min(10,20)); //최소값:10 ,3개값쓰면 오류발생
		System.out.println("pow()="+Math.pow(2,3)); //2의 3승:8.0
		System.out.println("pow()="+Math.pow(2,3)); //2의 3승:8.0
		
		//0.0 <=Math.random() <1.0
		System.out.println("random()="+Math.random()); //실수형태의 난수(무작위수) 발생 
		
		int d = (int)(Math.random()*6)+1; //난수 발생 : 1~6
		System.out.println("주사위 번호:"+d);
		
		int r= (int)(Math.random()*45) +1 ; //난수 발생 :1~45
		System.out.println("로또번호:"+r);
		
		System.out.println("sqrt()="+Math.sqrt(5)); //제곱근 :2.23606797749979
		System.out.println("sqrt()="+Math.sqrt(9)); //제곱근 :3.0

	
	}

}
