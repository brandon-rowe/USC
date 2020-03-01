import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioOptionsPanel extends JPanel
{     
      private JLabel str;
      private JRadioButton redBtn, yellowBtn, greenBtn, cirBtn, sqrBtn;
      private Color colored;
      CircleQuiz circleRed, circleYellow, circleGreen;
      
      public RadioOptionsPanel()
      {  
         circleRed = new CircleQuiz(colored);
         circleYellow = new CircleQuiz(colored);
         circleGreen = new CircleQuiz(colored);
         
         setLayout(new GridLayout(2,3));
         
         str = new JLabel();
         str.setVisible(true);
         
         redBtn = new JRadioButton("red");
         yellowBtn = new JRadioButton("yellow");
         greenBtn = new JRadioButton("green");
         add(redBtn);
         add(yellowBtn);
         add(greenBtn);
         
         cirBtn = new JRadioButton("circle");
         sqrBtn = new JRadioButton("Square");
         add(cirBtn);
         add(sqrBtn);
         add(str);
         
         ButtonGroup color = new ButtonGroup();
         color.add(redBtn);
         color.add(yellowBtn);
         color.add(greenBtn);
         
         ButtonGroup shape = new ButtonGroup();
         shape.add(cirBtn);
         shape.add(sqrBtn);
    
         RadioListener listener = new RadioListener();
         redBtn.addActionListener(listener);
         yellowBtn.addActionListener(listener);
         greenBtn.addActionListener(listener);
         cirBtn.addActionListener(listener);
         sqrBtn.addActionListener(listener);
         
         setBackground(Color.cyan);
         setPreferredSize(new Dimension (500,500));
         setVisible(true);
         
      }
      
      public void paintComponent(Graphics page)
      {
         super.paintComponent(page);
         
         circleRed.draw(page);
         circleYellow.draw(page);
         circleGreen.draw(page);
      }

   
   private class RadioListener implements ActionListener
   {
      
      public void actionPerformed(ActionEvent event)
      {
         Object source = event.getSource();
         
         if (source == redBtn)
         {
            str.setText("RED");
            colored = Color.red;
         }
         else if (source == yellowBtn)
         {
            str.setText("YELLOW");
            colored = Color.yellow;
         }
         else if (source == greenBtn)
         {
            str.setText("GREEN");
            colored = Color.green;
         }
         else if (source == cirBtn)
         {  
            str.setText("CIRCLE");
            
         }
         else if (source == sqrBtn)
         {
            str.setText("SQUARE");
            //add(sqr);
         }
         else
            str.setText("");
      }
   }  

    
}


   /*public class Square extends JPanel
   {
      Square()
      {
         setPreferredSize(new Dimension(50, 50));
      }
      
     
      public void paintComponent(Graphics page)
      {
         super.paintComponent(page);
         
         if (colored == "red")
         {
            page.setColor(Color.red);
            page.fillRect(50, 50, 50, 50);
         }
         else if (colored == "yellow")
         {
            page.setColor(Color.yellow);
            page.fillRect(50, 50, 50, 50);
         }
         else if (colored == "green")
         {
            page.setColor(Color.green);
            page.fillRect(50, 50, 50, 50);
         }
         else
            page.fillRect(50, 50, 50, 50);
      }
   }  
   
   public class Circle extends JPanel
   {
      public Circle()
      {
         setPreferredSize(new Dimension(50, 50));
      }
     
      public void paintComponent(Graphics page)
      {
         super.paintComponent(page);
         
         if (colored == "red")
         {
            page.setColor(Color.red);
            page.fillOval(50, 50, 50, 50);
         }
         else if (colored == "yellow")
         {
            page.setColor(Color.yellow);
            page.fillOval(50, 50, 50, 50);
         }
         else if (colored == "green")
         {
            page.setColor(Color.green);
            page.fillOval(50, 50, 50, 50);
         }
         else
            page.fillOval(50, 50, 50, 50);
      }
   } */