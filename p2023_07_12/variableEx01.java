package p2023_07_12;
//p.53// x,y 변수
public class variableEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 3;
		int y= 5;
		System.out.println("x:"+x+",y:"+y);
		
		int temp=x; //3  temp는 x에 있는 값을 할당한다.
		x=y;  //x=5
		y=temp;   //y=3     
		System.out.println("x:"+x+",y:"+y);
	}

}
