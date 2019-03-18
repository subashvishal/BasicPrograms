package My_Program;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int yr;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Year : ");
		yr = scan.nextInt();
		if((yr%4 ==0) && (yr%100 != 0))
		{
			System.out.println("Leap Year");
		}else if((yr%100 == 0) && (yr%400 ==0))
		{
			System.out.println("Leap Year");
		}else if (yr%400 == 0)
		{
			System.out.println("Leap Year");
		}else
		{
			System.out.println("Not Leap Year");
		}
	 }

	}
