public class Sorts {

   public static void selectionSort(int[] elements) {
      for (int j = 0; j < elements.length - 1; j++) { 
         int minIndex = j; 
         for (int k = j + 1; k < elements.length; k++) { // compares current "min" to rest of array
            if (elements[k] < elements[minIndex]) {
               minIndex = k; // updates min if smaller value found
            }
         }
         // after the inner loop, the unsorted min has been found, now needs to be swapped
         if (j != minIndex) {
            int temp = elements[j]; // saves value to be overwritten as a temp variable
            elements[j] = elements[minIndex]; // overwrites value
            elements[minIndex] = temp; // re-inserts temp
         }
      } // end of outer loop, process remaining elements
   }
   
   public static void insertionSort(int[] elements) {
      for (int j = 1; j < elements.length; j++) { // start at 1 to always compare the left element
         int temp = elements[j];
         int possibleIndex = j;
         while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) { // if the left element is greater than temp
            elements[possibleIndex] = elements[possibleIndex - 1]; // shift elements until insertion point is reached
            possibleIndex--;
         } // while loop ends when proper insertion point is found
         elements[possibleIndex] = temp; // re-inserts temp
      }
   }
   
   // prints arr
   public static void print(int[] arr) {;
      for (int i : arr) {
         System.out.print(i + " ");
      }
      System.out.println();
   }

   // tests
   public static void main(String[] args) {
      int[] arr1 = {13, 6, 2, 0, 6, 21, -1};
      selectionSort(arr1);
      print(arr1);
      
      int[] arr2 = {44, 1, 0, 1, 16, 61, 21};
      insertionSort(arr2);
      print(arr2);
   }

}

