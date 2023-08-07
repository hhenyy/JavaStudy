package p2023_07_20;
//p253-254
class Computer{
	//주소값 전달에 의한 메소드 호출방식(call by reference방식)
	int sum1( int[] values) {  //int[] values <-배열로되어있어,int형 배열의 주소값전달
		int sum=0;
		for(int i=0; i< values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
	//vargus :전달된 값은 배열로 받는다. 잘 쓰진 않음.
	int sum2(int ... values) {
		int sum=0;  //sum=0초기값되어야만 0번방부터 합구할수있음.
		for(int i=0; i<values.length;i++) {
			sum+= values[i];
		}
		return sum;
	}	
}
public class ComputerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer mycom = new Computer();
		
		int[] values1= {1,2,3};
		int result1 =mycom.sum1(values1);
		System.out.println("result1:"+result1);

		int result2 =mycom.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2:"+result2);

		int result3 =mycom.sum2(1,2,3);
		System.out.println("result3:"+result3);
		
		int result4 =mycom.sum2(1,2,3,4,5);
		System.out.println("result4:"+result4);
	}

}
