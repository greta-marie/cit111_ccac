/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentals_project;

import java.util.Scanner;

/**
 *
 * @author greta
 * 
 * This program's purpose is to simulate two different uses: a Petco online shopping cart and a Patriots quiz. There are items at set prices:
 * dog food, cat food, pet toys, kitty litter, and pooper scooper bags. We want to take
 * the user input for how many of each item they would like to order and then calculate the total price.
 * When the user chooses to use the patriots quiz, it will give them a series of questions using looping.
 */
public class FundamentalsProject {

    //initialize variables 
    public static int dogFood = 0;
    public static int catFood = 0;
    public static int petToys = 0;
    public static int kittyLitter = 0;
    public static int dogPooperScooperBags = 0;
    public static double shoppingCartTotal = 0;

    //set the prices per item
    final static double DOG_FOOD_PRICE_PER_BAG = 35.0;
    final static double CAT_FOOD_PRICE_PER_BAG = 30.0;
    final static double OVERALL_PET_TOYS_PRICE = 5.0;
    final static double KITTY_LITTER_PRICE_PER_BAG = 20.0;
    final static double DOG_POOPER_SCOOPER_BAGS = 3.0;

    //this program hosts multiple uses from which the user can choose to use. 
    public static void main(String[] args) {

        //initialize our purchase options
        int customerDogFoodSelection;
        int customerCatFoodSelection;
        int customerPetToys;
        int customerKittyLitter;
        int customerPooperScooperBags;
//find out how much of everything the customer would like to add to their cart
        Scanner keyboardScanner = new Scanner(System.in);

        int userResponse = 0;
        Scanner inputScanner;

        //greet the user and introduce programs purpose
        System.out.println("Hello there, welcome to my multi-use program!");
        System.out.println("Feel free to choose whichever one of the simulations you'd like.");
        System.out.println("Don't worry, you'll be able to go back and use each one as you'd wish.");


        // slow down text speed for effect
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
        }//close try

        System.out.println("Options: ");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~                                                    ~~");
        System.out.println("~~      #1: New England Patriots Trivia              ~~");
        System.out.println("~~                                                    ~~");
        System.out.println("~~                                                    ~~");
        System.out.println("~~      #2: Petco Shopping Cart Simulator            ~~");
        System.out.println("~~                                                    ~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //slow down text for effect
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
        }//close try

        System.out.println("Enter the appropriate number for your choice (1 or 2) and hit enter.");

        //Create Scanner
        inputScanner = new Scanner(System.in);
        
        userResponse = keyboardScanner.nextInt();

        if (userResponse == 1) {
            //this will only run if the user selects the New England Patriots Trivia

            System.out.println("Alright!! Welcome to the Patriots Trivia!");
            System.out.println("Get ready to have your knowledge of this amazing NFL team put to the test!");

            System.out.println("***************************************************************");
            System.out.println("QUESTION 1: Who is the head coach for the New England Patriots?");
            System.out.println("***************************************************************");
            //make sure you add the boolean before the do while to avoid endless looping!!!
            boolean continuousLooping = true;

            //loop the question with a do while so the user has multiple chances
            do {

                System.out.println("Enter 1, 2, 3, or 4 and press enter");

                //list multiple choice options 
                System.out.println("(1) Andy Reid");
                System.out.println("(2) Mike Tomlin");
                System.out.println("(3) Sean McVay");
                System.out.println("(4) Bill Belichick");

                userResponse = inputScanner.nextInt();

                if (userResponse == 1) {
                    //user selected Andy Reid (incorrect)
                    System.out.println("Incorrect! He coaches the Cheifs");
                } else if (userResponse == 2) {
                    //user selected Mike Tomlin
                    System.out.println("Incorrect! He coaches the Steelers");
                } else if (userResponse == 3) {
                    //user selected Sean McVay
                    System.out.println("Incorrect! He coaches the Rams");
                } else if (userResponse == 4) {
                    //user selected Bill Belichick
                    System.out.println("Correct!! Yes, Bill Belichick coaches the Patriots!");
                    continuousLooping = false;
                }//end chained ifs for question 1

            } while (continuousLooping);

        }//

        System.out.println("************************************************************");
        System.out.println("QUESTION 2: What year were the New England Patriots founded?");
        System.out.println("************************************************************");

        boolean continuousLooping = true;

        //loop the question with a do while so the user has multiple chances
        do {

            System.out.println("Enter 1, 2, 3, or 4 and press enter");

            //list multiple choice options 
            System.out.println("(1) 1960");
            System.out.println("(2) 1952");
            System.out.println("(3) 1979");
            System.out.println("(4) 1973");

            userResponse = inputScanner.nextInt();

            if (userResponse == 1) {
                //user selected 1960 (incorrect)
                System.out.println("Yup that is correct!!");
                continuousLooping = false;
            } else if (userResponse == 2) {
                //user selected 1952
                System.out.println("Nope!!");
            } else if (userResponse == 3) {
                //user selected 1979
                System.out.println("Nada!!");
            } else if (userResponse == 4) {
                //user selected 1973
                System.out.println("Wrong!!");
            }//end chained ifs for question 2

        } while (continuousLooping);

