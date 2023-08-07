package p2023_07_20;

public class Shared {
    public static void main( String[] args ) {
    
        StaticCount sc1 = new StaticCount();
        System.out.println("sc1.number = " + sc1.number); //3
        
        sc1.number++; //number값을 1증가 시킨다.
        System.out.println("sc1.number = " + sc1.number);  //4
        
        StaticCount sc2 = new StaticCount();
        System.out.println("sc2.number = " + sc2.number);  //4  (?)
        
        sc2.number++; //number값을 1증가 시킨다.
        System.out.println("sc2.number = " + sc2.number);  //5
        
        StaticCount.number++;//number값을 1증가 시킨다.
        System.out.println(StaticCount.number); //6
    }
}
            
        
        
        