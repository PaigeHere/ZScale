/**
 * Author: Paige Margaret Bartusiak
 * Assignment: 2.3d
 * Date: September 13, 2018
 * 
 *ReadMe: In statistics, it is known that data cannot be compared if it is not on the same scale. The Z-scale is used 
 * in order to put any data on a comparable scale. It indicates how far an element is from the mean by usage of the known 
 * mean and standard deviation. This code can be used to convert any data onto the mean scale as long as the necessary
 * information is known (element value, mean, and standard deviation).
 * 
 * Key for within this code:
 * z is the z scale score. 
 * X is the known element to be converted
 * M is the mean
 * Sx is the standard deviation
 */

import java.util.Scanner;

  public class ZScale {
  public static void main (String [] args) {
    Scanner reader = new Scanner(System.in);
    double z;
    double X;
    double M;
    double Sx;
    
    System.out.print("Enter known iformation to convert a datum into it's z score!");
    System.out.println("Please enter the element's value: ");
    X = reader.nextDouble();
    
    System.out.println("Please enter the Mean of the data set: ");
    M = reader.nextDouble();
    
    System.out.println("Please enter the Standard Deviation of the data set: ");
    Sx = reader.nextDouble();
    
    
    z = ( X - M ) / Sx;
    System.out.print("The element's z-score is ");
    System.out.println(z);
  }
}
