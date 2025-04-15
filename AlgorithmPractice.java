import java.util.ArrayList;

public class AlgorithmPractice {

   /**
    * Prints each digit of the number on its own line, starting from the leftmost digit.
    * Do not convert the number to a string. Assume the number is positive.
    * Example: printDigits(123) should print: 1 2 3
    */
   public static void printDigits(int number) {
      // TODO: Implement
   }

   /**
    * Returns the number of substrings that start and end with a vowel (a, e, i, o, u)
    * and are at least 2 characters long. Case-insensitive.
    * Example: countVowelSubstrings("aeiou") returns 10
    */
   public static int countVowelSubstrings(String word) {
      return 0;
   }

   /**
    * Returns a new string with the characters in reverse order.
    * Example: reverseString("hello") returns "olleh"
    */
   public static String reverseString(String input) {
      return "";
   }

   /**
    * Returns true if the string contains any substring of length 3 or more
    * that is a palindrome.
    * Example: hasPalindromeSubstring("abcba") returns true
    */
   public static boolean hasPalindromeSubstring(String word) {
      return false;
   }

   /**
    * Returns the largest integer in the array.
    * Example: findMax(new int[]{1, 5, 3}) returns 5
    */
   public static int findMax(int[] nums) {
      return 0;
   }

   /**
    * Returns true if a is evenly divisible by b. Assume b is not 0.
    * Example: isDivisible(10, 2) returns true
    */
   public static boolean isDivisible(int a, int b) {
      return false;
   }

   /**
    * Returns the number of odd integers in the array.
    * Example: countOdds(new int[]{1, 2, 3}) returns 2
    */
   public static int countOdds(int[] nums) {
      return 0;
   }

   /**
    * Returns the sum of all elements in the array.
    * Example: sumArray(new int[]{1, 2, 3}) returns 6
    */
   public static int sumArray(int[] nums) {
      return 0;
   }

   /**
    * Returns the average value of the elements in the array as a double.
    * Example: average(new int[]{2, 4, 6}) returns 4.0
    */
   public static double average(int[] nums) {
      return 0.0;
   }

   /**
    * Returns the most frequent number in the array.
    * If there is a tie, return any of the most frequent values.
    * Example: mode(new int[]{1, 2, 2, 3, 3, 3}) returns 3
    */
   public static int mode(int[] nums) {
      return 0;
   }

   /**
    * Returns the number of substrings that start and end with a 'T'
    * and are at least 2 characters long.
    * Example: countStartEndT("TATT") returns 2
    */
   public static int countStartEndT(String word) {
      return 0;
   }

   /**
    * Returns true if every element in the array is greater than 0.
    * Example: allPositive(new int[]{1, 2, 3}) returns true
    */
   public static boolean allPositive(int[] nums) {
      return false;
   }

   /**
    * Prints each pair of consecutive elements in the array.
    * Example: printAdjacentPairs(new int[]{1, 2, 3}) prints: (1,2) (2,3)
    */
   public static void printAdjacentPairs(int[] nums) {
      // TODO: Implement
   }

   /**
    * Returns true if any value appears more than once in the array.
    * Example: hasDuplicates(new int[]{1, 2, 2}) returns true
    */
   public static boolean hasDuplicates(int[] nums) {
      return false;
   }

   /**
    * Shifts all elements to the right by one position.
    * The last element should wrap around to the first index.
    * Example: rotateRight({1,2,3}) becomes {3,1,2}
    */
   public static void rotateRight(int[] nums) {
      // TODO: Implement
   }

   /**
    * Reverses the array in-place.
    * Example: reverseArray({1, 2, 3}) becomes {3, 2, 1}
    */
   public static void reverseArray(int[] nums) {
      // TODO: Implement
   }

   /**
    * Returns true if every word in the list starts with the letter "a".
    * Example: allStartsWithA(["apple", "ant"]) returns true
    */
   public static boolean allStartsWithA(ArrayList<String> words) {
      return false;
   }

   /**
    * Prints each pair of consecutive elements in the list.
    * Example: printAdjacentPairs([10, 20, 30]) prints: (10,20) (20,30)
    */
   public static void printAdjacentPairs(ArrayList<Integer> nums) {
      // TODO: Implement
   }

   /**
    * Returns true if any word appears more than once in the list.
    * Example: hasDuplicates(["cat", "dog", "cat"]) returns true
    */
   public static boolean hasDuplicates(ArrayList<String> words) {
      return false;
   }

   /**
    * Shifts all elements to the left by one position.
    * The first element should move to the end.
    * Example: rotateLeft(["a", "b", "c"]) becomes ["b", "c", "a"]
    */
   public static void rotateLeft(ArrayList<String> words) {
      // TODO: Implement
   }

   /**
    * Reverses the order of the elements in the list in-place.
    * Example: reverseList([1, 2, 3]) becomes [3, 2, 1]
    */
   public static void reverseList(ArrayList<Integer> nums) {
      // TODO: Implement
   }

   // Test runner
   public static void main(String[] args) {
      System.out.println("--- Test Outputs ---");
      printDigits(12345);
      System.out.println(countVowelSubstrings("aeiouAEIOU"));
      System.out.println(reverseString("hello"));
      System.out.println(hasPalindromeSubstring("racecar"));
      System.out.println(findMax(new int[]{1, 5, 2, 9}));
      System.out.println(isDivisible(10, 2));
      System.out.println(countOdds(new int[]{1, 2, 3, 4}));
      System.out.println(sumArray(new int[]{1, 2, 3, 4}));
      System.out.println(average(new int[]{1, 2, 3, 4}));
      System.out.println(mode(new int[]{1, 2, 2, 3, 3, 3}));
      System.out.println(countStartEndT("TESTTTT"));
      System.out.println(allPositive(new int[]{1, 2, 3}));
      printAdjacentPairs(new int[]{1, 2, 3, 4});
      System.out.println(hasDuplicates(new int[]{1, 2, 2, 3}));
      int[] nums = {1, 2, 3, 4};
      rotateRight(nums);
      reverseArray(nums);
      ArrayList<String> words = new ArrayList<String>();
      words.add("ant");
      words.add("aardvark");
      words.add("anglerfish");
      System.out.println(allStartsWithA(words));
      ArrayList<Integer> numsList = new ArrayList<Integer>();
      numsList.add(10);
      numsList.add(20);
      numsList.add(30);
      printAdjacentPairs(numsList);
      ArrayList<String> dupWords = new ArrayList<String>();
      dupWords.add("cat");
      dupWords.add("dog");
      dupWords.add("cat");
      System.out.println(hasDuplicates(dupWords));
      rotateLeft(words);
      reverseList(numsList);
   }
}
