package p2023_08_01;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumIterVector {
	
    public static void main( String[] args ) {
    	
	// Vector 객체 생성
	Vector v = new Vector( 1, 1 );
		
	// Vector에 Object 저장 //add()와 addElement() 둘다가능
	v.add( 30 );
	v.addElement( new Integer( 10 ));
	v.addElement( "johnharu" );
	v.addElement( "gracedew" );

	//방법1. vector 자료구조에 저장된 데이터 출력 (set,list도 이방법 가능)
	System.out.println(v); //순차적 자료구조
	
	//방법2.get(int index) 가장많이씀
	for(int i=0; i<v.size();i++) {
		System.out.print(v.get(i)+"\t");
	}
	System.out.println();
	
	//방법3. 나열형(Enumeration) :vector만 가능 , 반복자(Iterator)와 기능비슷
	// Vector의 Object의 나열형을 리턴
	Enumeration e = v.elements(); //elements()<-원소값들을 모두가져옴
	
	// Enumeration을 이용해 Vector의 Object를 출력
	while(e.hasMoreElements() ) { //가져올 데이터가 있을떄 true리턴
	    System.out.print(e.nextElement() +"\t");
	    System.out.println();
	}
	//방법4.반복자(Iterator):
	// Vector의 Object의 나열형을 리턴
	Iterator ie = v.iterator(); //iterator()<-원소값들을 모두가져옴
		
	// Iterator을 이용해 Vector의 Object를 출력
	while( ie.hasNext() ) {
	    System.out.print( ie.next() +"\t" );
	}	

    } //main end   
}
