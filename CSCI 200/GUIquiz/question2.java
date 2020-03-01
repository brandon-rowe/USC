//Gui Radio buttons
//2 groups of radio buttons, one group has 3 color radio buttons r,y,g.
//The other group has 2 shape radio buttons, cir & sqr
//Draw filled()r,y,g cir or sqr

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

public class question2
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Question 2");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      RadioOptionsPanel panel = new RadioOptionsPanel();
      frame.getContentPane().add(panel);
      
      frame.pack();
      frame.setVisible(true);
   }
   
}