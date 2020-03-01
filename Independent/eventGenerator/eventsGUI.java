import java.awt.*;
import javax.swing.*;
public class eventsGUI extends JFrame{
    eventsGUI(){  
         Button b=new Button("Button!!"); 
         b.setBounds(50,200,50,200);  
         add(b); 
        
         b.setLocation(500, 371);
         b.setPreferredSize(new Dimension(116, 40));
         b.setLocation(500, 371);
         b.setPreferredSize(new Dimension(116, 40));
         setSize(500,300); 
         setTitle("Events Generator"); 
        
         setLayout(new FlowLayout());
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setPreferredSize(new Dimension(750, 500));
         this.setResizable(false);   
         this.pack();
         this.setVisible(true); 
    }  
    public static void main(String args[]){ 
         eventsGUI fr=new eventsGUI();  
    }
}