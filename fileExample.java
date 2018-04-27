import java.util.Scanner;                  //Juan Garcia && Andrew Rodriguez
import java.io.*;
import java.lang.Math;
public class fileExample{
  public static void main(String[] args) throws IOException{
    double sum = 0;
    double line = 0;
    double avg;
    Scanner  input = new Scanner(new File("numbers.txt"));
    int largest = -999; 
    int smallest = 999;
    double avg02 = 0;
    
    while(input.hasNext() ) {
      int N = input.nextInt();
      line = line+= 1;
      sum = sum + N;
      avg = sum/line;
      if(N > largest) {
        largest = N;
      }
      if(N < smallest) {
        smallest = N;
      }
      System.out.println(N);
      avg02 = Math.sqrt(Math.pow(sum - avg,2)/line);
    }
    
    input.close();
    avg = sum/line;
    avg02 = Math.sqrt(avg02);
    
    System.out.println("Sum is equal to "+sum+"");
    System.out.printf("Average is equal to %.2f \n",avg);
    System.out.println("The largest value is "+largest+"");
    System.out.println("The smallest value is "+smallest+"");
    System.out.printf("The Standard Diviation is: %.2f \n",avg02);
    
    //avg02 = 5.26
  }
}