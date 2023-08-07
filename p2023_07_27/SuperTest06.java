package p2023_07_27;

class Point2D06{  //부모 클래스
  protected int x=10;
  protected int y=20;

  public Point2D06(){
    System.out.println("슈퍼 클래스인 Point2D 생성자 호출");
  }

  public Point2D06(int xx, int yy){  //부모클래스의 매개변수를 가진 생성자는 자동으로 호출되지 않음.
  x=xx; //50//부모클래스의 기본생성자가 없으면 자식클래스의 생성자 호출시 부모클래스의 기본생성자 연쇄적호출이 불가능하여 자식클래스의 기본생성자에서 오류발생 
  y=yy; //60
  }
}

//super()
//1. super()는 부모 클래스의 매개변수를 가진 생성자를 호출할때 사용한다.
//2. super()는 자식 클래스의 생성자 안에서 첫번째 라인에 사용해야 한다.
//3. super()를 이용해서 부모 클래스의 매개변수를 가진 생성자를 호출하면,
//   더이상 부모 클래스의 기본 생성자를 호출해주지 않는다.

class Point3D06 extends Point2D06{  //자식 클래스
  protected int z=30;
  
  public void print( ){
  System.out.println(x+", "+y+","+z);
  }
  public Point3D06(){               //기본 생성자
	  super(50,60); //부모 클래스의 매개변수가 있는 생성자 호출(자식클래스의 메소드 안에서 써야함)
	                //부모 클래스의 기본생성자와 매개변수가있는 생성자 둘중 매개변수가 있는 생성자 한개만 호출된다.(동시에 호출되지 않는다)
	  System.out.println("서브 클래스인 Point3D 생성자 호출");
  }
}
class SuperTest06{
  public static void main(String[] args){
     Point3D06 pt=new Point3D06( );
    pt.print( );  //생성자 호출
  }
}