package p2023_08_03;

public class ThrowsEx1 {

//예외가 발생하면 setData()메소드를 호출한 main()메소드로 예외를 양도한다.
	public void setData(String n) throws NumberFormatException{
		if(n.length() >= 1){  //length() 문자열의길이     //String n = "5"; //String n = "a";
			String str = n.substring(0,1); //String str="5"//String str="a" //substring()전체문자의 일부추출
			printData(str);
		}
	}
//예외가 발생하면 printData()메소드를 호출한 곳에 예외를 양도한다.
	private void printData(String n) throws NumberFormatException{
		int dan = Integer.parseInt(n);   //String n = "5"; //String n = "a";->아스키코트가아니라서 Int형으로 자료형 변환 불가 밑내용 실행 하지않고 throws로 던짐
		System.out.println(dan+"단");
		System.out.println("-----------");
		for(int i=1 ; i<10 ; i++)
			System.out.println(dan+"*"+i+"="+(dan*i));
	}

	public static void main(String[] args){ //매개변수가 string1차형배열
		ThrowsEx1 t1 = new ThrowsEx1();
               //args[0] = "a"; 예외 발생
		       //args[0] = "5"; 예외가 발생하지 않음
		try{
			t1.setData(args[0]); //args[0] 자바가상머신을통해 값전달해서 처리
		}catch(Exception e){
			System.out.println("첫문자가 숫자가 아닙니다.");
		}
	}//main() end

  }
