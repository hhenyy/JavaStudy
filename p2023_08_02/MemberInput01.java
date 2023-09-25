package p2023_09_14;
//과제.
//1.
// 키보드를 통해서 각 회원들의 정보를 입력 받는 클래스                     
//(MemberInput)를 작성한다. 
// 이때 입력 받는 회원의 정보는 성명, 나이, 이메일,주소를  
// 입력 받는다. 그리고 키보드를 입력한 회원의 정보는 새로운
// 회원정보를 저장하는 클래스(MemberInfo)의 멤버변수에 
// 저장을 시킨후 출력하는 프로그램을 작성하시오.
// (단, 1명의 회원정보를 입력 받아서 처리한다. 
//  가능하면 2명 이상의 회원 정보도 입력 받아서 처리 해본다.)
//
// MemberInfo클래스의 멤버변수를 초기화 방법을 생성자 대신에
// setter 메소드를 이용해서 초기화 시켜서 출력하는 프로그램을 작성하세요.
//
//예)   
//  MemberInput 클래스
//    public static void main(String[] args){
//
//    }
//
//      MemberInfo클래스
//    private  String name;
//        private int age;
//        private String email;
//      private String address;
//
//      setter() 메소드


import java.util.Scanner;

public class MemberInput01 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      MemberInfo01[] m = new MemberInfo01[2]; //<- 객체 배열: 객체의 주소를 저장하는 배열, 나중에는 보통List사용
      int i = 0;
      String yn;

      do {
         Scanner sc = new Scanner(System.in);          
         System.out.print("성명을 입력하세요? ");
         String name = sc.nextLine();
         System.out.print("나이를 입력하세요? ");
         int age = sc.nextInt();   
         sc.nextLine();
         System.out.print("E-Mail을 입력하세요? ");
         String email = sc.nextLine();
         System.out.print("주소를 입력하세요? ");
         String address = sc.nextLine();

//         m[i] = new MemberInfo(name, age, email, address);
         // m.name="홍길동";
         
         m[i] = new MemberInfo01();
        //m[i].name="홍길동";
         m[i].setName(name);
         m[i].setAge(age);
         m[i].setEmail(email);
         m[i].setAddress(address);
         
         i++;

         System.out.print("계속할려면 y, 멈출려면 n을 입력?");
         yn = sc.next();
         if (yn.equals("y") || yn.equals("Y")) {
            continue;
         } else if (yn.equals("n") || yn.equals("N")) {
            break;
         }

      } while (true); //<-최소한번은 실행

      for (int j = 0; j < i; j++) {
         System.out.println("성명:" + m[j].getName());
         System.out.println("나이:" + m[j].getAge());
         System.out.println("E-Mail:" + m[j].getEmail());
         System.out.println("주소:" + m[j].getAddress());
      }
   }

}

// DTO(Data Transfer Object) 데이터 전송객체 <-많이사용
class MemberInfo01 {
   private String name;       //private접근제어자: 외부클래스에서 접근불가, 정보보호, 캡슐화
   private int age;           //필드의 접근제어자가 private인 경우 필드값 할당 방법 
                               //1.생성자로 매개변수 통해서 값 초기화 하던지, 
                               //2. set메소드 매개변수로 값 할당 (생성자보단 set메소드 주로사용)
   private String email;
   private String address;
   
//   public MemberInfo(String name, int age, String email, String address) {  //1.생성자이용 (필드값 초기화시키는 역할만함)
//      this.name = name;
//      this.age = age;
//      this.email = email;
//      this.address = address;
//   }   
   
   //필드값을 public으로 만들어줌
   public String getName() {      //get메소드통해 필드값반환
      return name;
   }
   public void setName(String name) {     //2.set메소드통해 필드값할당
      this.name = name;
   }
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }
   public String getEmail() {
      return email;
   }
   public void setEmail(String email) {
      this.email = email;
   }
   public String getAddress() {
      return address;
   }
   public void setAddress(String address) {
      this.address = address;
   }   

}