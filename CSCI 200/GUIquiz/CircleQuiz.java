//Circle.java

import javax.swing.*;
import java.awt.*;

public class CircleQuiz
{
   private Color color;
   
   public CircleQuiz(Color shade)
   {
      color = shade;
   }
   
   public void draw(Graphics page)
   {
      page.setColor(color);
      page.fillOval(200, 200, 50, 50);
   }
   
   public void setColor(Color shade)
   {
      color = shade;
   }
   
   public Color getColor()
   {
      return color;
   }
}