package weekTwoProject;
import java.util.Scanner;
public class BetweenProgram2 {


		/*
		 * Write a program that determine if a number x is between 2 numbers y and z
		 * if x is between y and z, print TRUE otherwise print FALSE
		 * 
		 * example:
		 * x = 150
		 * y = 100
		 * z = 200
		 * should print TRUE
		 * 
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int x,y,z;
			x = 5;
			y = 10;
			z = 50;
			if((x>y) && (x<z)) {
				System.out.println("True");			
			}
			else {
				System.out.println("False");
			}
		

		}

	}