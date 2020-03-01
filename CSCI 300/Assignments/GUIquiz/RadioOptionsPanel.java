import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioOptionsPanel extends JPanel
{     
      private JLabel str;
      private JRadioButton redBtn, yellowBtn, greenBtn;
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
         add(str);
         
         ButtonGroup color = new ButtonGroup();
         color.add(redBtn);
         color.add(yellowBtn);
         color.add(greenBtn);
         
    
         RadioListener listener = new RadioListener();
         redBtn.addActionListener(listener);
         yellowBtn.addActionListener(listener);
         greenBtn.addActionListener(listener);
         
         setBackground(Color.white);
         setPreferredSize(new Dimension (300,300));
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
            circleRed.setColor(colored);
            circleYellow.setColor(colored);            
            circleGreen.setColor(colored);
         }
         else if (source == yellowBtn)
         {
            str.setText("YELLOW");
            colored = Color.yellow;
            circleRed.setColor(colored);
            circleYellow.setColor(colored);            
            circleGreen.setColor(colored);
         }
         else if (source == greenBtn)
         {
            str.setText("GREEN");
            colored = Color.green;
            circleRed.setColor(colored);
            circleYellow.setColor(colored);            
            circleGreen.setColor(colored);
         }
         
         else
            str.setText("");
      }
   }  

    
}


 