import java.util.*;


class shiftCaesar 
{ 
	public static StringBuffer encrypt(String text, int s) 
	{ 
		StringBuffer result= new StringBuffer(); 

		for (int i=0; i<text.length(); i++) 
		{ 
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

	public static StringBuffer decrypt(String text, int s) 
	{ 
		StringBuffer result= new StringBuffer(); 

		for (int i=0; i<text.length(); i++) 
		{ 
			if (Character.isUpperCase(text.charAt(i))) 
			{ 
				char ch = (char)(((int)text.charAt(i) - s - 65) % 26 + 65); 
				result.append(ch); 
			} 
			else
			{ 
				char ch = (char)(((int)text.charAt(i) - s - 97) % 26 + 97); 
				result.append(ch); 
			} 
		} 
		return result; 
	} 
   
   
	public static void main(String[] args) 
	{ 
		String msg;
      String encrypted;
      String decrypted; 
		int key; 
      
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter message: ");
      msg = scan.nextLine();
      
      System.out.print("Enter key: ");
      key = scan.nextInt();
      
      encrypted = encrypt(msg, key).toString();
      
		System.out.println("Text : " + msg); 
		System.out.println("Shift : " + key); 
		System.out.println("Cipher: " + encrypt(msg, key)); 
		System.out.println("Decrypted Cipher: " + decrypt(encrypted, key)); 
	} 
} 
