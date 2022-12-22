/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myonlineshop;
/**
 *
 * @author ELHADY
 */
public class childrenbook extends book{
    private double price;

   
    public childrenbook(double price) {
        super(price);
    }
    
    
     
    @Override
    public double price (double price){
     
      return(price*0.2);
  }
  
   
  
    
    
}
