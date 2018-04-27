import java.util.Scanner;
public class methodExamples02
{
  public static void main (String[] args){
    Scanner uI = new Scanner(System.in);
    System.out.println("Please enter two string to get their string lengths and additions");
    String x = uI.nextLine();
    String y = uI.nextLine();
    System.out.println(findTotalLength(x,y));
    
  }
  public static int findTotalLength(String a,String b)
  {
    return a.length() + b.length();
  }
}