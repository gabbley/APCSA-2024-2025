public class Pet {
   private String name;
   
   public Pet(String n) {
      name = n;
   }
   
   public String getName() {
      return name;
   }
   
   public String speak() {
      return "...";
   }
   
   @Override
   public String toString() {
      return "My name is " + getName() + " and I say " + speak() + "!";
   }

}