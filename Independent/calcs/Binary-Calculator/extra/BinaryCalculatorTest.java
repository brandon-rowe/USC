// Binary Calculator Driver

import javax.swing.*;
import java.util.*;
import java.awt.*;

public class BinaryCalculatorTest
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Binary Calculator");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //frame.setResizable(false);
      frame.getContentPane().add(new BinaryPanel());
      frame.pack();
      frame.setVisible(true);
   }
   
}