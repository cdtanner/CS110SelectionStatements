/**
 * @(#)Grade.java
 * @CS 110 Sample Program (Example7)
 * @9-27-08
 * @ A sample program to illustrate nested if-else statements
 * @ input a course average and convert to a letter grade
 */

import java.util.Scanner;

public class Grade 
{
 public static void main (String[] args) 
 {
  char grade;
  float ave;
  
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter the grade average: ");
  ave = sc.nextFloat();  
  System.out.println();
  
  if (ave >= 90.0)
   grade = 'A';
  else if (ave >= 80.0)
   grade = 'B';
  else if (ave >= 70.0)
   grade = 'C';
  else if (ave >= 60.0)
   grade = 'D';
  else
   grade = 'F';
   
  System.out.println("The grade is " + grade + "."); 
 }  
}