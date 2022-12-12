package sheet3_2;

import java.util.Scanner;

public class sheet3_2 {

    
    public static void main(String[] args) {
        
        circle R =new circle();
        triangle S =new triangle();
        
         R.setR(2);
         System.out.println("The circumference of the circle is : ");
         R.circle_circumference();
         System.out.println("The area of the circle is : ");
         R.circle_Area();
          
         S.setA(3);
         S.setB(4);
         S.setC(5);
         S.setHeight(4);
         System.out.println("The circumference of the triangle is : ");
         S.triangle_circumference();
         System.out.println("The area of the triangle is : ");
         S.triangle_Area();

    }
    
}
