package My_Program;

import java.util.Scanner;

public class CGPA_MP  {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner Cg = new Scanner(System.in);
		int Sew1 = Cg.nextInt();
		System.out.println("ONE = "+Sew1);
		int Sew2 = Cg.nextInt();
		System.out.println("TWO = "+Sew2);
		Cgpa(Sew1,Sew2);
}

	private static void Cgpa(int Sew1, int Sew2) {
		
		int Sew = Sew1 + Sew2;
		float Sewt = Sew%2;
   	    System.out.println(Sewt);
	}
	
}
	
