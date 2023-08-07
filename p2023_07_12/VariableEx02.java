package p2023_07_12;
//p55
//변수의 범위: 지역변수
public class VariableEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if문 안에서 정의된 지역변수 v2는 if문 안에서만 사용 할 수 있다.
		
		int v1=15;
		if(v1>10) {
			int v2;      //v2:지역변수  if문 앞에서만 사용가능한 지역변수, if문이 없어지면 메모리에서 사라짐.
			v2=v1-10;
		}
		
//		int v3=v1+v2+5; //오류발생 if문 밖에서 사용했기 때문
	}

}
