import java.util.Scanner;
public class Password01
{
  public static void main(String[] args)
  {
    Scanner userInput = new Scanner(System.in);
    int wrong = 0;
    
    //Name
    System.out.println("Please enter your name");
    String name = userInput.nextLine(); 
    
    
    //Month
    System.out.println("Please enter month of your birthday");
    int month = userInput.nextInt();
    while(month < 1 || month > 12){
      System.out.println("Please enter month of your birthday");
      month = userInput.nextInt();
      wrong += 1;
      if(wrong == 4)
      {
        System.out.println("You have tried to many times! YOU HAVE FAILED!!");
        System.exit(0);
      }
    }
    
    //Day
    System.out.println("Please enter day of your birthday(0-31)");
    int day = userInput.nextInt();
    while(day < 1 || day > 31){
      System.out.println("Please enter day of your birthday");
      day = userInput.nextInt();
      wrong += 1;
      if(wrong == 4)
      {
        System.out.println("You have tried to many times! YOU HAVE FAILED!!");
        System.exit(0);
      }
    }
    
    //Completed
     System.out.println("You have done everything successfully!!");
  }
}