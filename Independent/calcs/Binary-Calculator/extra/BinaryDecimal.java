import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

class CalcFrame extends Frame implements ActionListener
{
   Button btnNum[] = new Button[10];
   Button btnAdd, btnSub, btnMul, btnDiv, btnEqu, btnClr;
   TextField label;   
   String pre, cur, opn = "";
   int preDec ,curDec;

   CalcFrame()
   {
      super("Calculator");
      setSize(250,350);
      setLocation(300,200);
      setResizable(false);
      
      for(int i=0;i<10;i++)
      {
         btnNum[i]=new Button(String.valueOf(i));
         btnNum[i].setFont(new Font("lucida console",Font.PLAIN,18));
         btnNum[i].setBackground(new Color(180,180,180));
      }
      
      btnAdd=new Button("+");
      btnAdd.setFont(new Font("lucida console",Font.PLAIN,18));
      btnAdd.setBackground(Color.white);
      
      btnSub=new Button("-");
      btnSub.setFont(new Font("lucida console",Font.PLAIN,18));
      btnSub.setBackground(Color.white);
      
      btnMul=new Button("*");
      btnMul.setFont(new Font("lucida console",Font.PLAIN,18));
      btnMul.setBackground(Color.white);
      
      btnDiv=new Button("/");
      btnDiv.setFont(new Font("lucida console",Font.PLAIN,18));
      btnDiv.setBackground(Color.white);
      
      btnEqu=new Button("=");
      btnEqu.setFont(new Font("lucida console",Font.PLAIN,18));
      btnEqu.setBackground(Color.white);
      
      btnClr=new Button("Clr");
      btnClr.setFont(new Font("lucida console",Font.PLAIN,18));
      btnClr.setBackground(Color.white);
        
      label=new TextField();
      label.setEditable(false);
      label.setFont(new Font("lucida console",Font.BOLD|Font.ITALIC,35));
      label.setBackground(Color.gray);
      label.setForeground(Color.white);
        
      setLayout(new BorderLayout(5,5));
        
      add(label,BorderLayout.NORTH);
      
      Panel grid = new Panel();
      grid.setLayout(new GridLayout(5,4,5,5));
      
      grid.add(btnClr);
      grid.add(btnEqu);
      grid.add(btnDiv);   
      grid.add(btnAdd);
      grid.add(btnMul);   
      grid.add(btnSub);
      grid.add(btnNum[0]);
      grid.add(btnNum[1]);
      
      add(grid, BorderLayout.CENTER);
      
      for(int i=0; i<10; i++)
      {
         btnNum[i].addActionListener(this);
      }
      btnAdd.addActionListener(this);
      btnSub.addActionListener(this);
      btnMul.addActionListener(this);
      btnDiv.addActionListener(this);
      btnEqu.addActionListener(this);
      btnClr.addActionListener(this);
      
      addWindowListener(new CalcWndAdapter());
   }

   public Insets getInsets()
   {
      return new Insets(40,10,10,10);
   }
   
   // Listners Action Performed
   public void actionPerformed(ActionEvent ae)
   {
      String op=((Button)(ae.getSource())).getLabel();
      switch(op)
      {  
         case "+":
         if(opn=="")
         {
            pre=cur;
            cur="";
         }
         else
            evaluate();
            opn="+";
         break;
        
         case "-":
         if(opn=="")
         {
            pre=cur;
            cur="";
         }
         else
            evaluate();
            opn="-";
         break;
           
         case "*":
         if(opn=="")
         {
            pre=cur;
            cur="";
         }
         else
            evaluate();
            opn="*";
         break;
        
         case "/":
         if(opn=="")
         {
            pre=cur;
            cur="";
         }
         else
            evaluate();
            opn="/";
         break;
      
         case "=":
         if(opn!="")
         {
            evaluate();
            opn="=";
         }
         break;
      
         case "Clr":
            cur=pre="0";
            opn="";
            label.setText("");
         break;
         default:
        
         cur = cur;
         cur = cur + op;
         label.setText(cur + " ");
      
      }
   }
  
   void evaluate()
   {
      //BinaryDecimal bin = new BinaryDecimal();
      preDec = BinaryToDecimal(pre);
      curDec = BinaryToDecimal(cur);
        
      switch(opn)
      {
         case"+":
         preDec+=curDec;
         break;
           
         case"-":
         preDec-=curDec;
         break;
           
         case"*":
         preDec*=curDec;
         break;
           
         case"/":
         preDec/=curDec;
         break;
      }
         
      label.setText(DecimalToBinary(preDec));
      cur="";
   }
   
   public static int BinaryToDecimal(String bin)
   {
        int flag=0;
        flag = (bin.charAt(0) != '-' ? 0:1);
        if (bin.charAt(0) == '+' || bin.charAt(0) == '-')
            bin = bin.substring(1);
        int decimal = 0;
        int digit;
        for (int i=bin.length()-1;i>=0;i--)
        {
            if (bin.charAt(i) == '0')
               digit = 0;
            else if (bin.charAt(i) == '1')
               digit = 1;
            else
            {
               System.out.println("Invalid input");
               return -1;
            }
            decimal += digit*Math.pow(2.0,bin.length()-1-i);
        }
        if (flag == 1)
           return -decimal;
        return decimal;
    }
    
    public static String DecimalToBinary(int decimal)
    {
        String bin = "";
        String result = "";
        if (decimal<0)
        {
            result += "-";
            decimal = 0-decimal;
        }
        if (decimal == 0)
        {
            result = "0";
            return result;
        }
        while (decimal/2 != 0)
        {
            bin += (decimal%2==1)? "1":"0";
            decimal /= 2;
        }
        bin += "1";
          
        for (int i=bin.length()-1;i>=0;i--)
            result += bin.charAt(i);
        return result;
     }
    
}

class CalcWndAdapter extends WindowAdapter
{
   public void windowClosing(WindowEvent we)
   {
   System.exit(0);
   }
}

class calc
{
   public static void main(String arg[])
   {
      CalcFrame cf=new CalcFrame();
      cf.setVisible(true);
   }
}
