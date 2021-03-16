import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author greta
 */
public class AuthenticationJava {
     //using a private final static string
    // because the private can only be seen inside from within the class

    //choose your password and store it inside PASSWORD
    private final static String PASSWORD = "m@m@2rusty";
    //Store the private info in a String named RESTRICTED_INFORMATION
    private final static String RESTRICTED_INFORMATION = "I hate Cheez-its";
    // this secret information can only be discovered if the user enters 
    //the correct password 
        
    //open main method
    public static void main(String[] args){
    final int MAX_PASS_ATTEMPTS = 6;
        //make the number of attempts known to user 
        System.out.println("You will have 6 attempts to guess the password");
    //create new Scanner
        Scanner userInputScanner = new Scanner(System.in);
        
        int attempts = 0;   
        
        while(attempts < MAX_PASS_ATTEMPTS){
            String userAttempt = userInputScanner.nextLine();
            
            if(userAttempt.equals (PASSWORD)){
        System.out.println("Correct! You may access private information"); 
        System.out.println(RESTRICTED_INFORMATION);
        System.out.println("You've got skills! That was a hard password to crack");
        break;
            }else{
                System.out.println("Nope, wrong password bud. Try again.");
                attempts = attempts + 1;
                //reveal to user how many tries used
                System.out.println("That's your" + attempts + "try.");
                //tell user how many tries left
                System.out.println("You've got" + MAX_PASS_ATTEMPTS + "remaining");
            if (attempts == MAX_PASS_ATTEMPTS){
                System.out.println("Hahaha, you're all out of attempts.");
                System.out.println("Better luck next time, my passwords are tricky!");
            }else{
                System.out.println("ERROR, please enter soemthing else");
                
            
                
                
                
            }
        
        }
    }
}   
        

    
    
    
    
    
    
    
    
            
            






