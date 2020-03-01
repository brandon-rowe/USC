import java.util.*;
import java.lang.*;

public class Resume
{
   private String name;
   private String degree;
   private String gpa;
   
   public Resume(String inName, String inDegree, double inGpa)
   {
      this.name = inName;
      this.degree = inDegree;
      this.gpa = inGpa;
      
   }
   
   public Resume(String inName, String inDegree)
   {
      this.name = inName;
      this.degree = inDegree;
      
   }
   
   public Resume(String inName)
   {
      this.name = inName;
   }
   public final String toString() 
   {
      String info = "\t Hello: " + this.name + "\n\t " + "Degree: " + this.degree;
       return info;
   }
   /*public final String header()
   {
      String header = name + "\n" + 
   }*/
}