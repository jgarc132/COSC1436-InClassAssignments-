import javax.swing.JOptionPane;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;


public class HandsOnActivity01
{
  public static void main(String[] args)
  {
    final double TAX = 0.0825;
    
    
   //if statement for name being to short
    String name = JOptionPane.showInputDialog("What is your Name??");
     if (name.length() < 2)
    {
      JOptionPane.showMessageDialog(null,"Name is too Short!Try Again");
      name = JOptionPane.showInputDialog("What is your Name??");
    }
    
    
    String payment = JOptionPane.showInputDialog("What is your payment type? (Cash, Bitcoin,Debit,Credit)");
    String articles = JOptionPane.showInputDialog("How many Articles are you buying?");
    int totalArticles = Integer.parseInt(articles);
    String subTotalAmount = JOptionPane.showInputDialog("How much are you gonna pay?");
    double subTotal = Double.parseDouble(subTotalAmount);
    double total = subTotal + (subTotal * TAX);
    //int stringSize = name.length();
    //System.out.println(stringSize);
   // String lastTwo = name.substring();
    
    
    Date dateObject = new Date();
    Timestamp ts = new Timestamp(dateObject.getTime());
    String date = ts.toString();
    //System.out.println(date);
    
    String uniqueId = name.substring(name.length()-2,name.length()).toUpperCase();
    uniqueId += date.substring(0,4);
    uniqueId += payment.toUpperCase().charAt(0);
    uniqueId += payment.toUpperCase().charAt(payment.length()-1);
    uniqueId += totalArticles * 3;
    
   
    
    
    
    JOptionPane.showMessageDialog(null,"------------Welcome to Target-------------\n Payment Method:             "+ payment
                                    +"\nTotal Articles:              \t "+articles
                                    + "\nSubtotal Amount:         $"+subTotal 
                                    +"\n Total:                          \t $"+total
                                    +"\n Today's Date:             "+date
                                    +"\n Unique Number:               "+uniqueId
                                    +"\n -------Thank You For Shopping With Us!!------");
    
  }
}