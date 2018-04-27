/*
 * Programmer: J.Garcia
 * Date: 03/23/2018
 * Purpose: Understandings Methods better
 * */
import java.util.Scanner;
public class methodExample05{
  //Creting important Variables,String,and Scanner
  public static int n1,n2,z;
  public static String op;
  public static Scanner uIN = new Scanner(System.in),uIS = new Scanner(System.in);
  
  /*
   * Calls out input(),calc(),output()
   * */
  public static void main(String[] args){
  input();
  calc();
  output();
  }//end of class
  
  /*
   * Asks users for two variables and operations type
   * */
  public static void input(){
  print("Please enter number 1");
  n1 = uIN.nextInt();
  print("Please enter number 2");
  n2 = uIN.nextInt();
  print("Please enter what you would like to do with these numbers(+,-)");
  op = uIS.nextLine();
  }//end of input
  
  /*
   * Chooses which operations to use
   * */
  public static void calc(){
    if(op.equals("+")){
      z = n1 + n2;
    }else if(op.equals("-")){
      z = n1 - n2;
    }
  }//end of calc
  
  /*
   * Prints out the outputs of the calc() method
   * */
  public static void output(){
    if(op.equals("+")){
    print("The addition of " + n1 + " and " + n2+ " is " + z);
    }else if(op.equals("-")){
    print("The subtraction of " + n1 + " and " + n2+ " is " + z);
    }
  }//end of output
  
  /*
   * Prints out String
   * */
  public static void print(String p){
    System.out.println(p);
  }//end of print
}//end of class