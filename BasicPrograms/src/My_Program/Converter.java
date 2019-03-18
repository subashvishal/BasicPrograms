package My_Program;

import java.util.Scanner;

public class Converter 
{
	     public static void main(String[] args) 
	     {
		   @SuppressWarnings("resource")
		   Scanner scan = new Scanner(System.in);
		   System.out.println("CGPA TO PERCENTAGE : ");
		   System.out.println("Enter Sem1 marks");
		   double Seme1 = scan.nextDouble();
		   System.out.println("Enter Sem2 marks");
		   double Seme2 = scan.nextDouble();
		   System.out.println("Enter Sem3 marks");
		   double Seme3 = scan.nextDouble();
		   System.out.println("Enter Sem4 marks");
		   double Seme4 = scan.nextDouble();
		   System.out.println("Enter Sem5 marks");
		   double Seme5 = scan.nextDouble();
		   System.out.println("Enter Sem6 marks");
		   double Seme6 = scan.nextDouble();
		   System.out.println("Enter Sem7 marks");
		   double Seme7 = scan.nextDouble();
		   System.out.println("Enter Sem8 marks");
		   double Seme8 = scan.nextDouble();
		   double sum = Seme1 + Seme2 + Seme3 + Seme4 + Seme5 + Seme6 + Seme7 + Seme8;
		   double avg = sum/8;
           System.out.println("The cgpa is : " +avg);
           System.out.println("---------------------------------"); 
           System.out.println("Cgpa to Percentage");
           System.out.println("Converting...");
           double P = 9.5;
           double percent = avg * P;
           System.out.println(percent);
	}
}

