package p2023_07_25;

import java.util.*;

//StrringTokenizer
//:특정 문자열에서 구분기호 (#)를 이용해서 데이터를 파싱한 다음에 문자열(토큰)을
// 구해오는 경우에 사용한다.
// 토큰(token): 이순신, 을지문덕, 강감찬, 광개토대왕

class StringTest04 {

  public static void main(String[] args) {
    StringTokenizer str = 
		new StringTokenizer("이순신#을지문덕#강감찬#광개토대왕", "#"); //(문자열,#) # <-구분기호
    
//    System.out.println(str.nextToken()); //이순신 /nextToken()<-다음토큰을 가져온다
//    System.out.println(str.nextToken()); //을지문덕 
//    System.out.println(str.nextToken()); //강감찬 
//    System.out.println(str.nextToken()); //광개토대왕 
//    System.out.println(str.nextToken()); //예외발생 NoSuchElementException

	//파싱(분리)된 문자열이 모두 몇 개인지 되는지 알려줌 
    int cnt = str.countTokens();  
    System.out.println("파싱할 문자열의 총갯수-> " + cnt);
//
//	System.out.println(str.nextToken());
    while(str.hasMoreTokens()){ //hasMoreTokens() <-가져올 토큰이 있으면 true ,  boolean값으로 구분
     //차례대로 파싱된 문자열(토큰)을 얻어온다.
    	System.out.print(str.nextToken()+"\t");//차례대로 파싱된 문자열을 얻어온다.
	}

  }  // main() end 

}      