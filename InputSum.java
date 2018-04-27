import java.util.Scanner;
public class InputSum
{
  public static void main(String[] args)
  {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Please enter your numbers and when your done enter 0 to close");
    int input = 1;
    int total = 0;
    
    while(input != 0)
    {
      input = userInput.nextInt();
      total = total + input;
    }
    
    System.out.println(total);
  }
}