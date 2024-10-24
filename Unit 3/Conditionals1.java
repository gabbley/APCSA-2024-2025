// header

public class Conditionals1 {

   private final int TODAY_MONTH = 10;
   private final int TODAY_DATE = 24;
   private final int TODAY_YEAR = 2024;

   // returns true if age is >= 18, false otherwise
   // canVote(18) -> true
   // canVote(-1) -> false
   public boolean canVote(int age) {
      // if statement goes here
      return false; // placeholder return
   }
   
   /* returns "It's your birthday today!" if the date parameters perfectly match up with the 
   class constants for month and date. else, if ONLY the month matches up, return "It's your birth month!"
   otherwise, return "It's not your birthday."
   happyBirthday(10, 24, 2007) -> "It's your birthday today!"; 
   happyBirthday(10, 5, 2000) -> "It's your birth month!"
   happyBirthday(1, 1, 2009) -> "It's not your birthday." */
   public String happyBirthday(int month, int date, int year) {
      // if-else-if statement goes here
      return ""; // placeholder return
   }
   

   /* returns "Even" if the number is even, "Odd" if the number is odd
   checkEvenOdd(4) -> "Even"
   checkEvenOdd(7) -> "Odd" */
   public String checkEvenOdd(int num) {
      // if-else statement goes here
      return ""; // placeholder return
   }
   
   /*
   Returns true if a number is divisible by both x and y, false otherwise.

   Examples:
   isDivisibleByXAndY(15, 3, 5) -> true
   isDivisibleByXAndY(10, 2, 5) -> true
   */
   public boolean isDivisibleByXAndY(int num, int x, int y) {
      // if statement goes here
      return false; // placeholder return
   }
   
   /*
   Returns the biggest value between a, b, and c.

   Examples:
   biggestNum(1, 2, 3) -> 3
   biggestNum(4, 4, 4) -> 4
   biggestNum(-3, -1, -2) -> -1
   */
   public int biggestNum(int a, int b, int c) {
      // logic goes here
      return 0; // placeholder return
   }
   
   /*
   Returns true if the String is null, false otherwise
   */
   public boolean isNull(String s) {
      return false;
   }
   
   /* 
   Returns "The String is empty" if the String has no characters.
   Returns "The String has one character" if it has exactly 1 character.
   Otherwise, returns "The String has # characters."
   
   Should check if str is null.

   Examples:
   checkStrSize("") -> "The String is empty"
   checkStrSize("A") -> "The String has one character"
   checkStrSize("Hello") -> "The String has 5 characters"
   checkStrSize("Java") -> "The String has 4 characters"
   */
   public String checkStrSize(String str) {
      // if-else-if statement goes here
      return ""; // placeholder return
   }
   
   /* Given a string, return true if the first 2 chars in the string also appear at the end of the string, 
   such as with "edited".
   
   Should check if str is null.

   frontAgain("edited") -> true
   frontAgain("edit") -> false
   frontAgain("ed") -> true
   */
   public boolean frontAgain(String str) {
   
   }

   
}
