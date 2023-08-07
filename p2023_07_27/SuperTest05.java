package p2023_07_27;

class Point2D05{  //부모클래스
  protected int x=10;    //필드
  protected int y=20;
  public Point2D05( ){   //기본 생성자 
	                  //부모클래스의 기본생성자만 자동으로 호출(매개변수가있으면 super로 호출)
    System.out.println("슈퍼 클래스인 Point2D 생성자 호출");
  }
}
class Point3D05 extends Point2D05{ //자식클래스
  protected int z=30;  //필드
  public void print( ){
  System.out.println(x+", "+y+","+z);
  }
  public Point3D05( ){ //기본 생성자 //혹은 매개변수가 있는 생성자여도 된다.
	               //자식 클래스의 생성자가 없어도 컴파일러가 자동으로 만들어준다
	               //매개변수가 있는 생성자가 있는 경우에는 더이상 컴파일러가
	               //기본 생성자를 자동으로 생성해 주지 않는다.
    System.out.println("서브 클래스인 Point3D 생성자 호출");
  }
}

class SuperTest05{
  public static void main(String[] args){
    Point3D05 pt=new Point3D05( ); //자식클래스의 생성자가 객체를 생성할떄 호출되면 연쇄적으로 부모 클래스의 기본생성자호출 후 자식클래스의 기본생성자가 호출된다.
    pt.print( );   //Point3D05( );<-생성자 호출
  }
}
//자식 클래스의 생성자가 없어도 컴파일러가 자동으로 만들어준다
//자식 클래스의 생성자는 기본생성자여도 되고 매개변수가 있는 생성자여도된다.