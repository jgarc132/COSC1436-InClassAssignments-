import java.util.Scanner;

public class ifStatementAssignment01
{
  public static void main(String[] args)
  {
    Scanner userInput = new Scanner(System.in);
    System.out.println("What is your x-variable?");    
    String x = userInput.nextLine();
    int xf = Integer.parseInt(x);
    if (xf <= 0)
    {
      System.out.println("Your x cannot be a negartive. Try another number");
      x = userInput.nextLine();
      xf = Integer.parseInt(x);
    }
    
    
    System.out.println("What is your y-variable?");
    String y = userInput.nextLine();
    int yf = Integer.parseInt(y);
    if(yf == 0)
    {
      System.out.println("System cannot divide by 0.Try again");
      y = userInput.nextLine();
      yf = Integer.parseInt(y);
    }
    
    int z;
    if(xf >= 0 && yf < 0 || yf > 0 && yf != 0 )
    {
      z = xf/yf;
      System.out.println(x+" / "+y+" is "+z);
    }
  }
}
