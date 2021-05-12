/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import static arrays.SportsJerseyShoppingCart.jerseys;
import java.text.NumberFormat;

public class Jersey {

    private String name;
    private double price;
    private int numPurchased;
    private double total;

    public Jersey(String n) {
        name = n;

    }

    public Jersey(String itemName, double itemPrice, int numPurchased) {
        name = itemName;
        price = itemPrice;
        numPurchased = numPurchased;
    }
    // Returns the name of the item

    public String getName() {
        return name;
    }
    // Returns the unit price of the item

    public double getPrice() {
        return price;
    }
    // Returns the quantity of the item

    public int getQuantity() {
        return numPurchased;
    }

    public void setPrice(double p) {
        //Assign to this objects member variable price 
        //what's passed in 
        price = p;

    }

    public void setQuantity(int n) {
        numPurchased = n;
    }

    public double getTotal() {
        total = numPurchased * price;
        return total;
    }

    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String strTab = name.length() > 8 ? "\t" : "\t\t";
        return name + strTab + fmt.format(price) + "\t\t" + numPurchased + "\t\t" + fmt.format(price * numPurchased
        );
    }

}
