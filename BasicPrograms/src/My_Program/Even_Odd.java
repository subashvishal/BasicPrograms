package My_Program;

import java.util.Scanner;

public class Even_Odd  {
	 public static void main(String args[])
	 {
/*1	   
		 int i;
		 for(i=0;i<=100;i++)
		 {
			 System.out.println(i);
		 }*/

/*2
		  int n=1, i, j;
	        for(i=0; i<10; i++)
	        {
	           for(j=0; j<i; j++)
	            {
	                System.out.print("  "+n);
	                n++;
	            }
	            System.out.println();
	        }}*/



 //3  Even or Odd
             
		        int Even=0;
		        Scanner scan = new Scanner(System.in);
		        System.out.print("Enter a Number : ");
		        Even = scan.nextInt();
                if(Even % 2 == 0)
                {
                	System.out.println("It is Even number");
                }else
                 {
                	System.out.println("It is Odd number");
                 }
                }
}


