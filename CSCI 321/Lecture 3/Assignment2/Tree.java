// JAVA implementation of tree using array 
// numbering starting from 0 to n-1. 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

class Tree 
{ 
	public static void main(String[] args) 
	{ 
		Array_imp obj = new Array_imp(); 
		obj.Root("A"); 
	   obj.set_Left("B", 0); 
		obj.set_Right("C", 0); 
		obj.set_Left("D", 1); 
		obj.set_Right("E", 1); 
		obj.set_Left("F", 2); 
		obj.print_Tree(); 

                         /*Code above is an example of an instance. You need to input the tree shown in slide 33*/
	} 
} 


