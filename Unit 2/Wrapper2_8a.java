public class Wrapper2_8a {

   public static void main(String[] args) {
      Integer num1 = new Integer(10);
      System.out.println(num1);
      
      System.out.println(Integer.MIN_VALUE); // min value of an int
      System.out.println(Integer.MAX_VALUE); // max value of an int
      System.out.println(Integer.MAX_VALUE + 1); // flips and wraps around to avoid overflow
      
      int num1int = num1.intValue();
      System.out.println(num1int);
      
      num1++;
      num1int++;
      
      System.out.println(num1);
      System.out.println(num1int);
      
      System.out.println(num1 + num1int);
      
      Integer num2 = num1int; // autoboxing
      int num2int = num2; // unboxing
      
      System.out.println(num2);
      System.out.println(num2int);
   }

}