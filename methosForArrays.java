public class methosForArrays{
  public static void main(String[] args){
    int[] n = {5,2,1,3,5,8,6};
    p("The sum is " + sigma(n));  
    p("The sum is " + sigmaSimplified(n));  
  }
  public static int sigma(int[] n){
    int sum = 0;
    for(int i = 0; i < n.length;i++)
     sum = sum + n[i];
    return sum;
  }
   public static int sigmaSimplified(int[] n){
    int sum = 0;
     for(int itor : n)
     sum += itor;
    return sum;
  }
  public static void p(String print){
   System.out.println(print);
  }
  //only string arrays
  public static void pForStringAndArray(String...input){
    for(String itor : input)
      System.out.println(itor);
  }
}