        System.out.println("************************************************************");
        System.out.println("QUESTION 3: Who did the Patriots lose to in Super Bowl XXXI?");
        System.out.println("************************************************************");
        //switched from continuousLooping to keepLooping because program was being fussy
        boolean keepLooping = true;

        //loop the question with a do while so the user has multiple chances
        do {

            System.out.println("Enter 1, 2, 3, or 4 and press enter");

            //list multiple choice options 
            System.out.println("(1) The Rams");
            System.out.println("(2) The Green Bay Packers");
            System.out.println("(3) The Chiefs");
            System.out.println("(4) The Panthers");

            userResponse = inputScanner.nextInt();

            if (userResponse == 1) {
                //user selected the rams
                System.out.println("Wrong!!");
            } else if (userResponse == 2) {
                //user selected the green bay packers
                keepLooping = false;
                System.out.println("Yup Yup!! Good answer!");
            } else if (userResponse == 3) {
                //user selected the chiefs
                System.out.println("Nopety no");
            } else if (userResponse == 4) {
                //user selected the panthers
                System.out.println("Wrong!!");
            }//end chained ifs for question 3

        } while (keepLooping);

        System.out.println("***************************************************************");
        System.out.println("QUESTION 4: How many Super Bowl victories do the Patriots hold?");
        System.out.println("***************************************************************");
        //switched from keepLooping to consistentLooping because program was being fussy again
        boolean consistentLooping = true;

        //loop the question with a do while so the user has multiple chances
        do {

            System.out.println("Enter 1, 2, 3, or 4 and press enter");

            //list multiple choice options 
            System.out.println("(1) 8");
            System.out.println("(2) 6");
            System.out.println("(3) 5");
            System.out.println("(4) 9");

            userResponse = inputScanner.nextInt();

            if (userResponse == 1) {
                //user selected eight super bowl victories
                System.out.println("Nope!");
            } else if (userResponse == 2) {
                //user selected six super bowl victories
                consistentLooping = false;
                System.out.println("Yes! We tie with the Pittsburgh Steelers. Let's see who gets to 7 first.");
            } else if (userResponse == 3) {
                //user selected five super bowl victories
                System.out.println("nahnahnah");
            } else if (userResponse == 4) {
                //user selected nine super bowl victories
                System.out.println("Hah! I wish!");
            }//end chained ifs for question 4

        } while (consistentLooping);

        System.out.println("*****************************************************************");
        System.out.println("QUESTION 5: Who is the current owner of the New England Patriots?");
        System.out.println("*****************************************************************");
        //switched from consistentLooping to moreLooping because program was being fussy again
        boolean moreLooping = true;

        //loop the question with a do while so the user has multiple chances
        do {

            System.out.println("Enter 1, 2, 3, or 4 and press enter");

            //list multiple choice options 
            System.out.println("(1) Aurthur Blank");
            System.out.println("(2) Terry Pegula");
            System.out.println("(3) Jim Irsay");
            System.out.println("(4) Robert Kraft");

            userResponse = inputScanner.nextInt();

            if (userResponse == 1) {
                //user selected Aurthur Blank
                System.out.println("No, he owns the Falcons");
            } else if (userResponse == 2) {
                //user selected Terry Pegula
                System.out.println("Uh uh, he owns the Bills");
            } else if (userResponse == 3) {
                //user selected Jim Irsay
                System.out.println("Nooooo, he owns the Colts");
            } else if (userResponse == 4) {
                //user selected Robert Kraft
                System.out.println("Yessir, good ol Mr. Kraft himself!!");
                moreLooping = false;
            }//end chained ifs for question 5

        } while (moreLooping);

        //twerk the speed again because we're so extra :P
        try {
            Thread.sleep(6050);
        } catch (InterruptedException ex) {
        }//close try

        System.out.println("That's it for my trivia!! I really hope you enjoyed it or learned something!");

        System.out.println("                                                                          ");

