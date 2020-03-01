import java.awt.*;
import java.awt.event.*;

class CalcFrame extends Frame implements ActionListener
{
   Button bNum[]=new Button[10];
   Button bAdd,bSub,bMul,bDiv,bEql,bClr;
   TextField tScr;
   String opn="";
   
   String prv,cur;
   int prvDec ,curDec;
   
   CalcFrame()
   {
      super("Calculator");
      setSize(250,350);
      setLocation(300,200);
      setResizable(false);
      for(int i=0;i<10;i++)
      {
         bNum[i]=new Button(String.valueOf(i));
         bNum[i].setFont(new Font("lucida console",Font.PLAIN,18));
         bNum[i].setBackground(new Color(180,180,180));
      }   
      // Adding Buttons to Frame
      bAdd=new Button("+");
      bAdd.setFont(new Font("lucida console",Font.PLAIN,18));
      bAdd.setBackground(new Color(170,170,255));
      
      bSub=new Button("-");
      bSub.setFont(new Font("lucida console",Font.PLAIN,18));
      bSub.setBackground(new Color(170,170,255));
      
      bMul=new Button("*");
      bMul.setFont(new Font("lucida console",Font.PLAIN,18));
      bMul.setBackground(new Color(170,170,255));
      
      bDiv=new Button("/");
      bDiv.setFont(new Font("lucida console",Font.PLAIN,18));
      bDiv.setBackground(new Color(170,170,255));
      
      bEql=new Button("=");
      bEql.setFont(new Font("lucida console",Font.PLAIN,18));
      bEql.setBackground(new Color(255,255,170));
      
      bClr=new Button("Clr");
      bClr.setFont(new Font("lucida console",Font.PLAIN,18));
      bClr.setBackground(new Color(255,180,180));
        
      tScr=new TextField();
      tScr.setEditable(false);
      tScr.setFont(new Font("lucida console",Font.BOLD|Font.ITALIC,35));
      tScr.setBackground(Color.black);
      tScr.setForeground(Color.white);
        
      setLayout(new BorderLayout(5,5));
        
      add(tScr,BorderLayout.NORTH);
      //Add Buttons To Panel
      Panel p=new Panel();
      p.setLayout(new GridLayout(5,4,5,5));
      
      p.add(new Label());
      p.add(new Label());
      p.add(new Label());
      p.add(bClr);
      p.add(bEql);
      p.add(bDiv);   
      p.add(bAdd);
      p.add(bMul);   
      p.add(bSub);
        
      p.add(bNum[1]);
      p.add(bNum[0]);
      
      add(p,BorderLayout.CENTER);
      //Add Listners to button
      for(int i=0;i<10;i++)
      bNum[i].addActionListener(this);
      
      bAdd.addActionListener(this);
      bSub.addActionListener(this);
      bMul.addActionListener(this);
      bDiv.addActionListener(this);
      bEql.addActionListener(this);
      bClr.addActionListener(this);
      
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
            prv=cur;
            cur="0";
            }
            else
            evaluate();
            opn="+";
            break;
           
         case "-":
            if(opn=="")
            {
            prv=cur;
            cur="0";
            }
            else
            evaluate();
            opn="-";
            break;
           
         case "*":
            if(opn=="")
            {
            prv=cur;
            cur="0";
            }
            else
            evaluate();
            opn="*";
            break;
           
         case "/":
            if(opn=="")
            {
            prv=cur;
            cur="0";
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
            cur=prv="0";
            opn="";
            tScr.setText("0");
            break;
         default:
           
            cur=cur + op;
            tScr.setText(cur+"");
   
      }
   }
     
   void evaluate()
   {
      prvDec = BinaryToDecimal(prv);
      curDec = BinaryToDecimal(cur);
     
      switch(opn)
      {
         case"+":
           
         prvDec+=curDec;break;
           
         case"-":
         prvDec-=curDec;break;
           
         case"*":
         prvDec*=curDec;break;
           
         case"/":
         prvDec/=curDec;break;
      }
   
      tScr.setText(DecimalToBinary(prvDec));
      cur=0;
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
   
   public class BinaryDecimal
   {
    
    //Convert from Binary number (String) to integer
    public static int BinaryToDecimal(String bin)
    {
        int flag=0; //0 positive number 1 negative 
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
    
    //Convert from integer to Binary number
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
