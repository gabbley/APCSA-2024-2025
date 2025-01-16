import java.util.Scanner;

public class DynamicStringArray {
    // fields, entire class has access
    private String[] array;
    private int size;

    // Constructor to initialize the array with a starting capacity
    public DynamicStringArray(int capacity) {
        array = new String[capacity];
        size = 0; // refers to num of elements in array
    }

    // Method to add a new String value
    public void add(String value) {
        // If array is full, call resize()
        // TODO
        array[size] = value;
        size++;
    }

    // Method to double the array size when full
    private void resize() {
      // TODO
    }

    // Method to print all elements
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DynamicStringArray dynamicArray = new DynamicStringArray(5); // Initial size of 5

        System.out.println("Enter names (type 'q' to quit):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            dynamicArray.add(input);
        }

        scanner.close();

        System.out.println("Stored strings:");
        dynamicArray.print();
    }
}
