package chunk1friends;

import java.util.Scanner;

/**
 *Program asks user a series of questions about their interests
 * and computes a friend compatibility score based on their responses
 * @author greta
 */
public class GretaFriends {
    public static void main(String [] notUsed){
        //create our storage containers (variables0
        int compatScore = 0;
        final int COMPAT_THRESHOLD = 45;
        int userResponse = 0;
        Scanner inputScanner;
        boolean passedThreshold = false; //not used in version 0
        
        //Fixed point allotments by question
        final int Q1_YES_POINTS = 30;
        final int Q1_NO_POINTS = -50;
        
        //Create Scanner
        inputScanner = new Scanner(System.in);
        
         System.out.println("Hey, I'm Greta: Let's see if we might be friends.");
        System.out.println("Please answer the following questions truthfully.");
        
        System.out.println("Q1: Do you like sports?");
        System.out.println("Enter 1 for Yes, 0 for No.");
        
        //use scanner to read input into userResponse
        userResponse = inputScanner.nextInt();
        
        if(userResponse ==1){
            // This block will contain nested logic only run if user
            //is a sports fanatic
            
            //add 30 to compat score
            compatScore = compatScore + Q1_YES_POINTS;
            System.out.println("Awesome! Sports rule!");
            
            System.out.println("Q2: Which sport is your favorite?");
            System.out.println("1. Football");
            System.out.println("2. Hockey");
            System.out.println("3. Soccer");
            System.out.println("4. Baseball");
            System.out.println("5. Other");
            userResponse = inputScanner.nextInt();
            if(userResponse == 1){
                //Football
                compatScore = compatScore + 50;
            }else if (userResponse == 2){
                //Hockey
                compatScore = compatScore + 40;
            }else if (userResponse == 3){
                //Soccer
                compatScore = compatScore + 30;
            }else if (userResponse == 4){
                //Baseball
                compatScore = compatScore + 20;
            }else if (userResponse == 5){
                //Other
                compatScore = compatScore + 10;   
                
            }//end chained ifs for sport type
            
            System.out.println("Q2: Who is your favorite athlete?");
            System.out.println("1. Tom Brady");
            System.out.println("2. LeBron James");
            System.out.println("3. Sidney Crosby");
            System.out.println("4. Babe Ruth");
            System.out.println("5. Other");
            userResponse = inputScanner.nextInt();
            if(userResponse == 1){
                //Tom Brady
                compatScore = compatScore + 50;
            }else if (userResponse == 2){
                //LeBron James
                compatScore = compatScore + 40;
            }else if (userResponse == 3){
                //Sidney Crosby
                compatScore = compatScore + 30;
            }else if (userResponse == 4){
                //Babe Ruth
                compatScore = compatScore + 20;
            }else if (userResponse == 5){
                //Other
                compatScore = compatScore + 10;   
                
            }//end chained ifs for sport type
        
        
        }else{// this block runs if user entered not 1
            compatScore = compatScore + Q1_NO_POINTS;
            System.out.println("Aw darn. I don't think you can keep up with me!");   
        }//close Q1 if/else   
        
        //this logic will run regardless of previous question's answers
        System.out.println("Checking friend compatibility...");
        if(compatScore >= COMPAT_THRESHOLD){
            passedThreshold = true;
            System.out.println("Awesome! Let's get some tickets!");
            
            }else{
            System.out.println("We have low friend compatibility, sorry.");
        }//close if/else for overall compat checking
        
        System.out.println("Thanks for using my friend compatibility robot!");
    }//close main
    
}//close class
