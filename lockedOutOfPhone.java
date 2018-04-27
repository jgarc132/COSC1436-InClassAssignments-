import java.util.Scanner;
public class lockedOutOfPhone
{
  public static void main(String[] args)
  {
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("What is your passowrd?");
    String input = userInput.nextLine();
    
    do
    {
      System.out.println("What is your password?");
      input = userInput.nextLine();
    }while(!input.equals("I WANNA DIE!"));
    System.out.println("Phone UNLOCKLED!");
  }
}