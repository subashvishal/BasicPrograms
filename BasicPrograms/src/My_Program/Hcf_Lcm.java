package My_Program;

import java.util.Scanner;

public class Hcf_Lcm {

	public static void main(String[] args) {
		int a,b,t = 0,hcf,lc,lcm;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number to be given HCF : ");
		int x = scan.nextInt();
		int y = scan.nextInt();
	    a = x;
	    b = y;
	    while(a!=0)
	    {
	    b = t;
	    t = a%b;
	    a = t;
	    }
	    hcf = a;
	    lc = (x*y);
	    lcm = lc/hcf;
	System.out.println("HCF is = " +hcf);
	System.out.println("LCM is = " +lcm);
}}
