public class Sorts {

   public static void selectionSort(int[] elements) {
      for (int j = 0; j < elements.length - 1; j++) {
         int minIndex = j;
         for (int k = j + 1; k < elements.length; k++) {
            if (elements[k] < elements[minIndex]) {
               minIndex = k;
            }
         }
         if (j != minIndex) {
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
         }
      }
   }
   
   public static void insertionSort(int[] elements) {
      for (int j = 1; j < elements.length; j++) {
         int temp = elements[j];
         int possibleIndex = j;
         while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) {
            elements[possibleIndex] = elements[possibleIndex - 1];
            possibleIndex--;
         }
         elements[possibleIndex] = temp;
      }
   }
   
   public static void print(int[] arr) {;
      for (int i : arr) {
         System.out.print(i + " ");
      }
      System.out.println();
   }

   public static void main(String[] args) {
      int[] arr1 = {13, 6, 2, 0, 6, 21, -1};
      selectionSort(arr1);
      print(arr1);
      
      int[] arr2 = {44, 1, 0, 1, 16, 61, 21};
      insertionSort(arr2);
      print(arr2);
   }

}

