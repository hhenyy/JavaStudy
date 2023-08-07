package p2023_07_20;

public class UseNoneObject {

    public static void main( String[] args ) {
    
    NoneObject no = new NoneObject();
    System.out.println("no.number = " + no.number);
    no.printNumber();
    
    //정적 필드와 정적 메소드는 객체를 생성하지 정적필드를 가진 클래스명으로 dot(.)으로
    //접근해서 사용한다.
    
    //정적필드로 접근해서 출력함: 클래스.정적필드명  (정적메소드를 가지고있는 클래스 명.)
    System.out.println("NoneObject.number = " + NoneObject.number); //정적필드
    
    //정적메소드를 호출함 : 클래스.정적메소드명 (정적메소드를 가지고있는 클래스 명.)
    NoneObject.printNumber();
    
    }
}    