package p2023_07_20;

public class NoneObject {
    static int number = 3; //static이 붙어있는 필드:정적 필드 -> 공유영역에 저장
    
    public static void printNumber() { //static이 붙어있는 메소드: 정적 메소드
        System.out.println("number = " + number);
    }
}            