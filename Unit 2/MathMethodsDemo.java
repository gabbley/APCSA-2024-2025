public class MathMethodsDemo {

   public static void main(String[] args) {
      // Testing Math.abs()
      System.out.println("Math.abs(-5) = " + Math.abs(-5)); // Expected output: 5
      System.out.println("Math.abs(3.7) = " + Math.abs(3.7)); // Expected output: 3.7
      
      // Testing Math.pow()
      System.out.println("Math.pow(2, 3) = " + Math.pow(2, 3)); // Expected output: 8.0 (2^3)
      System.out.println("Math.pow(5, 2) = " + Math.pow(5, 2)); // Expected output: 25.0 (5^2)
      
      // Testing Math.sqrt()
      System.out.println("Math.sqrt(16) = " + Math.sqrt(16)); // Expected output: 4.0
      System.out.println("Math.sqrt(20) = " + Math.sqrt(20)); // Expected output: 4.47213595499958
      
      // Testing Math.random()
      double randomValue = Math.random(); // Random value between 0.0 (inclusive) and 1.0 (exclusive)
      System.out.println("Math.random() = " + randomValue); // Example output: 0.75423456
      
      // Generating a random integer between 1 and 10
      int randomInt = (int) (Math.random() * 10) + 1;
      System.out.println("Random integer between 1 and 10: " + randomInt);
      
      // Testing Math.max() and Math.min()
      System.out.println("Math.max(10, 15) = " + Math.max(10, 15)); // Expected output: 15
      System.out.println("Math.min(10, 15) = " + Math.min(10, 15)); // Expected output: 10
      
      // Testing Math.round()
      System.out.println("Math.round(5.7) = " + Math.round(5.7)); // Expected output: 6
      System.out.println("Math.round(5.2) = " + Math.round(5.2)); // Expected output: 5
      
   }
}
