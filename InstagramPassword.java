import java.util.Scanner;
public class Password01
{
  public static void main(String[] args)
  {
    Scanner userInput = new Scanner(System.in);
    int wrong;
    

    System.out.println("Please enter your name");
    String name = userInput.nextLine();
    
    System.out.println("Please enter month of your birthday");
    int month = userInput.nextInt();
    
    while(month < 1 || month > 12 && wrong < 5){
    System.out.println("Please enter month of your birthday");
    month = userInput.nextInt();
    wrong++;
    }
    
    
    System.out.println("Please enter day of your birthday(0-31)");
    int month = userInput.nextInt();
    
  }
}