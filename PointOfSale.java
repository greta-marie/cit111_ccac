/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;

/**
 *
 * @author greta
 * //mostly copied from class demo just to get a feel of methods
 */
public class PointOfSale {
    
    public static void main(String[] args){
        System.out.println("In Main");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a ticket subtotal: " );
        
        double sub = scan.nextDouble();
        displayPriceWithTax(sub);
        computePriceAfterDiscount(1000, .23);
        System.out.println("In Main after call");
        
     
        
    }//close main
    
    public static void displayPriceWithTax(double subTotal){
        System.out.println("Value of parameter subTotal: " +subTotal);
        final double TAX_RATE = 0.050;
        double totalPrice = subTotal * (1 + TAX_RATE);
        System.out.println("Total with tax: $" + totalPrice);
        
    }//close displayPriceWithTax
    
    /**
     * Computes the final sale price after discount
     * @param price subtotal before discount
     * @param discount discount rate as a decimal percent
     */
    public static void computePriceAfterDiscount(double price, double discount){
        double finalPrice = price - (price * discount);
        double percent = discount * 100;
        System.out.println("$" + price + " with a " + percent + "% discount = $" + finalPrice);
        
        
        
    }//close computePriceAfterDiscount
    
}//close class
