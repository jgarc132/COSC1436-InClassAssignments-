import java.util.Scanner;
public class Payroll{
  public static void main(String[] args){
    Scanner uI = new Scanner(System.in);
    int[] employeeId = {5658845,4520125,7895122,8777541,8451277,1302850,7580489};
    int[] hours = {2,4,6,8,10,12,14};
    double[] payRate = {7.25,7.25,7.25,7.25,7.25,7.25,7.25};
    double[] wages = {14.50,29,45,56,67,78,89};
     p("Please enter the worked hours");
     int h = uI.nextInt();
     p("Please enter the Pay Rate");
     double payrate = uI.nextDouble();
    for(int i = 0; i < hours.length;i++){
      if(h == hours[i] && payrate == payRate[i]){
        p("Employe ID \tHours \tPay Rate \tWages");
        p(employeeId[i] + " \t\t" + hours[i] + " \t$" + payRate[i] + " \t$" + wages[i]);
      }
    }
  }
  public static void p(String pr){
    System.out.println(pr);
  }
}