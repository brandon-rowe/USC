//********************************************************************
//  Decode.java       Author: Brandon Rowe
//
//  The class will encode & decode a string

//********************************************************************

import java.text.NumberFormat;
import java.util.Scanner;

public class MyEnDec
{
    //Instance variables go here 
    private String decodedMsg;
    private String encodedMsg;
    private int encodeKey = 5;


    //  Class constructor
    public MyEnDec(int encodeKey)

    {
        encodeKey = encodeKey;
    }//MyEnDec



    public String getEncodedMsg()

    {
        return  encodedMsg;
    }//getEncodedMsg



    public void setEncodeMsg(String encodedMsg)

    {
        encodedMsg = encodedMsg;
    }//setEncodeMsg



    public String getDecodedMsg()

    {
        return  decodedMsg;
    }//getDecodedMsg



    public void setDecodedMsg(String decodedMsg)

    {
        decodedMsg = decodedMsg;
    }//setDecodedMsg



    public void decodeMsg()
    { 
        // Read in decodedMsg from Class
        String str = encodedMsg();
        String decoded;
        int[] ascArray = new Int[100];
        char[] charArray1 = str.toCharArray()


        for (int i = 0; i < charArray1.length; i++)
        {
            char main = charArray1.charAt(i);
            int ascii = (int) main;
            ascii += 5;
            ascArray=addInt(ascii);
        }

        for (int i = 0; i < ascArray.length; i++)
        {
           int ascii = ascArray.intAt(i);
           char main = (char) ascii;
           charArray1 = addChar(main);
        }

        decoded = charArray1.toString();
        decodedMsg = decoded;
        return decodedMsg;
    }//decodeMsg





     public void encodeMsg()
     {
         // Read in decodedMsg from Class
         String str = decodedMsg();
         String encoded;
         int[] ascArray = new Int[100];
         char[] charArray1 = str.toCharArray()


         for (int i = 0; i < charArray1.length; i++)
         {
             char main = charArray1.charAt(i);
             int ascii = (int) main;
             ascii -= 5;
             ascArray=addInt(ascii);
         }

         for (int i = 0; i < ascArray.length; i++)
         {
             int ascii = ascArray.intAt(i);
             char main = (char) ascii;
             charArray1 = addChar(main);
         }

         encoded = charArray1.toString();
         encodedMsg = encoded;
         return encoded;
     }//encodeMsg
}

