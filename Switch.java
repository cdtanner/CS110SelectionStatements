/**
 * @(#)Switch.java
 * @CS 110 Sample Program
 * @9-28-08
 * @A sample program to use Switch statment
 */

import java.util.Scanner;

public class Switch 
{	
	static Scanner sc = new Scanner(System.in);
	static int i;
	
	public static void main (String[] args) 
	{
		//Enter 3 numbers and compare their value
		double a,b,c; 
		
		a = getNumber("1st");
		b = getNumber("2nd");
		c = getNumber("3rd");
		i = flag(a, b, c);
		
		System.out.println();
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println();
		
		switch(i) 
		{ 
			case 0: 
				System.out.println("a>=b>=c");
				break; 
			case 1:	
				System.out.println("a>=c>=b");
				break; 
			case 2:
				System.out.println("b>=a>=c");
				break; 
			case 3:	
				System.out.println("b>=c>=a");
				break; 
			case 4:	
				System.out.println("c>=a>=b");
				break; 
			case 5:	
				System.out.println("c>=b>=a");
				break; 
			default: System.out.println("error"); 
		} 
	}	
				
	public static double getNumber(String serialNo)
	{
		double value;
		System.out.println("Please enter the " + serialNo + " number");
		value = sc.nextDouble();
		
		return value;
	}	
		
	public static int flag(double a, double b, double c)
	{
		if(a>=b && b>=c) 
			i=0; 
		if(a>=c && c>=b) 
			i=1; 
		if(b>=a && a>=c) 
			i=2; 
		if(b>=c && c>=a) 
			i=3; 
		if(c>=a && a>=b) 
			i=4; 
		if(c>=b && b>=a) 
			i=5; 
		return i; 
	}
}	