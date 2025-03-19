public class Cat extends Pet {

   private String sound;
   
   public Cat(String n, String s) {
      super(n);
      sound = s;
   }
   
   @Override
   public String speak() {
      return sound + " purrrr";
   }
   
   public void claw() {
      System.out.println("clawing");
   }

}