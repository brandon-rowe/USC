   //********************************************************************
   //  ComputeGrade.java       Author: B. Rowe
   //
   //  Demonstrates the use of the Scanner to read numeric data.
   //  Uses expressions to evaluate mathematic equations.  
   //  Takes user Input and produces Output. 
   //********************************************************************

   import java.util.Scanner;

   public class ComputeGrade
   {
      //-----------------------------------------------------------------
      //  Calculates weighted grade. 
      //-----------------------------------------------------------------
      
      public static void main(String[] args)
      {
         double assignments, labsQuiz, exam1,  exam2, finalExam;
         double assignWG, labsQuizWG, exam1WG, exam2WG,finalExamWG, finalGrade;
         
         final double assignWeight = .35;
         final double labsQuizWeight = .15;
         final double exam1Weight = .15;
         final double exam2Weight = .15;
         final double finalExamWeight = .20; 
         

         Scanner scan = new Scanner(System.in);
   
         System.out.print("Enter a value for your out-of-class grade (assignments): ");
         assignments = scan.nextDouble();

         System.out.print("Enter a value for your in-class grade (labs, quizzes, etc.): ");
         labsQuiz = scan.nextDouble();

         System.out.print("Enter a value for your Exam 1 grade: ");
         exam1 = scan.nextDouble();
        
         System.out.print("Enter a value for your Exam 2 grade: ");
         exam2 = scan.nextDouble();
         
         System.out.print("Enter a value for your Final Exam grade: ");
         finalExam = scan.nextDouble();
         
         assignWG = assignments * assignWeight;
         labsQuizWG = labsQuiz * labsQuizWeight;
         exam1WG = exam1 * exam1Weight;
         exam2WG = exam2 * exam2Weight;
         finalExamWG = finalExam * finalExamWeight;
         
         finalGrade = assignWG + labsQuizWG + exam1WG + exam2WG + finalExamWG;
         
         if (finalGrade >= 90)
          {
             System.out.println("You have a " + finalGrade + " in the class!");
             System.out.println("Congratulations on getting an A! You're a Star!");
          }
          
         if (finalGrade >= 80 && finalGrade < 90)
          {
             System.out.println("You have a " + finalGrade + " in the class!");
             System.out.println("Congratulations on getting an B! Excellent Work!");
          }
          
         if (finalGrade >= 70 && finalGrade < 80)
          {
             System.out.println("You have a " + finalGrade + " in the class.");
             System.out.println("Congratulations, you passed! Your letter grade is C.");
          }
          
         if (finalGrade >= 60 && finalGrade < 70)
          {
             System.out.println("You have a " + finalGrade + " in the class.");
             System.out.println("You passed with a D. I would recommend retaking the course.");
          }
          
         else if (finalGrade < 60)
            {
          
             System.out.println("You have a " + finalGrade + " in the class."); 
             System.out.println("You failed my friend. Try, try, again! Your letter grade is F.");
             
            };

         
         System.out.println("\n \t End of program!!!");
      }
   }
