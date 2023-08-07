package p2023_07_21;



class FinalMember {
  final int a=10;		// 상수 : 일정한값을 가지는 수 (값을 수정할 수 없다)
  
  public void setA(int a){
  //  this.a=a;    //상수는 값을 수정할 수 없다. 근데 수정을 시도하고있어 오류 발생.
  }
}

public class FinalTest01{
  public static void main(String[] args) {
    FinalMember ft= new FinalMember();
	final int a=1000;
    ft.setA(100);         
    System.out.println(a);
  }
}                                                    
