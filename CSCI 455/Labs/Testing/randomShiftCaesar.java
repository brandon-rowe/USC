//Random Shift Caesar Encryption
//Each char is encoded with a different key value
//Differs from Caesar cipher where each char is encoded
//with the same key value.

/* :Issues <<>> Fix decrypt method to provide all
possible answers. This will be checking all 26 letters
to all letter/char/keyspace entries and all possible
combinations of these. <<>> Isses: */

import java.util.*;


class randomShiftCaesar 
{ 
	public static StringBuffer encrypt(String text) 
	{ 
		StringBuffer result= new StringBuffer(); 

		for (int i=0; i<text.length(); i++) 
		{ 
         
         Random key = new Random();
         int s = key.nextInt(25);
         
			if (Character.isUpperCase(text.charAt(i))) 
			{ 
				char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65); 
				result.append(ch); 
			} 
			else
			{ 
				char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97); 
				result.append(ch); 
			} 
		} 
		return result; 
	}  
   
   /*public static StringBuffer decrypt(String text) 
	{ 
		StringBuffer result= new StringBuffer(); 

		for (int i=0; i<text.length(); i++) 
		{ 
         for(int s=0; s<25; s++)
         {
            for (int j=0; j<25; j++)
            
   			if (Character.isUpperCase(text.charAt(i))) 
   			{ 
   				char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65); 
   				result.append(ch); 
   			} 
   			else
   			{ 
   				char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97); 
   				result.append(ch); 
   			} 
         }
		} 
		return result; 
	}  */
   
	public static void main(String[] args) 
	{ 
		String msg;
      String encrypted;
      String decrypted;
      
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter message: ");
      msg = scan.nextLine();
      
      encrypted = encrypt(msg).toString();
      //decrypted = decrypt(encrypted).toString(); 
      
		System.out.println("Text : " + msg); 
		System.out.println("Cipher: " + encrypted);
      
       
	} 
} 
