package p2023_07_18;

public class Report02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	     과제  2. 2차원 배열을 이용해서 5명 학생들의 국어,영어,수학        
//	          점수를 저장 했을때, 과목별 총점과 학생별 총점을 
//	          출력하는 프로그램을 작성하세요?
//	          (단, 과목명(국어,영어,수학), 학생번호를 출력 하세요) 
//            네이버 클라우드 - 문서 - 배열 -  Arr04.java
		
//+일차형배열 추가 
//String[] str1= {"자바","오라클","스프링","파이썬","텐스플로우"};
		
		int [][]score = { { 85,  60,  70},   //0 행
					      { 90,  95,  80},   //1 행
					      { 75,  80, 100},   //2 행
	                      { 80,  70,  95},   //3 행
					      {100,  65,  80}    //4 행
						};
	    int [] subject = new int[3]; //과목총점 저장 
	    int [] student = new int[5]; //학생의 총점 저장
	    String [] subjectname ={"국어","영어","수학"};
	    String [] studentname ={"영일","영이","영삼","영사","영오"};
	        //    subject[0]=0, subject[1]=0,subject[2]=0,
	        //    student[0]=0, student[1]=0,student[2]=0,student[3]=0,student[4]=0
	        //sum은 지역변수라서 초기값 설정해야하지만, 기본형인 int는 자동으로 초기값 0으로 설정되어있어 설정필요x
	    int  r, c;  
		    
	    System.out.println("각 과목별 총점구하기 ");
	    for(c = 0; c < 3 ; c++){ // 과목         
	      for(r = 0; r < 5 ; r++){ //학생      
	        subject[c] += score[r][c];   
	      }//subject[c]=subject[c]+score[r][c];
	      System.out.print(subjectname[c]+"\t");
	      System.out.println(subject[c]);                                
	    }

	    System.out.println("학생별 총점구하기");
	    for(r = 0; r < 5 ; r++){    //학생      
	      for(c = 0; c < 3 ; c++){  //과목    
	        student[r] += score[r][c];  
	      }//student[r]=student[r]+score[r][c];
	      System.out.print(studentname[r]+"\t");
	      System.out.println(student[r]);
	    }

	  }//main() end
		
		
		
	}


