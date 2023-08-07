package p2023_07_26;

public class WrapperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //Integer 클래스는 기본생성자를 지원하지 않기 때문에
		//기본생성자로 Integer 객체를 생성하면 오류가 발생한다.
//		Integer num = new Integer();   //오류발생
		
		//박싱(boxing) : heap 메모리를 박스로 생각하고, stack메모리에 저장된 10을
		//              heap 메모리에 복사 하는것. (박스에 집어 넣는다)
		int n = 10;                    //지역변수(stack영역에 저장)
		Integer num01= new Integer(n); //박싱(boxing)//주로 integer객체를 생성할떄 박싱이 일어남.
		
		//언박싱(unboxing) : heap메모리(박스)에 있는 데이터를 stack메모리로 가져오는것.
		int n01= num01.intValue();     //언박싱(unboxing)
		
		//자료형 변환 : "20" --> 20
		String s= "20";
		Integer num02 = new Integer(s);  //박싱(boxing)  //integer(string s)사용
		
		int n02 =num02.intValue();       //언박싱(unboxing)//int형으로 자료형 변환 되어 숫자20을 돌려줌.

	}

}
