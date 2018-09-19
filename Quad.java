/**
 * @(#)Quad.java
 * @CS 110 Sample Program
 * @9-14-08
 * @ A sample program to determine the solution of a
 * @ a quadratic equation A * (X * X) + B * X + C = 0
 */

import java.util.Scanner;

public class Quad 
{
 public static void main (String[] args) 
 {
  double a, b, c, discr;
  
  Scanner sc = new Scanner(System.in);
  
  //input the three decimal coefficients
  System.out.println
   ("This program solves the quadratic");
  System.out.println
   ("equation A*(X*X)+B*X+C=0 ");
  System.out.println();
  System.out.println();
  System.out.println
   ("Enter the decimal coefficient A:");
  a = sc.nextDouble();
  System.out.println
   ("Enter the decimal coefficient B:");
  b = sc.nextDouble();
  System.out.println
   ("Enter the decimal coefficient C:");
  c = sc.nextDouble();
  
  //calculate the discriminant
  discr = b * b - 4.0 * a * c;
  
  //calculate the roots
  if (a == 0.0 & b == 0.0)
   System.out.println
    ("Both A and B can not be zero!");
  else if (a == 0.0)
   System.out.println
    ("The single root is " + c/b);
  else if (discr == 0.0)
   System.out.println
    ("The double root is " + (-b/(2.0 * a)));
  else if (discr > 0.0)
  {
   System.out.println
    ("The distinct real roots are:");
   System.out.print
    (-b + Math.sqrt(discr)/(2.0 * a));
   System.out.print
    (" and ");
   System.out.print
    (-b - Math.sqrt(discr)/(2.0 * a));
   System.out.println();
  }
  else
  {
   System.out.println
    ("The complex roots are:");
   System.out.print
    (-b /(2.0 * a)+" + "+Math.sqrt(Math.abs(discr))/(2.0 * a)
       + "i and ");
   System.out.print
    (-b /(2.0 * a)+" - "+Math.sqrt(Math.abs(discr))/(2.0 * a)
       + "i.");
  }
  System.out.println();
  System.out.println();  
  System.out.println("Successful completion!");
 }       
}