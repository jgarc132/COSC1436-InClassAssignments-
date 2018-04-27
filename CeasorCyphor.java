import java.util.Scanner;
public class CeasorCyphor{
  public static void main(String[] args0){
    Scanner uI = new Scanner(System.in);
    p("What words would you like to cyphor");
    String b = uI.nextLine();
    mC(b,3);
    p("\n");
    String c = "khoor#zruog";
    mC(c,-3);
  }
  public static void mC(String c,int s){
    for(int i = 0;i < c.length();i++){
      char x = c.charAt(i);
      int y = ((int)x + s);
      x = (char)y;
      p(""+ x);
    }
  }
  public static void p(String print){
      System.out.print(print);
    }
}