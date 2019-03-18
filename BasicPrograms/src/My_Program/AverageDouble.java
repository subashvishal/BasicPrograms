package My_Program;

import java.util.Scanner;

public class AverageDouble {

	public static void main(String[] args) {
		System.out.println("Enter Number of elements to be added : ");
           Scanner scanner = new Scanner(System.in);
           int n = scanner.nextInt();
           
           double arr[] = new double[n];
           double total = 0;
           
           for(int i=0;i<arr.length;i++) {
        	   System.out.println("Enter Element no."+(i+1)+ " is : ");
        	   arr[i] = scanner.nextDouble();
           }
           scanner.close();
        	for(int i=0;i<arr.length;i++) {
        		
        	    total = total + arr[i];
           }
           double average = total/arr.length;
           
		            System.out.format("Average is : %.3f ",average);
		            
}}