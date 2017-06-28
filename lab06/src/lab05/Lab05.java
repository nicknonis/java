
package lab05;


public class Lab05 {


    public static void main(String[] args) {
        
        circle circa1 = new circle();
        System.out.println("The area of the circle of radius " + circa1.radiusz + " is " + circa1.getarea());
        
        circle circa2 = new circle(25);
        System.out.println("The area of the circle of radius " +  circa2.radiusz + " is " + circa2.getarea());
        
        circle circa3 = new circle(125);
        System.out.println("The area of the circle of radius " + circa3.radiusz + " is " + circa3.getarea());
        
        circa2.setradi(100);
        System.out.println("The area of the circle of radius " + circa2.radiusz + " is " + circa2.getarea());
    }
    
}
