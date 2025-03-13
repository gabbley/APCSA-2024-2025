public class Performer {
   
   private String name, hometown, agent;
   private int age;
   
   public Performer() {
      name = "";
      hometown = "";
      agent = "";
      age = 0;
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