/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods2;

import java.util.Scanner;

/**
 *
 * @author greta
 */
public class UnitConversions {
    //this program spits out three different unit conversions for the user to utilize
    public static void main(String[] args){
        //now create a scanner
        Scanner keyscanner = new Scanner(System.in);
        //welcome user!
        
           
    System.out.println("***********************************************");
    System.out.println("*                                             *");
    System.out.println("*  Hello there, welcome to unit conversions!  *");
    System.out.println("*                                             *");
    System.out.println("***********************************************");
    //introduce user to the program's purpose
    System.out.println("This fun program will give you three unit conversions to use");
    System.out.println("Please hit '1' to begin");
    System.out.println("Kilometers to Miles");
    System.out.println("Yards to Miles");
    System.out.println("Pounds to Tons");

    int conversionChoices = keyscanner.nextInt();
    switch(conversionChoices){
            
             
    
    }
    double userNumberOfKilometers;
    
    System.out.println("Enter the amount of kilometers you would like to convert to ");
    System.out.println("miles and press enter: ");
    
    userNumberOfKilometers = keyscanner.nextDouble();
    
    double returnedNumberOfMiles = convertKilometersToMiles(userNumberOfKilometers);
    System.out.println("The number of miles that equal " + userNumberOfKilometers + " kilometers is " + returnedNumberOfMiles);
    
    double userNumberOfYards;
    System.out.println("Next, why don't we convert yards to feet?");
    System.out.println("Enter the number of yards you would like to convert to feet: ");
    
    userNumberOfYards = keyscanner.nextDouble();
    
    double returnedNumberOfFeet = convertYardsToFeet(userNumberOfYards);
    System.out.println("The number of feet that equal " + userNumberOfYards + " yards is " + returnedNumberOfFeet);
    
    double userNumberOfPounds;
    
    System.out.println("Enter the amount of pounds you would like to convert to tons: ");
    userNumberOfPounds = keyscanner.nextDouble();
    double returnedNumberOfTons = convertPoundsToTons(userNumberOfPounds);
    System.out.println("The amount of tons that equal " + userNumberOfPounds + " pounds is " + returnedNumberOfTons);
    
 
    
    }//close main
    
    /**
     * 
     * @param numberOfKilometers
     * @return number of miles
     */
    public static double convertKilometersToMiles(double numberOfKilometers){
    //1 km = 0.621371 miles
    double numberOfMiles = numberOfKilometers * (1/1.609);
    return numberOfMiles; 
        
    }//close convertKilometersToMiles
    /**
     * 
     * @param numberOfYards
     * @return number of miles
     */
    public static double convertYardsToFeet(double numberOfYards){
        //one yard equals 0.000568182 miles
        //so 1 yard = 3 feet
        double numberOfFeet = numberOfYards * (3.0);
        return numberOfFeet;
        
           
    }//close convertYardsToFeet
    /**
     * 
     * @param numberOfPounds
     * @return number of tons
     */
    public static double convertPoundsToTons(double numberOfPounds){
        //1 pound = 0.0005 tons
        double numberOfTons = numberOfPounds * (1/2000.0);
        return numberOfTons;
        
    
    
}//close convertPoundsToTons
    
}//close class
