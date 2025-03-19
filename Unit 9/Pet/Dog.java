public class Dog extends Pet {

   private String sound;
   
   public Dog(String n, String s) {
      super(n);
      sound = s;
   }
   
   @Override
   public String speak() {
      return sound + " aroooo";
   }
   
   public void dig() {
      System.out.println("digging");
   }

}