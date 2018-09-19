/**
 * @(#)Piglatin2.java
 * @CS 110 Sample Program 
 * @9-4-08
 * @Translate the input to piglatin and display the piglatin
 * @demonstrates boolean expressions
 */

import java.util.Scanner;

public class Piglatin2 
{
 public static void main (String[] args) 
 {
  String word, result;
  
  Scanner sc = new Scanner(System.in);
  
  //Translate the input word to piglatin
  System.out.println("Please enter a word: ");
  word = sc.next();

  if (!firstLetterVowel(word))
      result = word.substring(1) + word.charAt(0) + "ay";
      else result = word;

  System.out.println();
  System.out.println("The translated word would be " + result);  
 }    

 public static boolean firstLetterVowel(String word)
 {
   String vowels = "aeiouwyAEIOUWY";
   char firstLetter = word.charAt(0);

  return (vowels.indexOf(firstLetter)>-1);
 }
}