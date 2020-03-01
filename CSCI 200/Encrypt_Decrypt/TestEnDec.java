//********************************************************************
//  TestEnDec.java       
//
//  This program will test the Decode class.
//
//********************************************************************

public class TestEnDec
{
  
    public static void main(String[] args)
    {

         // Encode a Message
         MyEnDec msg = new MyEnDec(5);//

         msg.setDecodedMsg("We are almost done!!!!");
         System.out.println("This is loaded message: " + msg.getDecodedMsg());
         
         System.out.println();
         System.out.println("===========================");
         System.out.println();

         //Encode Message     
         msg.encodeMsg(); //Encode message
         System.out.println("The encoded message is " + msg.getEncodedMsg());
     
         Decode Message
         msg.decodeMsg();  //Decode a Message
         System.out.println("The decoded message is " + msg.getDecodedMsg());
       

     System.out.println("\n \t End of program!!!!");
     
    }
}
