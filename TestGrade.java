import java.util.Scanner;
public class TestGrade
{
  public static void main(String[] args)
  {
    Scanner userGrade = new Scanner(System.in);
    
    System.out.println("What is your Test Grade?");
    int grade = userGrade.nextInt();
    
    if(grade == 100){
      System.out.println("You got a A+");
    }
    else if(grade >= 90){
      System.out.println("You got a A");
    }
    else if(grade >= 80){
      System.out.println("You got a B");
    }
    else if (grade >= 70){
      System.out.println("You got a C");
    }
    else if (grade <= 50){
      System.out.println("Your got a F!");
    }
  }
}