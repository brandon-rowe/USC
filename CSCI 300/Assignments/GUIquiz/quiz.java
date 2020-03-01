/*Write a GUI program. In your program, display three color radio buttons,
 red, yellow, and green for color choices. Then, according to the user's
 choice of color, draw a red yellow or green circle.*/

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

public class quiz
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("CSCI ll Quiz");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      RadioOptionsPanel panel = new RadioOptionsPanel();
      frame.getContentPane().add(panel);
      
      frame.pack();
      frame.setVisible(true);
   }
   
}