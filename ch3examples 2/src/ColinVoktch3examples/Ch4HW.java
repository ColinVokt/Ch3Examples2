package ColinVoktch3examples;

/*
 * Colin Vokt
 * 10/18
 * homework
 * #1 is Find Future dates
 * #2 Sort three integers
 * #3 Palindrome number
 */

import java.util.Scanner;
public class Ch4HW {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		//PROJECT #1
		int future;
		System.out.println("What is todays date."
				+ " Please enter a # assigned to that day"
				+ " Sunday = 0,"
				+ " Monday = 1,"
				+ " Tuesday = 2"
				+ " etc,"
				+ " tell Saturday 6");
			int day = input.nextInt();
		System.out.println("How many days tell your future date");
			int dayspast = input.nextInt();
			
			future = (day + dayspast);
			
			
			switch (future % 7) {
			case 0:
				System.out.print("The future day is Sunday");
				break;
			case 1:
				System.out.print("The future day is a Monday");
				break;
			case 2:
				System.out.println("The future day is a Tuesday");
				break;
			case 3:
				System.out.println("The future day is a Wensday");
				break;
			case 4:
				System.out.println("The future day is a Thursday");
				break;
			case 5:
				System.out.println("The future day is a Friday");
				break;
			case 6:
				System.out.println("The future day is a Saturday");
				break;
			}
			System.out.println("------------------------------------------");
			
			//PROJECT #2
			int p1;
			int p2;
			int p3 = 0;
			System.out.println("Please enter 3 integers");
			int int1 = input.nextInt();
			int int2 = input.nextInt();
			int int3 = input.nextInt();
			// Make Positions
			if (int1 > int2) {
				int temp = int1;
				int1 = int2;
				int2 = temp;
			}
			if (int2 > int3) {
				int temp = int2;
				int2 = int3;
				int3 = temp;
			}
			if (int1 > int2) {
				int temp = int1;
				int1 = int2;
				int2 = temp;
			}
			
			System.out.println("The numbers are sorted in this order "
			+ int1 + " " + int2 + " " + int3);
			
			
			System.out.println("--------------------------------------------"); 
			//PROJECT #3
			
			System.out.println("Enter a 3 digit integer");
			int PN = input.nextInt();
			int P4 = PN /100;
			int P5 = PN % 100;
			P5 = P5 /10;
			int P6 = PN / 10;
			P6 = P6 / 10;
			if (P4 == P6) {
				System.out.print(PN + " Is a Palindrome");
			}
			else {
				System.out.print(PN + " Is not a Palindrome");
			}	
			System.out.println("--------------------------------------------"); 
			//Project #4
			int random = (int )(Math.random() * 1 + 0);
			int tails = 0;
			int heads = 1;
			System.out.println("Please enter Heads(1) or Tails(0)");
			int user = input.nextInt();
			if (random == 0) {
				System.out.println("The flip was tails");
			}
			else {
				System.out.println("The flip was heads");
			}
			if (user == 0) {
				System.out.println("You picked tails");
			}
			else {
				System.out.println("You picked heads");
			}
			if (user == random) {
				System.out.println("You guessed right");
			}
			else {
				System.out.println("You suck!");
			}
			
	}

}
