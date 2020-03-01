// BinaryPanel.java

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class BinaryPanel extends JPanel
{
   private String outputStr = "", topStr = "";
   private JLabel top, output;
   private JButton btn0, btn1, btnAdd, btnSub, btnMul, btnDiv, btnEqu, btnClr, btnCE, btnPlusMinus, btnBackSpace;
   
   public BinaryPanel()
   {
      ButtonListener listener = new ButtonListener();
      btn0 = new JButton("0");
      btn0.addActionListener(listener);
      btn1 = new JButton("1");
      btn1.addActionListener(listener);
      btnAdd = new JButton("+");
      btnAdd.addActionListener(listener);
      btnSub = new JButton("-");
      btnSub.addActionListener(listener);
      btnMul = new JButton("X");
      btnMul.addActionListener(listener);
      btnDiv = new JButton("/");
      btnDiv.addActionListener(listener);
      btnEqu = new JButton("=");
      btnEqu.addActionListener(listener);
      btnClr = new JButton("C");
      btnClr.addActionListener(listener);
      btnCE = new JButton("CE");
      btnCE.addActionListener(listener);
      btnPlusMinus = new JButton("+/-");
      btnPlusMinus.addActionListener(listener);
      btnBackSpace = new JButton("CE");
      btnBackSpace.addActionListener(listener);
      
      top = new JLabel();
      top.setBackground(Color.white);
      top.setOpaque(true);
      top.setMinimumSize(new Dimension (250, 10));
      top.setPreferredSize(new Dimension (250, 10));
      top.setMaximumSize(new Dimension (250, 10));
      
      output = new JLabel();
      output.setBackground(Color.white);
      output.setOpaque(true);
      output.setMinimumSize(new Dimension (250, 20));
      output.setPreferredSize(new Dimension (250, 20));
      output.setMaximumSize(new Dimension (250, 20));
      
      add(output);
      add(btn0);
      add(btn1);
      add(btnAdd);
      add(btnSub);
      add(btnMul);
      add(btnDiv);
      add(btnEqu);
      add(btnClr);
      add(btnCE);
      add(btnPlusMinus);
      add(btnBackSpace);
      
      setPreferredSize(new Dimension(300, 150));
      setBackground(Color.cyan);
   }
   
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         
         if (event.getSource() == btn0)
         {
            topStr = outputStr;
            outputStr = outputStr + "0";
            output.setText(outputStr);
         }
         else if (event.getSource() == btn1)
         {
            topStr = outputStr;
            outputStr = outputStr + "1";
            output.setText(outputStr);
         }
         else if (event.getSource() == btnAdd)
         {
            topStr = outputStr;
            outputStr = outputStr + "+";
            output.setText(outputStr);
         }
         else if (event.getSource() == btnSub)
         {
            topStr = outputStr;
            outputStr = outputStr + "-";
            output.setText(outputStr);
         }
         else if (event.getSource() == btnMul)
         {
            topStr = outputStr;
            outputStr = outputStr + "*";
            output.setText(outputStr);
         }
         else if (event.getSource() == btnDiv)
         {
            topStr = outputStr;
            top.setText(topStr);
            outputStr = outputStr + "/";
            output.setText(outputStr);
         }
         else if (event.getSource() == btnEqu)
         {
            topStr = outputStr;
            top.setText(topStr);
            output.setText(outputStr);
         }
         else if (event.getSource() == btnClr)
         {
            outputStr = "";
            topStr = "";
            top.setText(topStr);
            output.setText(outputStr);
         }
         else if (event.getSource() == btnCE)
         {
            topStr = outputStr;
            top.setText(topStr);
            outputStr = "";
            output.setText(outputStr);
         }
         else if (event.getSource() == btnPlusMinus)
         {
            outputStr = outputStr + "/";
            output.setText(outputStr);
         }
         else if (event.getSource() == btnBackSpace)
         {
            outputStr = outputStr + "";
            output.setText(outputStr);
         }
      }
   }
}