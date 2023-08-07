package p2023_08_01;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

//p577~578
//Hashtable :아이디와 비밀번호 검사하기

public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String>map = new Hashtable<String,String>();
		
		//put(Object key, Object value)
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요");
			System.out.println("아이디:");
			String id = sc.nextLine();
			
			System.out.println("비밀번호:");
			String passward = sc.nextLine();
			System.out.println();
			
			//containsKey(id)
			//:사용자가 입력한 id값이 map의 key가 있으면 true리턴
			if(map.containsKey(id)) {
				if(map.get(id).equals(passward)) {
					System.out.println("로그인 되었습니다.");
				    break; //반복문을 빠져나온다.
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
				
			}else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}

	}

}
