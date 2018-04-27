import java.util.Scanner;
public class methodExamples
{
  public static void main(String[] args)
  {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter a number to do the operations");
    int n = userInput.nextInt();
    System.out.println(multiply(n));
  }
  public static int multiply(int x)
  {
    int y = (x*x) + 3;
    return y;
  }


}