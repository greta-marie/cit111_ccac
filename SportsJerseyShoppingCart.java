/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import static arrays.SportsJerseys2.jersey;
import java.util.ArrayList;
import java.util.List;
import java.text.NumberFormat;
import java.util.Scanner;

public class SportsJerseyShoppingCart {
        static Jersey[] jerseys = new Jersey[6];
    public static void main(String[] args) {
       // Jersey item;
       // String itemName;
        double itemPrice;
        int numPurchased;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        //now create our array "shopping cart"
        // put each numbered category in brackets 
        //REMEMBER TO START AT ZERO NOT ONE!!!
    jerseys[0] = new Jersey( "Tom Brady Patriots Jersey");
    jerseys[1] = new Jersey("Steph Curry Golden State Jersey");
    jerseys[2] = new Jersey("Malkin Penguins Jersey");
    jerseys[3] = new Jersey("Gronkowski Patriots Jersey");
    jerseys[4] = new Jersey("Mac Jones Patriots Jersey");
    jerseys[5] = new Jersey("Crosby Penguins Jersey");

    printJerseys();
    
        // Loop to allow user to add new shopping cart items
        //start do while loop
        do {
            System.out.println("Enter the number of the item you wish to purchase: ");
            int itemNumber = scan.nextInt();
            System.out.println("Here is your jersey: " + jerseys[itemNumber]);
            scan = new Scanner(System.in);
            System.out.println("What do you think is a fair price for this jersey?");
            System.out.println("Enter your proposed price");
            itemPrice = scan.nextDouble();
            System.out.println("How many of these jerseys do you wish to purchase today?");
            System.out.println("Enter your desired quantity");
            numPurchased = scan.nextInt();
            // we just gathered the user input of which jersey, jersey price,quantity.
            jerseys[itemNumber].setPrice(itemPrice);
            jerseys[itemNumber].setQuantity(numPurchased);
            System.out.println("Would you like to keep shopping?");
            System.out.println("Hit 'y' and enter for yes OR hit 'n' and enter for no.");
            scan = new Scanner(System.in);
            
            keepShopping = scan.nextLine();
        } while (keepShopping.equalsIgnoreCase(
                "y"));
        printJerseys();
        
        System.out.println();

        System.out.println(
                "Final Shopping Cart totals");
        scan = new Scanner(System.in);
        
        computeShoppingCartTotal();
        

        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();

    }//close main
    public static void printJerseys(){
       for(int c = 0; c < jerseys.length; c = c + 1){
        
       System.out.println("Jerseys at index " + c + ":" + jerseys[c]);
       
        } 
    }//close printJerseys
    public static void computeShoppingCartTotal(){
        double grandTotal = 0;
        
         for(int c = 0; c < jerseys.length; c = c + 1){
       System.out.println("Jerseys at index " + c + ":" + jerseys[c].getTotal());
       grandTotal = grandTotal + jerseys[c].getTotal();
        } //close for loop
         System.out.println("Your Shopping Cart Total Is: $" + grandTotal);
    }
}//close class

