import java.util.Scanner;
public class SurfaceAreaOfCube{
  public static void main(String[] args){
    Scanner uI = new Scanner(System.in);
    System.out.println("Please enter the length of the side of cube.");
    int l = uI.nextInt();
    uI.close();
    int s = (l*l)*6;
    System.out.println("The Surface area of your cube with a length of " + l + " is " + s);
  }
}