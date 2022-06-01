package groupProject01Solutions;

import java.util.Scanner;

public class Question01 {

	public static void main (String []args) {
		
		/*
		 * Problem #1: Using Scanner create an array of integer values.
		 * Calculate the sum of all stored elements in that array.
		 */
		
		Scanner obama = new Scanner(System.in);
		int [] num = new int[5];
		int sum = 0;
		
		System.out.println("Please enter 5 integers for the array");
		
		num[0] = obama.nextInt();
		num[1] = obama.nextInt();
		num[2] = obama.nextInt();
		num[3] = obama.nextInt();
		num[4] = obama.nextInt();
		
		for (int all : num) {
			
			sum += all; 
		}
			System.out.println("The sum of all integers is "+ sum);
		
	}
}
