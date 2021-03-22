/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author greta
 */
public class SimpleMethod {
    
    public static void main(String [] anyNameWeWant){
        System.out.println("Top of main method");
        
        System.out.println("Switches and Methods");
        System.out.println("Choose your method by entering a number: ");
        
        
        //BOOLEAN COMES FIRST to avoid endless looping of data
        boolean keepLooping = true;
        Scanner scan = new Scanner(System.in);
        
        //use a do while to run muliple times
        do{
            
            System.out.println("1- print a special statement");
            System.out.println("2- generate a really big random number");
            System.out.println("3- get me out of here!");
            int selector = scan.nextInt();
            switch(selector){
                case 1:
                    printStatement();
                    break;
                case 2:
                    generateBigNumber();
                    break;
                case 3:
                    //exiting program/loop by flipping the while control
                    //variable to false
                    keepLooping = false;
                    break;
                default: 
                    System.out.println("Unrecognized input.");

            }
       
        }while(keepLooping);
        
        
        System.out.println("Bottom of main method");
        
        
        
    }//close main
    
    //methods are stacked and never nested
    //task of the method is to display a very important statement
    
    public static void printStatement(){
        
        System.out.println("Where There's a Will, There's a Way");
    }
    
    public static void doModulo(){
        System.out.println("Inside doModulo");
        int r = 23;
        int p = 12;
        int result = r % p;
        System.out.println("Result: " + result );
        
    }//close doModulo
    
    public static void generateBigNumber(){
        
        Random r = new Random();
        //make object to do math using large numbers
        BigInteger bigInt = new BigInteger(250, r);
        System.out.println("Big Random Number: " + bigInt);
        
        
        
        
        
        
    }//close generateBigNumber
}//close class
