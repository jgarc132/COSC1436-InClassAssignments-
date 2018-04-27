/**
 * Programmer 01: J.Garcia
 * Programmer 02: M.Corral
 * Date: 3/21/2018
 * Purpose: Learning Methods
 * */

import java.util.Scanner;
public class AreaRectangleProgrammingChallenge{
  /**
   * This is the main method
   * @param args incomming values from the caller
   * */
  public static void main(String[] args){
    double length,
      width,
      area;
    
    length = getLength();
    width = getWidth();
    area = getArea(length,width);
    
    System.out.println(area);
    displayData(length,width,area);
    
  }//end of main
  /**
   * Identify the length
   * @return length Returns users input of length
   * */
  public static int getLength(){
    Scanner scnL = new Scanner(System.in);
    System.out.println("Please enter the length of your rectangle?");
    int length = scnL.nextInt();
    return length;
  }//end of length
  
  /**
   * Identifis the width
   * @return width Returns users input of width
   * */
  public static int getWidth(){
    Scanner scnL = new Scanner(System.in);
    System.out.println("Please enter the width of your rectangle?");
    int width = scnL.nextInt();
    return width;
  }//end of width
  
  /**
   * Works out to get are
   *@return x*y Multiplications of length and width
   * */
  public static double getArea(double x,double y){
    return x*y;
  }//end of area
  
  /**
   * Display Data
   * */
  public static void displayData(double length,double width, double area){
    System.out.println(length + " " + width + " " + area);
  }//end of data
}//end of class