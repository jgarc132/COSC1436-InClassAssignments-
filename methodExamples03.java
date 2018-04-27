import java.util.Scanner;
public class methodExamples03
{
  public static void main(String[] args)
  {
  Scanner uI = new Scanner(System.in);
  System.out.println("Please enter a letter/word you want to convert to Unicode");
  String l = uI.nextLine();
  for(int i = 0;i < l.length();i++)
  {
    char x = l.charAt(i);
    System.out.println(findUnicodeValue(x));
  }
  
  }
  public static int findUnicodeValue(char x)
  {
   return (int)x;
  }
}