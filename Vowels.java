/**
 * @(#)Vowels.java
 * @CS 110 Sample Program
 * @9-28-08
 * @The second sample program to use Switch statment
 */


public class Vowels 
{
 public static void main(String[] args) 
 {
  //Generate 20 characters at random
  //Determine whether they are Vowels and Consonants
  for(int i = 0; i < 20; i++) 
  {
   char c = (char)(Math.random() * 26 + 'a');
   System.out.print(c + ": ");
   switch(c) 
   {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
     System.out.println("vowel");
     break;
    case 'y':
    case 'w':
     System.out.println("Sometimes a vowel");
     break;
    default:
     System.out.println("consonant");
   }
  }
 }    
}