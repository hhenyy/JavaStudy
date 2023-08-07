package p2023_07_31;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		** 레퍼런스 형변환 **
//		   - 두개의 클래스 사이에 상속관계가 있어야함 (상속관계가 없으면 레퍼런스 형변환 불가)
//		 
//		* 업캐스팅(자동 형변환)
//		   1. 서브클래스에서 슈퍼클래스로 형변환 하는것 (자식객체를 만들어서 부모에게 전달)
//		   2. 업캐스팅되면 참조 가능한 영역이 축소가 된다.(업 캐스팅 후에는 부모로부터 상속받은 메서드만 호출할 수 있다)
//		   3. 컴파일러에 의해서 암시적 형변환(자동 형변환) 된다.

//ex1.
		//Callendar 클래스가 추상 클래스이기 때문에 자체적으로 객체를 
		//생성할 수 없다. 
		//Calendar c = new Calendar();  //오류발생(추상클래스)
		
		Calendar c1= Calendar.getInstance();  //1. calendar클래스의 getInstance 정적메소드를 통해 객체 생성?
       
		//업캐스팅이 되면 Calendar가 상속해준 메소드는 호출할수 있다.
		//자식 클래스의 메소드는 호출 할수 없다.
		//자식클래스 GregorianCalendar//부모클래스 Calendar
		Calendar c2 = new GregorianCalendar(); //2. 업캐스팅으로 객체 생성//자동형변환이라(Calendar)생략가능
		
		GregorianCalendar c3 = new GregorianCalendar(); //3.하위클래스로 객체생성
		
//ex2.
		//List 인터페이스는 자체적으로 객체생성 불가능
	//	List li = new List();  //오류발생
		List list = new ArrayList(); //1.List부모, ArrayList구현클래스 //업캐스팅 (List가 상속해준 메소드만 호출)
		ArrayList a1 = new ArrayList();//2.상속받는 클래스로 객체 생성
		
//ex3. List는 배열이 가지지 못하는 기능을 한다.
//     add(Object e)   //add메소드는 매개변수가 object 자료형으로 되어있음.
		list.add(10);  //Object e = new Integer(10) 박싱 + 업캐스팅  //object는 최상위클래스(object의 자식클래스인 여러가지자료형을 허용해서 저장가능)
	                   //new연산자로 Integer객체생성(박싱) 해서 object에 전달(업캐스팅)(자식객체를 만들어서 부모에전달)	
		               //new연산자 안쓰면 자동박싱
        list.add(3.14); //Object e= new Double(3.14) 박싱 + 업캐스팅
                     //new연산자로 Double객체생성(박싱) 해서 object에 전달(업캐스팅)(자식객체를 만들어서 부모에전달)		
        list.add('j'); //Object e= new Character('j') 박싱 + 업캐스팅
        list.add(true); //Object e= new Boolean(true) 박싱 + 업캐스팅
        list.add("자바"); //Object e= new String("자바") 박싱 + 업캐스팅
	
  //    boolean equals(Object e)
        
      //Object e = new String("java"); //업캐스팅
        if("java".equals(new String("java"))) {
        	System.out.println("같은 값");
        }else {
        	System.out.println("다른 값");
        }
       //Object e= new Integer(30);       //박싱+업캐스팅
        //Object e =30;                   //자동 박싱+업캐스팅
        if(new Integer(30).equals(new Integer(30))) {
        	System.out.println("같은 값");
        }else {
        	System.out.println("다른 값");
        }
        
        //Object e= new Double(3.14);       //박싱+업캐스팅
        //Object e =3.14;                   //자동 박싱+업캐스팅
        if (new Double(3.14).equals(new Double(3.14))) {
           	System.out.println("같은 값");
        }else {
        	System.out.println("다른 값");
        }
        

//오른쪽  왼쪽 클래스 다른경우 자료형변환되는것
//왼쪽이 부모인경우: 업캐스팅//오른쪽이 부모:다운캐스팅
//매개변수가 최상위 클래스인 object인 경우 업캐스팅 해야하는경우 가장 많음
//내부적으로 wrapper클래스의 박싱을 한다.??

//----------------------------------------------------------------------
//* 다운 캐스팅(강제 형변환)
//1. 슈퍼클래스에서 서브클래스로 형변환 하는것
//2. 참조 가능한 영역이 확대가 된다.
//3. 컴파일러에 의해서 암시적 형변환(자동 형변환)이 되지 않기    
//   때문에 자료형을 생략할 수 없다.(강제 형변환)

//ex1. List는 배열이 가지지 못하는 기능을 한다.(여러가지 자료형 저장가능)//배열은 한가지 자료형만
        List lt = new ArrayList(); //업캐스팅
        
        //add(Object e)
        lt.add(new String("자바")); //업캐스팅 //내부적으로 string객체를 만들어서 부모 object에 전달해서 업캐스팅됨(자동형변환)
        lt.add("오라클");
        lt.add("JSP");
        lt.add("스프링");
        lt.add("파이썬");
        lt.add("텐스플로우");
        
        //Object get(int index)  //get메소드로 끄집어내서 index번호를? List에 추가??
        
        Object obj = lt.get(0);  
        String s = (String) lt.get(0);  //다운 캐스팅(부모(Object)가 자식에게 전달)
        
        for(int i=0; i<lt.size();i++) { //size() 메소드 //배열에서는 length속성으로 배열의 크기를 구함./문자의 길이 length()메소드
        	Object ob= lt.get(i);
        	                                 //저장된 데이터가 String형이라 String형으로 다운캐스팅
        	String str = (String)lt.get(i); //다운캐스팅(부모Object형->자식String형) //get()메소드 이용해서 index번호? 구해옴(object형으로 되어있음)
        	System.out.println(str);        
        }
   //ex2.
        List ls = new ArrayList(); //업캐스팅
        
     // add(Object e)
        ls.add(10);      //오토박싱 + 업캐스팅
        ls.add(200);
        ls.add(3000);
        ls.add(40000);
        ls.add(500000);
        
      //Object get(int index)
        
        Integer it = (Integer)ls.get(0); //다운 캐스팅 //저장된 데이터가 Integer형이라 Integer형으로 다운캐스팅
        int n1= it.intValue();           //언박싱
        
        //다운 캐스팅 + 언박싱
        for(int i=0; i<ls.size();i++) {
        	Object ob = ls.get(i);
        	
        	Integer t = (Integer)ls.get(i); //다운 캐스팅
            int n3= t.intValue();           //언박싱
            
            //다운 캐스팅 + 언박싱
            int n4= ((Integer) ls.get(i)).intValue(); 
            System.out.println(n4);
    
        }
    
    }
	

}