        System.out.println("Options: ");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~                                                    ~~");
        System.out.println("~~       #1: New England Patriots Trivia              ~~");
        System.out.println("~~                                                    ~~");
        System.out.println("~~                                                    ~~");
        System.out.println("~~       #2: Petco Shopping Cart Simulator            ~~");
        System.out.println("~~                                                    ~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

       userResponse = keyboardScanner.nextInt();

        if (userResponse == 2) {

            //greet the user 
            System.out.println("***************************************************************************");
            System.out.println("***************************************************************************");
            System.out.println("**                                                                       **");
            System.out.println("**          Hello valued customer! Time to stock up on your              **");
            System.out.println("**                   furry friend's necessities!                         **");
            System.out.println("**                                                                       **");
            System.out.println("***************************************************************************");
            System.out.println("***************************************************************************");

            //delay text to give user time to process greeting
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
            }//close try

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~         Dog Food: 35 dollars per bag         ~~~~~~");
            System.out.println("~~~~~                                              ~~~~~~");
            System.out.println("~~~~~         Cat Food: 30 dollars per bag         ~~~~~~");
            System.out.println("~~~~~                                              ~~~~~~");
            System.out.println("~~~~~           Pet Toys: 5 dollars each           ~~~~~~");
            System.out.println("~~~~~                                              ~~~~~~");
            System.out.println("~~~~~       Kitty Litter: 20 dollars per bag       ~~~~~~");
            System.out.println("~~~~~                                              ~~~~~~");
            System.out.println("~~~~~        Pooper Scooper Bags: 3 dollars        ~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            //delay text to give user time to process info
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
            }//close try

            //ask user what they would like to purchase from each category and what amount
            //take in user response with scanner
            System.out.println("How many bags of dog food do you need today?");
            System.out.println("If none, please enter 0");
            customerDogFoodSelection = keyboardScanner.nextInt();

            if (customerDogFoodSelection > 0) {
                dogFood = customerDogFoodSelection;

                System.out.println("A total of $ " + DOG_FOOD_PRICE_PER_BAG * dogFood + " has been added to your cart");

              

            }//close if statement for dog food

            try {
                Thread.sleep(3500);
            } catch (InterruptedException ex) {
            }//close try

            System.out.println("Would you like to order cat food today?");
            System.out.println("How many bags do you need?");
            customerCatFoodSelection = keyboardScanner.nextInt();

            if (customerCatFoodSelection > 0) {
                catFood = customerCatFoodSelection;
                System.out.println("A total of $ " + CAT_FOOD_PRICE_PER_BAG * catFood + " has been added to your cart");

              

            }//close if statement for cat food 

            try {
                Thread.sleep(3500);
            } catch (InterruptedException ex) {
            }//close try

            System.out.println("Any pet toys for your furry friend today?");
            System.out.println("How many would you like to add to your cart?");
            customerPetToys = keyboardScanner.nextInt();

            if (customerPetToys > 0) {
                petToys = customerPetToys;

                System.out.println("A total of $ " + OVERALL_PET_TOYS_PRICE * petToys + " has been added to your cart");

            
         
       
            }//close if statement for pet toys

            try {
                Thread.sleep(3500);
            } catch (InterruptedException ex) {
            }//close try

            System.out.println("Would you like to add kitty litter to your cart?");
            System.out.println("How many bags?");
            customerKittyLitter = keyboardScanner.nextInt();

            if (customerKittyLitter > 0) {
                kittyLitter = customerKittyLitter;
                System.out.println("A total of $ " + KITTY_LITTER_PRICE_PER_BAG * kittyLitter + " has been added to your cart");
            }//close if statement for kitty litter

            try {
                Thread.sleep(3500);
            } catch (InterruptedException ex) {
            }//close try

            System.out.println("Would you like to order any pooper scooper bags today?");
            System.out.println("Enter the quantitiy you wish to purchase please");
            customerPooperScooperBags = keyboardScanner.nextInt();

            if (customerPooperScooperBags > 0) {
                dogPooperScooperBags = customerPooperScooperBags;
                System.out.println("A total of $ " + DOG_POOPER_SCOOPER_BAGS * dogPooperScooperBags + " has been added to your cart");

            }//close if statement for pooper scooper bags    

            try {
                Thread.sleep(3500);
            } catch (InterruptedException ex) {
            }//close try

            System.out.println("Thank you for your order!");
            
        }

        computeShoppingCartTotal();
    }//close main

    public static void computeShoppingCartTotal() {

        shoppingCartTotal = dogFood * DOG_FOOD_PRICE_PER_BAG;
        shoppingCartTotal = shoppingCartTotal + catFood * CAT_FOOD_PRICE_PER_BAG;
        shoppingCartTotal = shoppingCartTotal + petToys * OVERALL_PET_TOYS_PRICE;
        shoppingCartTotal = shoppingCartTotal + kittyLitter * KITTY_LITTER_PRICE_PER_BAG;
        shoppingCartTotal = shoppingCartTotal + dogPooperScooperBags * DOG_POOPER_SCOOPER_BAGS;
        System.out.println("Shopping cart total: ");
        System.out.println("Your cart total today is: $" + shoppingCartTotal);
        

    }

}//close class  
