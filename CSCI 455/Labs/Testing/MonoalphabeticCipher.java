//package com.sanfoundry.setandstring;
 
import java.util.Scanner;
 
public class MonoalphabeticCipher
{
    public static char p[]  = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z' };
    public static char ch[] = { 'E', 'T', 'A', '0', 'I', 'N', 'S', 'R', 'H',
            'D', 'L', 'C', 'U', 'M', 'W', 'F', 'G', 'Y', 'P', 'B', 'V', 'K',
            'J', 'X', 'Q', 'Z' };
 
    public static String doEncryption(String s)
    {
        char c[] = new char[(s.length())];
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = 0; j < 26; j++)
            {
                if (p[j] == s.charAt(i))
                {
                    c[i] = ch[j];
                    break;
                }
            }
        }
        return (new String(c));
    }
 
    public static String doDecryption(String s)
    {
        char p1[] = new char[(s.length())];
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = 0; j < 26; j++)
            {
                if (ch[j] == s.charAt(i))
                {
                    p1[i] = p[j];
                    break;
                }
            }
        }
        return (new String(p1));
    }
 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message: ");
        String en = doDecryption(sc.next().toLowerCase());
        System.out.println("Encrypted message: " + en);
        System.out.println("Decrypted message: " + en);
        sc.close();
    }
}