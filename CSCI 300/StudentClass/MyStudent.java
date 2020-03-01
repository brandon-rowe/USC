//********************************************************************
//  MyStudent.java       Author:Brandon Rowe
//  The class will compute be used to manage student information.
//********************************************************************

import java.io.*;
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class MyStudent
{
   //Instance variables 
   private float totGraPtHrs;
   private int totPossibleHrs;
   private float gpa;
   private int studId;
   private String fName;
   private String lName;

   //  Class constructor
   public MyStudent(int inStudID, String inFName, String inLName)
   {
      studId = inStudID;
      fName = inFName;
      lName = inLName;
   }
   // Methods 
   public String loadGradeInfo(String inGrade, int inCourseHours)
   {
      double totCourseHours = 0.0;
      int currentCourseHours = inCourseHours;
      double numGrade = 0.0;
      Scanner gradeScan, lineScan;
      gradeScan = new Scanner("myInput.txt");

      // Read and process each line of the file
      while (gradeScan.hasNext())
      {
         lineScan = new Scanner(gradeScan);

              if (inGrade == "A")
	      {numGrade = numGrade + 4.0;
                  lineScan.hasNext();}

              else if (inGrade == "B+")
	      {numGrade = numGrade + 3.5;
                  lineScan.hasNext();}

              else if (inGrade == "B")
	      {numGrade = numGrade + 3.0;
                  lineScan.hasNext();}

              else if (inGrade == "C+")
	      {numGrade = numGrade + 2.5;
                  lineScan.hasNext();}

              else if (inGrade == "C")
	      {numGrade = numGrade + 2.0;
                  lineScan.Next();}

              else if (inGrade == "D+")
	      {numGrade = numGrade + 1.5;
                  lineScan.hasNext();}

              else if (inGrade == "D")
	      {numGrade = numGrade + 1.0;
                  numGrade = 0.0;}
      }
      while (inCourseHours.hasNext())
      {
         totCourseHours += totCourseHours;
         lineScan.NextInt();
      }
   } // End Method
   
   // Compute Method
   public double computeGPA()
   {
      gpa = totGraPtHrs / totPossibleHrs;
      return gpa;
   }// End Method
}
