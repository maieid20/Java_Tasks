package sheet1_2;

import java.util.Scanner;

public class sheet1_2 {
     public static void main(String[] args) {
    
   int fn=1; int fr=1; int fnr=1;
        Scanner a=new Scanner(System.in);
        System.out.println("enter value of n :");
        int n = a.nextInt();
        System.out.println("enter value of r :");
        int r=a.nextInt();
     
       for( int i=1 ; i<=n ;i++)
       {
           fn=fn*i;
       }
       for ( int i=1;i<=r ;i++)
       {
       fr =fr*i;
       }
       for (int i=1 ;i<=n-r ;i++)
       {
           fnr=fnr*1;
       }       
      int c = fn/((fnr)*fr);
      
      System.out.println("the value of Combination is :"+ c);
      int p=fn/(fnr);
      System.out.println("the value of Permutation is :"+ p);
    } 
}