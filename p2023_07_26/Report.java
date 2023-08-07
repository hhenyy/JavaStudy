package p2023_07_26;

public class Report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				// TODO Auto-generated method stub
				
		//Math 클래스 
		//Math 클래스= 정적필드 +정적 메소드 / 클래스명.으로 만들어져있는 클래스를 불러오면 됨.
		//Math 클래스는 생성자가 제공되지 않기 때문에, Math클래스로
		//직접 객체를 생성할 수 없다.
//				Math m = new Math(); //오류발생

				
				//0.0 <=Math.random() <1.0
		for (int i=0;i<6;i++) {
			int[] r= new int[6];
			r[i]= (int)(Math.random()*46) +1 ; //난수 발생 :1~46
			
			for (int d=0;d<=i;d++) {
			if (r[i]==r[d]) {
				continue;
			}else
				break;
			
		
			}
			System.out.print("\t"+r[i]);

		}
	}
}


