package ColinVoktch3examples;

/*
 * Colin Vokt
 * 9/18
 * This code is in order of what it is on Ch.3
 * In order
 * Celsius to Fahrenheit
 * Area and Volume
 * feet to meters
 * pounds to kilograms
 */


import static java.lang.System.out;

import java.util.Scanner;

public class Ch3HW {
	
	public static void main(String[] args) {
Scanner  input = new Scanner(System.in);
		
		float f;
		float c;
		
		
		out.println("What is the Celsius");
		c = input.nextInt();
		f = (float) ((9.0/5)*c + 32);
		out.println("the Fahrenheit is " + f);
		
		
		out.println("------------------------------------------------------");
		
		final double PI = 3.141;
		double area;
		double radius;
		double length;
		double volume;
		
		
		out.println("Enter the radius and then enter the length");
		 radius = input.nextDouble();
		 length = input.nextDouble();
		 
		 
		 area = radius*radius*PI;
		 volume = area*length;
		 
		 out.println("The Area is " + area);
		 out.println("The Volume is " + volume);
		 
		 
		 out.println("------------------------------------------------------");
		 
		 double feet;
		 double meter; 
		 
		 out.print("Enter a value for feet ");
		 feet = input.nextDouble();
		
		 meter = feet/3.2808;
		 
		 out.println("Meters " + meter);
		
		
		 out.println("------------------------------------------------------");
		
		double P;
		double KG;
		
		out.println("Enter the value for pounds");
		P = input.nextDouble();
		
		KG = P*.45359237;
		
		out.println("Kilometers " + KG);
		
		
		out.println("------------------------------------------------------");
		
		double a;
		double v1;
		double v0;
		double t;
		
		out.println("Enter the starting velocity first"
				+ " and then the final velocity"
				+ " and then the time in seconds");
		v0 = input.nextDouble();
		v1 = input.nextDouble();
		t = input.nextDouble();
		
		a = (v1-v0) / t;
		
		out.println("Heres the acceleration " + a);
	
		
		
		

	}

}
