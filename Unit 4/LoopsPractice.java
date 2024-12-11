/* 
Name: 
Date:
Class: AP Computer Science A

Complete the following methods below. Started in class 11/24. */
public class LoopsPractice {

   public static void main(String[] args) {
      System.out.print("Testing print1To10While(): ");
      print1To10While(); // Expect: 1 2 3 4 5 6 7 8 9 10
   
      System.out.print("\nTesting print1To10For(): ");
      print1To10For(); // Expect: 1 2 3 4 5 6 7 8 9 10
   
      System.out.print("\nTesting printStartToEndWhile(5, 15): ");
      printStartToEndWhile(5, 15); // Expect: 5 6 7 8 9 10 11 12 13 14 15
   
      System.out.print("\nTesting printStartToEndFor(3, 7): ");
      printStartToEndFor(3, 7); // Expect: 3 4 5 6 7
   
      System.out.print("\nTesting printEachLetterWhile(\"Hello\"): ");
      printEachLetterWhile("Hello"); // Expect: H e l l o (on separate lines)
   
      System.out.print("\nTesting printEachLetterFor(\"Java\"): ");
      printEachLetterFor("Java"); // Expect: J a v a (on separate lines)
   
      System.out.print("\nTesting printEachLetterReverse(\"World\"): ");
      printEachLetterReverse("World"); // Expect: d l r o W (on separate lines)
   
      System.out.println("Testing countOccurenceF(\"Effort\"): " + 
            countOccurenceF("Effort")); // Expect: 2
   
      System.out.println("Testing countOccurenceSub(\"hellohello\", \"lo\"): " + 
            countOccurenceSub("hellohello", "lo")); // Expect: 2
   
      System.out.print("Testing printOddsStartToEnd(1, 10): ");
      printOddsStartToEnd(1, 10); // Expect: 1 3 5 7 9
   
      System.out.print("\nTesting printLettersOddIndices(\"Example\"): ");
      printLettersOddIndices("Example"); // Expect: x m l (on separate lines)
   }
   
   // Print numbers 1-10 on the same line
   // Complete in class
   public static void print1To10While() {
      int i = 1;
      while (i <= 10) {
         System.out.print(i);
         i++;
      }
   }
   
   // Print numbers 1-10 on the same line
   // Complete in class
   public static void print1To10For() {
      for (int i = 1; i <= 10; i++) {
         System.out.print(i);
      }
   }
   
   // Print numbers start-end on the same line
   // Complete in class
   public static void printStartToEndWhile(int start, int end) {
      int i = start;
      while (i <= end) {
         System.out.print(i);
         i++;
      }
   }
   
   // Print numbers start-end on the same line
   // Complete in class
   public static void printStartToEndFor(int start, int end) {
      for (int i = start; i <= end; i++) {
         System.out.print(i);
      }
   }
   
   // Prints each letter of word on its own line. Uses a while loop
   // Complete in class
   public static void printEachLetterWhile(String word) {
      int i = 0;
      while (i < word.length()) {
         System.out.println(word.substring(i, i+1));
         i++;
      }
   }
   
   // Prints each letter of word on its own line. Uses a for loop
   public static void printEachLetterFor(String word) {
      for (int i = 0; i < word.length(); i++) {
         System.out.println(word.substring(i, i+1));
      }
   }
   
   // Prints each letter of word on its own line in reverse. Use any loop
   public static void printEachLetterReverse(String word) {
      // W O R D
      // D R O W
      for (int i = word.length()-1; i >= 0; i--) {
         System.out.println(word.substring(i, i+1));
      }
   }
  
   //Returns the number of Fs in word (not case sensitive)
   public static int countOccurenceF(String word) {
      int count = 0;
      for (int i = 0; i < word.length(); i++) {
         if (word.substring(i, i+1).equals("F") || word.substring(i, i+1).equals("f")) {
            count++;
         }
      }
      
      return count;
   }
   
   //Returns the number of sub in word (not case sensitive)
   public static int countOccurenceSub(String word, String sub) {
      
   }
   
   // Prints all odd numbers between start and end (inclusive)
   // Use any type of loop
   public static void printOddsStartToEnd(int start, int end) {
      
   }
   
   // Prints all letters at odd indices 
   // Use any type of loop
   public static void printLettersOddIndices(String word) {
   
   }

}
