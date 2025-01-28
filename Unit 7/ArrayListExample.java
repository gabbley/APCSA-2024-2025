import java.util.ArrayList;
public class ArrayListExample {
   public static void main(String[] args) {
    //   ArrayList<String> pets = new ArrayList<String>();
//       pets.add("dog");
//       pets.add("cat");
//       pets.add("bird");
//       System.out.println(pets); // pets -> [dog, cat, bird]
//       
//       pets.add(2, "goat");
//       System.out.println(pets);  // What is the output? _______________
//       
//       pets.add(0, "snake"); 
//       System.out.println(pets);  // What is the output? _______________
//       
//       pets.set(0, "fish"); 
//       System.out.println(pets); // What is the output? _______________
//       
//       System.out.println(pets.get(4)); // What is the output? _______________
//       
//       System.out.println(pets.contains("fish")); // What is the output? ________________
//       
//       pets.remove("fish");
//       System.out.println(pets.indexOf("fish")); // What is the output? _______________
//       
//       pets = new ArrayList<String>();
//       
//       System.out.println(pets.size()); // What is the output? _________________
//       
//       for (int i = 0; i < 4; i++) {
//          pets.add(i + "");             // this is valid code
//       }
//       
//       System.out.println(pets);        // What is the output? __________________________
//       
//       pets.add("four");
//       pets.add(0, "-1");
//       
//       System.out.println(pets);        // What is the output? __________________________
//       
//       pets.set(0, "zero");
//       pets.remove("3");
//       pets.remove(3);
//       
//       System.out.println(pets);     // What is the output? ___________________________
      
      ArrayList<Integer> nums = new ArrayList<Integer>();
      nums.add(1);
      nums.add(100);
      nums.add(0);
      System.out.println(nums);
      nums.remove(0);
      System.out.println(nums);
      Integer i = 0;
      nums.remove(i); // remove Integer parameter type
      System.out.println(nums);
      
   }
}