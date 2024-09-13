public class SameName {

    public static void main(String[] args) {

        // Jessica and Jessie are not identical Strings, expected output false
        String student1 = "Jessica";
        String student2 = "Jessie";

        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);

        System.out.println("The students have the SAME name: " + (student1.equals(student2)));
        System.out.println("The students have the SAME name: " + (student2.equals(student1)));

        // Reese and Reese are identical Strings, expected output true
        String student3 = "Reese";
        String student4 = "Reese";

        System.out.println("Student 3: " + student3);
        System.out.println("Student 4: " + student4);

        System.out.println("The students have the SAME name: " + (student3.equals(student4)));

        student4 += " "; // appends a space to student4 using a compound assignment operator for concatenation

        System.out.println("The students have the SAME name: " + (student3.equals(student4))); // true or false?

        student3 += " "; // appends a space to student3 using a compound assignment operator for concatenation

        System.out.println("The students have the SAME name: " + (student3.equals(student4))); // true or false?
    }

}
