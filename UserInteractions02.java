import java.util.Scanner;
import java.lang.Math;

public class UserInteractions02
{
  public static void main (String[] args)
  {
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("Whats is your Xbox Gamertag!?");
    String gamertag = userInput.nextLine();
    // gamertag = gamertag.replace("x","").replace("X","");
    // gamertag = gamertag.replaceAll("\\d","");
    System.out.println(gamertag);
  }

}