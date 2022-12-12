package sheet2_1;

import java.util.Scanner;


public class sheet2_1 {

    
      public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input=new Scanner(System.in);
         
         int size ;    //Declare array size
         System.out.println("Enter the size of the array");
         size=input.nextInt();   //Initialize array size
         double [ ]numArray = new double[size] ;   //Declare array 
         double largest=numArray[0];
         
         System.out.println("Enter the elements of the array");
          for (int i=0 ;i<size ;i++)    //Initialize array
          {
            numArray[i]=input.nextDouble();
             if (largest < numArray[i])   //Compare the array elements 
                {
                    largest=numArray[i];

                }
          }
         
         System.out.println("Largest number is: "+largest);  // print the Largest number
         
    }
    
}
