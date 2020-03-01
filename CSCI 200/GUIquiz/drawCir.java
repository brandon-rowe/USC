//drawCir.java
import java.awt.*;
import javax.swing.*;

public class drawCir extends JPanel
{  
   public String color;
   
   public drawCir(String colored)
   {
      color = colored;
      setPreferredSize(new Dimension(500,500));
   }
   
   public void paintComponent(Graphics page)
   {
      super.paintComponent(page);
      int x = 0, y = 0, diameter = 10;
      
      if (color == "red")
         page.setColor(Color.red);
      else if (color == "yellow")
         page.setColor(Color.yellow);
      else
         page.setColor(Color.green);
         
      page.fillOval(x, y, diameter, diameter);
   }
}