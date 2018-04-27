import java.util.Scanner;
public class methodExamples04
{
  public static void main(String[] args)
  {
    Scanner uI = new Scanner(System.in);
    System.out.println("Enter a number to do the operations");
    int a = uI.nextInt();
    System.out.println(multiply(a));
    
   
    System.out.println("Please enter two string to get their string lengths and additions");
    String b = uI.nextLine();
    String c = uI.nextLine();
    System.out.println(findTotalLength(b,c));
    
    
    System.out.println("Please enter a letter/word you want to convert to Unicode");
    String d = uI.nextLine();
    for(int i = 0;i < d.length();i++)
    {
      char e = d.charAt(i);
      System.out.println(findUnicodeValue(e));
    }
    
  }
  public static int multiply(int f)
  {
    int g = (f*f) + 3;
    return g;
  }
  public static int findTotalLength(String h,String i)
  {
    return h.length() + i.length();
  }
  public static int findUnicodeValue(char j)
  {
   return (int)j;
  }
  
}