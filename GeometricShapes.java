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
public class GeometricShapes {
    public static void main(String[] args){
        Scanner keyscanner = new Scanner(System.in);
    
        System.out.println("Let's calculate the volumes of a few geometric shapes!");
        System.out.println("In this program we're going to experiment with using methods ");
        System.out.println(" instead of using the 'System out print line.'");
        
        System.out.println("*************************************************");
        System.out.println("Why don't we start with something simple, a cube!");
        System.out.println("*************************************************");
        
                
        double userSideLength;
        
        System.out.println("Enter a side length and press enter:");
        userSideLength = keyscanner.nextDouble();
        
        
       //use the type three method we just added
       
       double returnedVolume = calcVolumeOfCube(userSideLength);
       System.out.println("Volume of cube with side of: " + userSideLength + " is " + returnedVolume);
       
       System.out.println("*********************");
       System.out.println("Now on to a cylinder!");
       System.out.println("*********************");
       
       System.out.println("Please enter the radius: ");
       
       double cylUserRadius = keyscanner.nextDouble();
       System.out.println("Enter the height in the same units as the radius");
       double cylUserHeight = keyscanner.nextDouble();
       
       double returnedCylVolume = calcVolumeOfCylinder(cylUserRadius, cylUserHeight);
       System.out.println("Volume of cylinder with radius of " + cylUserRadius);
       System.out.println(" and a height of " + cylUserHeight + " is " + returnedCylVolume);
       
       System.out.println("**********************");
       System.out.println("Let's do a sphere now!");
       System.out.println("**********************");
       
       System.out.println("Please enter the radius: ");
       double sphrUserRadius = keyscanner.nextDouble();
       
       double returnedSphrVolume = calcVolumeOfSphere(sphrUserRadius);
       System.out.println("The Volume of the sphere with a radius of " + sphrUserRadius);
       System.out.println(" is " +returnedSphrVolume);
       
       
       
       
       
       
        
    }//close main
    
    /** takes the input (side length) and calculates the volume
     * 
     * @param sideLength side length
     * @return volume of the cube
     */
    
    public static double calcVolumeOfCube(double sideLength){
        System.out.println("Inside of calcVolumeOfCube; inputted side length: " + sideLength);
        
        //no import necessary
        //three is the exponent
        double cubeVolume = Math.pow(sideLength, 3);
        
        
        //replace 0.0 with cubeVolume
        return cubeVolume;
        
        
    }//close calcVolumeOfCube
   
    /**
     * 
     * @param r radius
     * @param h height
     * @return volume of the cylinder
     */
    public static double calcVolumeOfCylinder(double r, double h){
        
        final double PI = 3.1415923;
        double cylVol = PI * Math.pow(r, 2) * h;
        
        return cylVol;
        
        
    }//close calcVolumeOfCylinder
    
    
    /**
     * 
     * @param r radius
     * @return volume of sphere
     */
    public static double calcVolumeOfSphere(double r){
        
        final double PI = 3.1415923;
        double sphrVol = (4.0/3.0) * PI * Math.pow( r, 3);
        
        return sphrVol;
        
        
    }//close calcVolumeOfSphere
    
    
}//close class
