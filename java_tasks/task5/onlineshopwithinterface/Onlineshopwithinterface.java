
package onlineshopwithinterface;

import java.util.Scanner;

interface Product {
  
   public abstract double price(double price);
       
    
}

 class book implements Product {
   private double price;
    @Override
    public double price(double price) {
       return price;
    }
        
    }

  class childrenbook extends book{
    double price;
    
  
    @Override
    public double price (double price){
     
      return(price*0.2);
  }
 
    
}
  
 class cartoon extends book {
     double price;
     
     
     @Override
    public double price (double price){
     
      return(price*0.5);
  }
     
 }
 
 
 

public class Onlineshopwithinterface {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 
        System.out.print("please enter number of books : "); 
        int size=input.nextInt(); 
        Product[] arr=new cartoon[size];
          
        double price; 
       double total=0; 
       for(int i=0; i<size;i++) {
           price=input.nextDouble();
           arr[i]=new cartoon();
           arr[i].price(price);
           total=total+arr[i].price(price);
       }
           
           

          System.out.println("total prices of the books : " +total);
        
        
        
      
    }
    
}
