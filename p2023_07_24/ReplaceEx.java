package p2023_07_24;
//문자열 대치 replace(oldChar,newChar)
//: oldChar를 newChar로 치환해주는 역할

//p494

public class ReplaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//replace("자바","JAVA"): 자바를 JAVA로 치환해주는 역할
		
		String oldStr = "자바는 객체지향 언어 입니다.";
		
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);  //자바는 객체지향 언어입니다.
		System.out.println(newStr);  //JAVA는 객체지향 언어입니다.
		
	}

}
