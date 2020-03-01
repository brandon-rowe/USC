import java.util.*;

class TreeN 
{
   // A linked list node
   int data;
   
   TreeN left;
   
   TreeN right;
   
   TreeN(int data) 
   {
   
      left = null;
      right = null;
        
      this.data = data;
   }
}

class Tree // Main class
{

   TreeN fun(TreeN root, int data) 
   { // create binary tree
   
      if (root == null) 
      {
         return new TreeN(data);
      }
      if (data > root.data) 
      {
         root.right = fun(root.right, data);
      }
      else if (data < root.data) 
      {
         root.left = fun(root.left, data);
      }
      else 
      {      
         return root;
      }
      
      return root;
   }


   void display(TreeN head) //display binary tree
   {
      if (head != null)
      {
         display(head.left);
         System.out.print(head.data + " ");
         display(head.right);
      }
   }
   public static void main(String[] args)
   {
      TreeN head=null;
      Tree t = new Tree();
        
      head = t.fun(head , 10);
      head = t.fun(head , 5);
      head = t.fun(head , 15);
      head = t.fun(head , 25);
      head = t.fun(head , 1);
      head = t.fun(head , 35);
      head = t.fun(head , 100);
        
      t.display(head); // Inorder Traversal
     
   }
}