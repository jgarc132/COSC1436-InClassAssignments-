import java.util.Scanner;

public class StoreReceipt
{
  public static void main(String[] args)
  {
    Scanner userInput = new Scanner(System.in);
    
    final double TAX = 0.0825;
    
    System.out.println("How many articles are you gonna buy?");
    int articles = userInput.nextInt();
    System.out.println("How much are you gonna pay?");
    double subTotal = userInput.nextDouble();
    double total = subTotal + (subTotal * TAX);
    System.out.println("Here is your receipt!");
    
    
    System.out.println("---------Welcome to Target----------");
    System.out.println("Total Articles:       $"+ articles);
    System.out.println("Subtotal Amount:       $"+ subTotal);
    System.out.println("Total :       $"+total );
    System.out.println("Thank You For Shopping With Us Come Again!!");
    
    
    
    
    
    
  }
}