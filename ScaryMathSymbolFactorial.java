public class ScaryMathSymbolFactorial
{
  public static void main(String[] args)
  {
    int sum = 1;
    for(int counter = 1 ; counter < 10 ; counter++)
    {
      sum *= counter;
      System.out.println("n = " + counter + " sum = " + sum);
    }
    System.out.println(sum);
  }
}