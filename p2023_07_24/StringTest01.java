package p2023_07_24;

//toUpperCase(): 대문자로 변환 해주는 역할
//toLowerCase(): 소문자로 변환 해주는 역할

class StringTest01 {
	
	// String클래스
	//1.String 객체를 생성한 후에 메소드에 의해서 값의 변화가 일어나면 
	//  변경된 값을 힙메모리 영역에 다시 저장한다.
	//2.힙메모리 영역에 변경된 값을 재사용 하기 위해서는 새로운 변수로 변경된 값을 
    //  저장해서 사용해야된다.
	// ex) String str2=str1.toUpperCase(); 
	//3.힙메모리 영역에 변경된 값을 재사용 할 수 없을 경우에는 쓰레기로 인식하고
	//  힙메모리 영역의 데이터를 가비지 콜렉터 프로그램이 모아서 지워버린다.
	//  ext) str1.toUpperCase();   <-대문자로 변경된값이 리턴받는 주소값이 없으면 재사용이 되지않고 없어짐
	//4. Garbage Collection 기능(쓰레기 수집 기능)
	//   재사용할 수 없는 힙메모리 영역의 데이터를 모아서 지워주는 기능

  public static void main(String[] args) {
    String str1 = "Java Programming";
	str1.toUpperCase();            //메서드 호출 후에도 
    System.out.println(str1);      //str1의 내용은 수정되지 않는다.  (참조가능한 주소인 변수도 없고 출력 코드도 없어서 변경은되지만 재사용이 되지않고 없어짐)
	System.out.println(str1.toUpperCase()); 

    String str2=str1.toUpperCase();  //메소드의 처리 결과를 str2에 주소값을 받아 저장//str2라는 새로운 변수로 리턴받았기때문에 재사용 하여 출력가능
    System.out.println(str2);          
  }    
}  