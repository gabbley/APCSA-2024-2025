public class Lab1Starter {

   public static void main(String[] args) {
   // Test firstAndLast method
      System.out.println("firstAndLast(\"Hello!\") = " + firstAndLast("Hello!")); // Expected output: "H!"
      System.out.println("firstAndLast(\"Hey\") = " + firstAndLast("Hey")); // Expected output: "Hy"
      System.out.println("firstAndLast(\"Apple\") = " + firstAndLast("Apple")); // Expected output: "Ae"
      
      // Test pigLatin method
      System.out.println("pigLatin(\"pig\") = " + pigLatin("pig")); // Expected output: "igpay"
      System.out.println("pigLatin(\"latin\") = " + pigLatin("latin")); // Expected output: "atinlay"
      System.out.println("pigLatin(\"smile\") = " + pigLatin("smile")); // Expected output: "milesay"
      
      // Test swapAB method
      System.out.println("swapAB(\"oops\", 1, 3) = " + swapAB("oops", 1, 3)); // Expected output: "ospo"
      System.out.println("swapAB(\"hello\", 0, 4) = " + swapAB("hello", 0, 4)); // Expected output: "oellh"
      System.out.println("swapAB(\"java\", 1, 2) = " + swapAB("java", 1, 2)); // Expected output: "jvaa"
      
      // Test scramble method (this will depend on the implementation of scramble). Just make sure you don't get a bounds error.
      System.out.println("scramble(\"scramble\") = " + scramble("scramble")); // Randomized output, example: "cmabrasl"
      
      // Test timesPi method
      System.out.println("timesPi(2.0) = " + timesPi(2.0)); // Expected output: 2 * Math.PI
      System.out.println("timesPi(0.5) = " + timesPi(0.5)); // Expected output: 0.5 * Math.PI
      
      // Test timesSqrt method
      System.out.println("timesSqrt(9.0) = " + timesSqrt(9.0)); // Expected output: 9 * sqrt(9.0)
      System.out.println("timesSqrt(16.0) = " + timesSqrt(16.0)); // Expected output: 16 * sqrt(16.0)
   }
   
   /* Return the first and last characters of parameter word
    * Example: firstAndLast("Hi there!") returns "H!"
   */
   public static String firstAndLast(String word) {
      return "";
   }
   
   /* Return the result of transforming a word into Pig Latin where 
    * the first letter is put at the end and “ay” is added.
    * Example: pigLatin("pig") returns "igpay"
   */
   public static String pigLatin(String word) {
      return "";
   }
   
   /* Return a modified String where the character at index a
    * is swapped with the character at index b.
    * Example: swapAB("oops", 1, 3) returns "ospo"
   */
   public static String swapAB(String word, int a, int b) {
      String str = word.substring(0, a) + word.substring(b, b+1) + word.substring(a+1, b) + word.substring(a, a+1) + word.substring(b+1);
      return str;
   }
   
   /* Call the swap method 3 times with 6 randomly generated
    * numbers. You must make sure the numbers do not cause
    * an IndexOutOfBounds error. Part of the method is provided.
   */
   public static String scramble(String word) {
      int rand1 = 0, rand2 = 0, rand3 = 0, rand4 = 0, rand5 = 0, rand6 = 0;
      String updatedStr = word;
      
      // initialize all of the random number variables using Math.random()
      rand1 = (int) (Math.random() * updatedStr.length()-1);
      rand2 = (int) (Math.random() * updatedStr.length()-1);
      rand3 = (int) (Math.random() * updatedStr.length()-1);
      rand4 = (int) (Math.random() * updatedStr.length()-1);
      rand5 = (int) (Math.random() * updatedStr.length()-1);
      rand6 = (int) (Math.random() * updatedStr.length()-1);
      System.out.println(rand1);
      System.out.println(rand2);
      updatedStr = swapAB(updatedStr, rand1, rand2);
      System.out.println(updatedStr);
      updatedStr = swapAB(word, rand3, rand4);
      updatedStr = swapAB(word, rand5, rand6);
      
      return updatedStr;
   }
   
   /*Return the parameter value times the pi constant from the Math class*/
   public static double timesPi(double dbl) {
      return 0;
   }
   
   /*Return the parameter value times its square root, using the Math class*/
   public static double timesSqrt(double dbl) {
      return 0;
   }

}