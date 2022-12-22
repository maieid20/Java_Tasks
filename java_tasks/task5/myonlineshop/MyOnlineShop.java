
package myonlineshop;

import java.util.Scanner;


public class MyOnlineShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double total=0;
      Scanner input =new Scanner(System.in);
      int size=input.nextInt();
      Product[] arr=new childrenbook[size];
      double cprice; 

      for(int i=0; i<size; i++){
           cprice=input.nextDouble();
           arr[i]=new childrenbook(cprice);
           total=total+arr[i].price(cprice);}
      
       System.out.println("the total price of book "+ total);

      
      
    }
    
}
