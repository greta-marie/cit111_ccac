/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gibso
 */
public class MysteryDoors {
    public static void main(String[] args) {
        //add boolean first to avoid infinite looping
        boolean continuousLooping = true;
        Scanner scan = new Scanner(System.in);
        
        
        do{
    
    
            System.out.println("Hello there and welcome to my mystery door adventure");
            System.out.println("Please choose which door you wish to explore by entering the number");
            //Display the three doors to the user
            System.out.println("Door #1");
            System.out.println("Door #2");
            System.out.println("Door #3");
        
            int choices = scan.nextInt();
            switch(choices){
            
                case 1:
                    sportFacts();
                    break;
                case 2:
                    generateRandomLetter();
                    break;
                case 3:
                    generateRandomNumber();
                    break;
                case 4: 
                    //exit program/loop
                    //flip while control variable to false
                    continuousLooping = false;
                default: 
                System.out.println("Invalid");
                
        }
        
    
    
        }while(continuousLooping);
        
    }//close main 
    
    public static void sportFacts(){
        
        System.out.println("Here are some cool facts about the Patriots: ");
        System.out.println("#1: Bill Belichick has been head coach of the ");
        System.out.println("New England Patriots since 2000");
        System.out.println("#2: The Patriots have appeared in 11 Super Bowls ");
        System.out.println("and have won 6 of them");
                
        
    }//close sportFacts
    public static void generateRandomLetter(){
            Random r = new Random();
            System.out.println("Random string of letters: ");
            String alphabet = "123xyz";
            for (int i = 0; i < 50; i++) {
        System.out.println(alphabet.charAt(r.nextInt(alphabet.length())));
    } // prints 50 random characters from alphabet

    }//close generateRandomLetter       
    
    public static void generateRandomNumber(){
        
        double rand = Math.random();
        System.out.println("Random Number: " + rand);
        System.out.println("Oh look, you generated a number!");
        
    }//close generateRandomNumber
}//close class
    
