package My_Program;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) { 
	int num,rem,rev = 0,orig;
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter number of sequence : ");
	 num = scan.nextInt();
	 orig = num;
	 while(num > 0)
	 {
		 rem = num % 10;
		 rev = rev*10 + rem;
		 num = num / 10;
	 }
	 if(orig == rev)
	 {
		System.out.println("Original");
	 }else
	 {
		 System.out.println("Not Original");
	 }
}}
