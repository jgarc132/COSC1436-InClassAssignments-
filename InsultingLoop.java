import java.util.Scanner;
public class InsultingLoop
{
  public static void main(String[] args)
  {
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("Your mother is a HAMSTER!!!");
    String input = userInput.nextLine();
    
    while(input.equals("no u") == false) //!input.equals("no u")
    {
    System.out.println("Your mother is a HAMSTER!!!");
    input = userInput.nextLine();
    }
    System.out.println("WOAH bro calm down, it was just a prank!");
  }
}