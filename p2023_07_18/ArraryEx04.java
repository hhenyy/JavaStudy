package p2023_07_18;

public class ArraryEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//배열에 저장된 데이터 중에서 최대값과 최소값을 구하는 프로그램 작성
		double []data= {9.5, 7.0, 13.6, 7.5, 10.5}; 
		
		double max, min;
		max= data[0]; //9.5  data 0번방의 값을 max변수로 초기값설정
		min= data[0]; //9.5  data 0번방의 값을 min변수로 초기값설정
		
	   for(int i=1; i<data.length; i++) {  //<-0번방이 0번과 비교필요는 없어서 i=1
	       if(data[i]>max) max= data[i];
	       if(data[i]<min) min= data[i];
	   }
	       System.out.println("max:"+max);  //max:13.6
	       System.out.println("min:"+min);  //min:7.0
		
		
	}


}