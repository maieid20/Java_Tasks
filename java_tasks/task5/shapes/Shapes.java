
package shapes;

import java.util.Scanner;


public class Shapes {

    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
       System.out.println("Enter the height of cylinder:");
       double height=input.nextDouble();
       System.out.println("Enter the radius of cylinder:");
       double radius=input.nextDouble();
       System.out.println("Enter the color :");
       String color=input.next();
       Cylinder s;
       s = new Cylinder(height,radius,color);
       System.out.println("The area of circle is  :");
       System.out.println(s.getArea());
       System.out.println("The volume of cylinder is  :");
       System.out.println(s.getvolume());
        
    }
    
}
