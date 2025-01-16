import java.util.ArrayList;
import java.util.Scanner;

public class DynamicStringArrayList {
    // fields, entire class has access
    private ArrayList<String> list;
    private int size;

    // Constructor to initialize the array with a starting capacity
    public DynamicStringArrayList(int capacity) {
        list = new ArrayList<String>();
        size = 0;  // refers to num of elements in ArrayList
    }

    // Method to print all elements
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DynamicStringArrayList dynamicArray = new DynamicStringArrayList(5); // Initial size of 5

        System.out.println("Enter names (type 'q' to quit):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            dynamicArray.add(input); // causes an error
        }

        scanner.close();

        System.out.println("Stored strings:");
        dynamicArray.print();
    }
}
