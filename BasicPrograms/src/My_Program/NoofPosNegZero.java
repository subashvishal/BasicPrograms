package My_Program;

import java.util.Scanner;

public class NoofPosNegZero {

	public static void main(String[] args) {
		int counta=0 ,countb=0, countc=0, i;
		int arr[] = new int[10];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the numbers : ");
		
		for(i=0;i<10;i++)
		{
			arr[i] = scan.nextInt();
		}
		for(i=0;i<10;i++)
		{
			if(arr[i] < 0)
			{
				countb++;
			}
		 if(arr[i] == 0)
		{
			countc++;
		}else 
		{
			counta++;
		}
	 }
	 System.out.print("Positive " + counta +"\n");
	 System.out.print("Negative " +countb +"\n");
	 System.out.print("Zero " +countc +"\n");
	 }

	}
