public class Performer {
   
   private String name;
   private int age;
   
   public Performer() {
      name = "Default Performer";
      age = 18;
   }
   
   public Performer(String n, int a) {
      name = n;
      age = a;
   }
   
   public String getName() {
      return name;   
   }
   
   public void practice() {
      System.out.println("Currently practicing...");
   }
   
   public void perform() {
      System.out.println("Performing for an audience!");
   }
   
   

}