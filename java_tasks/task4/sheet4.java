package sheet4;

import java.util.Scanner;

public class sheet4 {

    
    public static void quicksort(int[]arr,int x) 
    { 
       for(int i=0;i<x;i++) 
       {    
        for(int m=i+1;m<x;m++) 
        {  if(arr[i]>arr[m]) 
          { int temp=arr[i]; 
             arr[i]=arr[m]; 
             arr[m]=temp; 
          } 
        } 
       } 
    } 
 
    public static void main(String[] args) { 
        Scanner input=new Scanner(System.in); 
        System.out.print("enter size of the array :"); 
       int size =input.nextInt(); 
        
        int[]array=new int[size]; 
        System.out.println("please enter array items :"); 
        for(int i=0;i<size;i++) 
        {array[i]=input.nextInt();} 
         
        quicksort(array,size); 
         
        System.out.println("the quick sorting of the array : "); 
        for(int i=0;i<size;i++) 
        {System.out.println(array[i]);} 
         
        
    } 
}