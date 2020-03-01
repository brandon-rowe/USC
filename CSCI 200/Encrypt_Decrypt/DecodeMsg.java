//********************************************************************
//  DecodeMsg.java       Author: Brandon Rowe
//
//  Demonstrates the use of the String class and its methods.
//********************************************************************

//import java.util.Scanner;

public class DecodeMsg
{
    //-----------------------------------------------------------------
    //  Prints a string and various mutations of it.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        

        String fullMsg = "N%knlzwji%ny%tzy&&&&&";
        int x;
        char char1, char2, char3, char4, char5, char6, char7, char8, char9, char10, char11; //to take in value
        char char12, char13, char14, char15, char16, char17, char18, char19, char20, char21; //to take in value
        
        char char1new, char2new, char3new, char4new, char5new, char6new, char7new, char8new, char9new, char10new, char11new; // assign new value
        char char12new, char13new, char14new, char15new, char16new, char17new, char18new, char19new, char20new, char21new; // assign new value

        //Scanner scan = new Scanner(System.in);

        //System.out.println("Please enter a message to decode (21 Characters): ");
        //fullMsg = scan.nextLine();

       

        char1 = fullMsg.charAt(0);
        char2 = fullMsg.charAt(1);
        char3 = fullMsg.charAt(2);
        char4 = fullMsg.charAt(3);
        char5 = fullMsg.charAt(4);
        char6 = fullMsg.charAt(5);
        char7 = fullMsg.charAt(6);
        char8 = fullMsg.charAt(7);
        char9 = fullMsg.charAt(8);
        char10 = fullMsg.charAt(9);
        char11 = fullMsg.charAt(10);
        char12 = fullMsg.charAt(11);
        char13 = fullMsg.charAt(12);
        char14 = fullMsg.charAt(13);
        char15 = fullMsg.charAt(14);
        char16 = fullMsg.charAt(15);
        char17 = fullMsg.charAt(16);
        char18 = fullMsg.charAt(17);
        char19 = fullMsg.charAt(18);
        char20 = fullMsg.charAt(19);
        char21 = fullMsg.charAt(20);

        {
        x = (int)char1;
        char1new = (char)(x - 5);
        }
        
        {
        x = (int)char2;
        char2new = (char)(x - 5);
        }
        
        {
        x = (int)char3;
        char3new = (char)(x - 5);
        }
        
        {
        x = (int)char4;
        char4new = (char)(x - 5);
        }
        
        {
        x = (int)char5;
        char5new = (char)(x - 5);
        }
        
        {
        x = (int)char6;
        char6new = (char)(x - 5);
        }
        
        {
        x = (int)char7;
        char7new = (char)(x - 5);  
        }      

        {
        x = (int)char8;
        char8new = (char)(x - 5);  
        }     
         
        {
        x = (int)char9;
        char9new = (char)(x - 5);  
        }    

        {
        x = (int)char10;
        char10new = (char)(x - 5);  
        }   
        
        {
        x = (int)char11;
        char11new = (char)(x - 5);  
        } 

        {
        x = (int)char12;
        char12new = (char)(x - 5);  
        } 
        
        {
        x = (int)char13;
        char13new = (char)(x - 5);  
        } 
        
        {
        x = (int)char14;
        char14new = (char)(x - 5);  
        } 
        
        {
        x = (int)char15;
        char15new = (char)(x - 5);  
        } 
        
        {
        x = (int)char16;
        char16new = (char)(x - 5);  
        } 
        
        {
        x = (int)char17;
        char17new = (char)(x - 5);  
        } 
        
        {
        x = (int)char18;
        char18new = (char)(x - 5);  
        } 
        
        
        {
        x = (int)char19;
        char19new = (char)(x - 5);  
        } 
        
        {
        x = (int)char20;
        char20new = (char)(x - 5);  
        } 
        
        {
        x = (int)char21;
        char21new = (char)(x - 5);  
        } 
        
        System.out.print(char1new + "" + char2new + "" + char3new + "" + char4new + "" + char5new + "" + 
        char6new + "" + char7new + "" + char8new + "" + char9new + "" + char10new + "" + char11new + "" + 
        char12new + "" + char13new + "" + char14new + "" + char15new + "" + char16new + "" + char17new + "" + 
        char18new + "" + char19new + "" + char20new + "" +char21new);
        System.out.println("\n \t End of program!!!!");

    }
}
