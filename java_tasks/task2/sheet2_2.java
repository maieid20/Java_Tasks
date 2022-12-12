package sheet2_2;

import java.util.Scanner;


public class sheet2_2 {

    
    public static void main(String[] args) {
         int r ,c;    //Declare matrix size
        Scanner input = new Scanner(System.in);
        //Initialize array size
        System.out.print("Enter the number of rows : ");
        r = input.nextInt(); 
        System.out.print("Enter the number of columns : ");
        c =input.nextInt(); 
        int [][]arr=new int[r][c];   //Declare matrix 
          System.out.print("Enter the matrix : ");
        for(int i=0; i<r;i++) //Initialize matrix
        {    for(int j=0; j<c; j++ )  
            { arr[i][j]=input.nextInt(); } } 
             
        int [][]transport= new int[r][c];    // Declare Transpose matrix
         
        for(int i=0; i<r;i++)  // Initialize Transpose matrix
        {   for(int j=0; j<c; j++ )  
            { transport[i][j]=arr[i][j]; } } 
         
         // print Transpose matrix
         System.out.println("the Transpose matrix is : ");
        for(int i=0; i<r;i++) 
        { 
            for(int j=0; j<c; j++ )  
            { System.out.print(transport[j][i]+" ");  } 
            System.out.println(); 
        } 

    
        
    }
    
}
