/**
 * @(#)Division.java
 * @CS 110 Sample Program (Example3)
 * @9-14-08
 * @ A sample program which will input an integer and 
 * @ determine whether it is divisible by a specified 
 * @ constant denoted in the program DIVBY
 * @demonstrates if then else stmts
 */

import java.util.Scanner;

public class Division 
{
 public static void main (String[] args) 
 {
  final int DIVBY = 7;
  int x, y;
  
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Please enter a positive integer: ");
  x = sc.nextInt();
  y = x / DIVBY;
  
  System.out.println();
  System.out.println("The integer " + x);
  if (x == y * DIVBY)
    System.out.print (" is ");
  else
   System.out.print  (" is NOT ");
  System.out.println("divisible by " + DIVBY);

  System.out.println(); 
  System.out.println();
  System.out.println("I'm done now"); 
 }    
}

