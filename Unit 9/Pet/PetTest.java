public class PetTest {

   public static void main(String[] args) {
      Pet p1 = new Pet("Remy");
      System.out.println(p1); // calls the toString method for Pet
      
      Pet c1 = new Cat("Simba", "Dad wake up!");
      Cat c2 = new Cat("Mufasa", ":(");
      System.out.println(c1);
      System.out.println(c2);
      // p1.claw(); // does not work. Pet objects only have Pet methods
      // c1.claw(); // does not work, At compile time, c1 is just a Pet obj.
      c2.claw();
      // c2.dig() // does not work, Cat objects do not have Dog methods
      
      Pet d1 = new Dog("Stitch", "Stupidhead!");
      Dog d2 = new Dog("Scooby Doo", "Ruh Roh");
      System.out.println(d1);
      System.out.println(d2);
      // d1.dig() // does not work, why?
      d2.dig();
      
      
   }

}