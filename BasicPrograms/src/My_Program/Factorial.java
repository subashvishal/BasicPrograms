package My_Program;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num,i,fact=1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of factorial : ");
		num = scan.nextInt();
		for(i=num;i>0;i--) 
		{
			fact = fact*i;
		}
		System.out.println("The factorial of " +num + " is " +fact);
	}

}
