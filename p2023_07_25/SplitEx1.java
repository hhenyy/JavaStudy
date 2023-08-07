package p2023_07_25;

public class SplitEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String[] split(String regex)
		
		String text = "홍길동&홍길순,김길동,김자바-안화수";
		
		String[] names = text.split("&|,|-");
		
		//기본 for문
		for(int i=0;i<names.length;i++)
			System.out.println(names[i]+"\t");
        System.out.println();
        
        //향상된 for문
        for(String name :names)
        	System.out.println(name+"\t");
	}

}
