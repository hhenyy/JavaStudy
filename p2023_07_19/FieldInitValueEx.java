package p2023_07_19;

//p228
//class가 2개

class FieldInitValue{        //ArraryEx01 참고 (배열에서의 초기값과 같음)
	//필드                   //필드만 있어서 독립적 실행 불가
	byte byteField;         //0으로 초기화
	short shortField;
	int intField;
	long longField;
	
	boolean booleanField;   //false로 초기화
	char charField;         //빈공백
	
	float floatField;       //실수형:0.0으로 초기화
	double doubleField;
	
	int[] arrField;          //null로 초기화   (참조형:배열)
	String referenceField;   //null로 초기화  (참조형:String)
}                            //null:참조할 주소가 없다는 의미
public class FieldInitValueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FieldInitValue fiv =new FieldInitValue();
		
		System.out.println("byteField:"+fiv.byteField);
		System.out.println("shortField:"+fiv.shortField);
		System.out.println("intField:"+fiv.intField);
		System.out.println("longField:"+fiv.longField);
		System.out.println("booleanField:"+fiv.booleanField);
		System.out.println("charField:"+fiv.charField);
		System.out.println("floatField:"+fiv.floatField);
		System.out.println("doubleField:"+fiv.doubleField);
		System.out.println("arrField:"+fiv.arrField);
		System.out.println("referenceeField:"+fiv.referenceField);

	}

}
