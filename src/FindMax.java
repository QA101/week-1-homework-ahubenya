package weekTwoProject;

import java.util.Scanner;

public class FindMax {

	/*
	 * Define a program that finds the maximum number when 2 numbers are given.
	 */
	public static void main(String[] args) {
		
		int x, y;
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		x = in.nextInt();
		System.out.println("Enter Second Number: ");
		y = in.nextInt();
		
		if(x > y) {
			System.out.println("The Maximum number entered is: "+ x);
		}
		else
			System.out.println("The Maximum number entered is: "+ y);

	}

}