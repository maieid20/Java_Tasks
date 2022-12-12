

package sheet3_1;

import java.util.Scanner;


public class sheet3_1 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the string : ");
       String line=input .next();   //Initialize
       line =line.replaceAll(",", "");  // replaceALL function For remove all coma form string 
       System.out.println(line); // print the string without any comma

        
    }
    
}
