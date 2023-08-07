package p2023_07_26;

class Point2D{       //부모 클래스
  private int x;     //필드
  private int y;
  public int getX( ){
     return x;
  }
  public void setX(int new_X){
    x=new_X;              //10
  }
  public int getY( ){
     return y;           
  }
  public void setY(int new_Y){
    y=new_Y;                  //20
  }
}

//1. 자바에서는 클래스를 상속 받을때 extends로 상속을 받는다. (인터페이스는 다른걸로 받음)
//2. 자바에서는 부모 클래스를 상속 받으면, 부모 클래스 안에 들어 있는 필드와 메소드만 
//   상속 받는다.
//3.자바에서는 1개의 부모 클래스만 상속을 받을 수 있다.(클래스는 단일상속만 가능)
//  자바에서는 클래스의 다중 상속을 허용하지 않는다.
class Point3D extends Point2D{  //Point3D<-자식클래스
  private int z;
  public int getZ( ){
     return z;
  }
  public void setZ(int new_Z){
    z=new_Z;            //30
  }
}
class SuperSub00{
  public static void main(String[] args){

    Point3D  pt=new Point3D( );
    pt.setX(10); //상속받아 사용
    pt.setY(20); //상속받아 사용
    pt.setZ(30); //자신의 것 사용
    System.out.println( pt.getX( )//상속받아 사용 
               +", "+ pt.getY( )//상속받아 사용 
               +", "+ pt.getZ( ));//자신의 것 사용
  }
}