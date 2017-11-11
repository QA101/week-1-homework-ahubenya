package weekTwoProject;

import java.util.Scanner;

public class PositiveNegative {

	/*
	 * define a program that finds if a number is positive or negative.
	 * 
	 * The program should print positive if the number is positive, negative if it is negative
	 */
	public static void main(String args[]){
		int x;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Positive or Negative number: ");
		x = in.nextInt();
		if (x > 0) {
			System.out.println("Number is Positive");
		}
		else
			System.out.println("Number is Negative");
		
	}
}
