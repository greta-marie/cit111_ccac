/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

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
        final int Q1_NO_POINTS = -20;
        
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
            //likes sports
            
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
            
            System.out.println("Q3: Who is your favorite athlete?");
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
            
            System.out.println("Q3: Do you like music? What is your favorite genere?");
            System.out.println("Enter the appropriate number for your choice: ");
            
            System.out.println("1. Rock n Roll");
            System.out.println("2. Pop");
            System.out.println("3. Country");
            System.out.println("4. Rap");
            System.out.println("5. Hip Hop");
            System.out.println("6. Metal");
            System.out.println("7. Jazz");
            System.out.println("8. Classical");
            System.out.println("9. Other");
            
            userResponse = inputScanner.nextInt();
            if(userResponse == 1){
                //Rock n Roll
                compatScore = compatScore + 40;
            }else if (userResponse == 2){
                //Pop
                compatScore = compatScore + 30;
            }else if (userResponse == 3){
                //Country
                compatScore = compatScore + 20;
            }else if (userResponse == 4){
                //Rap
                compatScore = compatScore + 10;
            }else if (userResponse == 5){
                //Hip Hop
                compatScore = compatScore + 5;  
            }else if (userResponse == 2){
                //Metal
                compatScore = compatScore + 0;
            }else if (userResponse == 3){
                //Jazz
                compatScore = compatScore - 10;
            }else if (userResponse == 4){
                //Classical
                compatScore = compatScore - 20;    
            }else if (userResponse == 4){
                //Other
                compatScore = compatScore - 30;    
                
            }//end chained ifs for music preference
            
            System.out.println("Q4: Are you an animal lover?");
            System.out.println("Enter the number that corresponds to your favorite animal: ");
            System.out.println("1: Dogs");
            System.out.println("2: Cats");
            System.out.println("3: Bunnies");
            System.out.println("4: Bearded Dragon");
            System.out.println("5: Snake");
            System.out.println("6: Hamster");
            System.out.println("7: Fish");
            System.out.println("8: Turtle");
            System.out.println("9: Horse");
            System.out.println("10: Other");
            
            userResponse = inputScanner.nextInt();
            if(userResponse == 1){
                //Dogs
                compatScore = compatScore + 60;
            }else if (userResponse == 2){
                //Cats
                compatScore = compatScore + 30;
            }else if (userResponse == 3){
                //Bunnies
                compatScore = compatScore + 20;
            }else if (userResponse == 4){
                //Bearded Dragon
                compatScore = compatScore + 40;
            }else if (userResponse == 5){
                //Snake
                compatScore = compatScore + 10;  
            }else if (userResponse == 6){
                //Hamster
                compatScore = compatScore + 15;
            }else if (userResponse == 7){
                //Fish
                compatScore = compatScore - 20;
            }else if (userResponse == 8){
                //Turtle
                compatScore = compatScore + 25;    
            }else if (userResponse == 9){
                //Horse
                compatScore = compatScore + 15;   
            }else if (userResponse == 10){
                //Other
                compatScore = compatScore - 10; 
                
            }//end chained if for pet preference    
            
        
        
        }else{// this block runs if user entered not 1
            compatScore = compatScore + Q1_NO_POINTS;
            System.out.println("Aw that's disappointing!");   
            System.out.println("Q2: Do you like music? What is your favorite genere?");
            System.out.println("Enter the appropriate number for your choice: ");
            
            System.out.println("1. Rock n Roll");
            System.out.println("2. Pop");
            System.out.println("3. Country");
            System.out.println("4. Rap");
            System.out.println("5. Hip Hop");
            System.out.println("6. Metal");
            System.out.println("7. Jazz");
            System.out.println("8. Classical");
            System.out.println("9. Other");
            
            userResponse = inputScanner.nextInt();
            if(userResponse == 1){
                //Rock n Roll
                compatScore = compatScore + 40;
            }else if (userResponse == 2){
                //Pop
                compatScore = compatScore + 30;
            }else if (userResponse == 3){
                //Country
                compatScore = compatScore + 20;
            }else if (userResponse == 4){
                //Rap
                compatScore = compatScore + 10;
            }else if (userResponse == 5){
                //Hip Hop
                compatScore = compatScore + 5;  
            }else if (userResponse == 2){
                //Metal
                compatScore = compatScore + 0;
            }else if (userResponse == 3){
                //Jazz
                compatScore = compatScore - 10;
            }else if (userResponse == 4){
                //Classical
                compatScore = compatScore - 20;    
            }else if (userResponse == 4){
                //Other
                compatScore = compatScore - 30;    
                
            }//end chained ifs for music preference
            
            System.out.println("Q3: Are you an animal lover?");
            System.out.println("Enter the number that corresponds to your favorite animal: ");
            System.out.println("1: Dogs");
            System.out.println("2: Cats");
            System.out.println("3: Bunnies");
            System.out.println("4: Bearded Dragon");
            System.out.println("5: Snake");
            System.out.println("6: Hamster");
            System.out.println("7: Fish");
            System.out.println("8: Turtle");
            System.out.println("9: Horse");
            System.out.println("10: Other");
            
            userResponse = inputScanner.nextInt();
            if(userResponse == 1){
                //Dogs
                compatScore = compatScore + 60;
            }else if (userResponse == 2){
                //Cats
                compatScore = compatScore + 30;
            }else if (userResponse == 3){
                //Bunnies
                compatScore = compatScore + 20;
            }else if (userResponse == 4){
                //Bearded Dragon
                compatScore = compatScore + 40;
            }else if (userResponse == 5){
                //Snake
                compatScore = compatScore + 10;  
            }else if (userResponse == 6){
                //Hamster
                compatScore = compatScore + 15;
            }else if (userResponse == 7){
                //Fish
                compatScore = compatScore - 20;
            }else if (userResponse == 8){
                //Turtle
                compatScore = compatScore + 25;    
            }else if (userResponse == 9){
                //Horse
                compatScore = compatScore + 15;   
            }else if (userResponse == 10){
                //Other
                compatScore = compatScore - 10; 
                
            }//end chained if for pet preference    
            
            
        }//close Q1 if/else   
        
        //this logic will run regardless of previous question's answers
        System.out.println("Checking friend compatibility...");
        if(compatScore >= COMPAT_THRESHOLD){
            passedThreshold = true;
            System.out.println("Awesome! Looks like we have potential to be buddies!");
            
            }else{
            System.out.println("We have low friend compatibility, sorry.");
        }//close if/else for overall compat checking
        
        System.out.println("Thanks for using my friend compatibility robot!");
    }//close main
    
}//close class

