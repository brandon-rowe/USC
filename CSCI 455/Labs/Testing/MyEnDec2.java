//********************************************************************
//  Decode.java       Author: Brandon Rowe
//
//  The class will encode & decode a string

//********************************************************************

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Collections;


public class MyEnDec
{
    //Instance variables go here 
    private String decodedMsg;
    private String encodedMsg;
    private int encodeKey = 5;
   
    //  Class constructor
    public MyEnDec(int encodeKey) {encodeKey = encodeKey;}//MyEnDec
    
    public String getEncodedMsg() {return  encodedMsg;}//getEncodedMsg

    public void setEncodeMsg(String encodedMsg){encodedMsg = encodedMsg;}//setEncodeMsg

    public String getDecodedMsg(){return  decodedMsg;}//getDecod           public void setDecodedMsg(String decodedMsg){decodedMsg = decodedMsg;}//setDecodedMsg

    public void decodeMsg(String encodedMsg)
    { 
        // Read in decodedMsg from Class
         int i;
         String str = encodedMsg;
         String decoded;
         char[] charArray = new char[100];

         for (i = 0; i < str.length(); i++)
         {
             char main = str.charAt(i);
             int ascii = (int) main;
             ascii += 5;
             char main2 = (char) ascii;
             charArray[i] = main2;
         } 
         decoded = charArray.toString();
         decodedMsg = decoded;
     }//decodeMsg

     public void encodeMsg(String decodedMsg)
     {
         // Read in decodedMsg from Class
         int i;
         String str = decodedMsg;
         String encoded;
         char[] charArray = new char[100];


         for (i = 0; i < str.length(); i++)
         {
             char main = str.charAt(i);
             int ascii = (int) main;
             ascii -= 5;
             char main2 = (char) ascii;
             charArray[i] = main2;
         }
         
         encoded = charArray.toString();
         encodedMsg = encoded;
     }    
        /* String str = decodedMsg;
         String encoded;
         char[] charArray = new char[100];


         for (i = 0; i < charArray.length; i++)
         {
             char main = charArray.charAt(i);
             int ascii = (int) main;
             ascii -= 5;
             ascArray=addInt(ascii);
         }

         for (i = 0; i < ascArray.length; i++)
         {
             int ascii = ascArray.intAt(i);
             char main = (char) ascii;
             charArray = addChar(main);
         }

         encoded = charArray.toString();
         encodedMsg = encoded;
     }//encodeMsg
     */
     
}

