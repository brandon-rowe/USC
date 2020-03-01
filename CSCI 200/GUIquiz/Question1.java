import javax.swing.JOptionPane;
import java.util.*;

public class Question1
{
   public static void main(String[] args)
   {
      String out, check;
      int num1, num2, result, input, again;
      
      do
       {   
         Random rand = new Random();
         num1 = rand.nextInt(10);
         num2 = rand.nextInt(10);
         result = num1 + num2;
         out = JOptionPane.showInputDialog("What is the result of "+ num1 + " and " + num2 + "?");
         input = Integer.parseInt(out);
         if (result == input)
            {
            JOptionPane.showMessageDialog(null, "The answer is right");
            System.exit(0);
            }
            
         else
            {JOptionPane.showMessageDialog(null, "The answer is wrong");}
            again = JOptionPane.showConfirmDialog(null, "Do another?");    
       } 
       while(again == JOptionPane.YES_OPTION);
   }
}