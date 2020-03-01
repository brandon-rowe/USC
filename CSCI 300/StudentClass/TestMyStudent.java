//********************************************************************
//  TestMyStudent.java     Author: B. Rowe
//  This program will test the MyStudent class.
//********************************************************************
import java.util.Scanner;
import java.io.*;

public class TestMyStudent
{
    public static void main(String[] args) throws IOException
    {
         // Instantiate MyStudent class & create variables
         MyStudent student = new MyStudent("111111111","Alice","Jones");
         Scanner fileScan, lineScan;
         String inputLine;
         // Initialize scanner and select read-in file. 
         fileScan = new Scanner(new File("myInput.txt"));

         // Read and process each line of the file
         while (fileScan.hasNext())
         {
            inputLine = fileScan.nextLine();
            lineScan = new Scanner(inputLine);
            lineScan.useDelimiter("\t");

            //  Print each line
            String grade;
            int hours;
            while (lineScan.hasNext())
            {
               grade = lineScan.next(); // Read the letter grade
               hours = lineScan.nextInt(); // Read the number of hours
               student.loadGradeInfo(grade, hours);
            }// while
         }
         student.computeGPA();
         System.out.println(student);
         System.out.println("\n \t End of program!!!!");
   }
}
