public class NestedLoops {

   public static void main(String[] args) {
    //  example1();
    //  example2();
   
   
   
      int i = 0;
      String secretMessage = "QOmxEKRPRLyZ lCHhoRlimsAtRmYAlsH!?";
      while (i < secretMessage.length()-1) {
         if (i % 2 != 0) {
            System.out.print(secretMessage.charAt(i+1));
         }
         i++;
      }
   
   
   
   
   
   }
   
   public static void example1() {
      System.out.println("\nExample 1:");
      for (int i = 0; i <= 2; i++) {
         for (int j = 0; j <= 2; j++) {
            System.out.println("(" + i + ", " + j + ")");
         }
      }
   }
   
   public static void example2() {
      System.out.println("\nExample 2:");
      for (int i = 0; i <= 2; i++) {
         for (int j = i; j <= 2; j++) {
            System.out.println("(" + i + ", " + j + ")");
         }
      }
   }
   
   public static void group1() {
      System.out.println("Group 1:");
      for (int i = 0; i < 5; i++) {
         System.out.print(i);
         for (int j = i; j <= 5; j++) {
            System.out.print(j);
            if (j % 2 == 0)
               System.out.print("nice!");
         }
      }
   
   }
   
   public static void group2() {
      System.out.println("\nGroup 2:");
      int x = 6;
      while (x != 10) {
         for (int i = 4; i < x; i++) {
            System.out.print(i); 
         }
         x++;
         System.out.print(x);
      }
      System.out.print(x);
   }
   
   public static void group3() {
      System.out.println("\nGroup 3:");
      for (int i = 5; i >= 0; i--) {
         System.out.print(i);
         for (int j = 0; j <= i; j++) {
            if (j < i)
               System.out.print("nice!");
            System.out.print(j);
         }
      }
   }
   
   public static void group4() {
      System.out.println("\nGroup 4:");
      for (int i = 3; i >= 0; i--) {
         System.out.print(i);
         for (int j = 3; j >= i; j--) {
            System.out.print(j);
            if (i == j)
               System.out.print("nice!");
         }
      }
      System.out.print("nice!");
   }

}