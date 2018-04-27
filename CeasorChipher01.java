import java.util.Scanner;
public class CeasorChipher01{
  public static void main(String[] args0){
    Scanner uI = new Scanner(System.in);
    p("What words would you like to cyphor");
    String b = uI.nextLine();
    mC(b,3);
    p("\n");
    String c = "khoor#zruog";
    mC(c,-3);p("\n");
    String s = mC(b,3);
    p(s);
  }
  public static String mC(String c,int s){
   char[] x = c.toCharArray();
   String result = "";
    for(int i : x){
      int y = (int)(i + s);
      result = result + (char)y;
    }
    return result;
  }
  public static void p(String print){
      System.out.print(print);
    }
}