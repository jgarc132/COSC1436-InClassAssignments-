import javax.swing.JOptionPane;
public class StoreReceiptJOP
{
  public static void main (String[] args)
  {
    final double TAX = 0.0825;
    String article = JOptionPane.showInputDialog("How many Articles are you gonna buy?");
    String subTotalAmount = JOptionPane.showInputDialog("How much are you gonna pay?");
    double subTotal = Double.parseDouble(subTotalAmount);
    double total = subTotal + (subTotal * TAX);
    
    
    JOptionPane.showMessageDialog(null,"--------Welcome to Target----------\nTotal Ariticles:               "+article
                                    + "\nSubtotal Amount:         $"+subTotal 
                                    +"\n Total:                          \t $"+total
                                    +"\n --------------------------------------------");
                                
  }
}