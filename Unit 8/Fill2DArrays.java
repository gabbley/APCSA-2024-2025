public class Fill2DArrays {

   public static void main(String[] args) {
      
      // Example 1
      int[] fillArr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
      int[][] fillMat1 = new int[3][4];
      fillRowMajor(fillArr1, fillMat1);
      System.out.println("Example 1: Filled matrix (row major)");
      print(fillMat1);
      
      // Example 2
      int[] fillArr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
      int[][] fillMat2 = new int[3][4];
      fillColMajor(fillArr2, fillMat2);
      System.out.println("Example 2: Filled matrix (col major)");
      print(fillMat2);
   
   }
   
   public static void print(int[] arr) {
      for (int r = 0; r < arr.length; r++) {
            System.out.print(arr[r] + " ");
      }
      System.out.println();
   }
   
   public static void print(int[][] mat) {
      for (int r = 0; r < mat.length; r++) {
         for (int c = 0; c < mat[0].length; c++) {
            System.out.print(mat[r][c] + " ");
         }
         System.out.println();
      }
      System.out.println();
   }
   
   public static void fillRowMajor(int[] fill, int[][] mat) {
      int i = 0;
      
      for (int r = 0; r < mat.length; r++) {
         for (int c = 0; c < mat[0].length; c++) {
            mat[r][c] = fill[i++];
         }
      }
   } 
   
   public static void fillColMajor(int[] fill, int[][] mat) {
      int i = 0;
      
      for (int c = 0; c < mat[0].length; c++) {
         for (int r = 0; r < mat.length; r++) {
            mat[r][c] = fill[i++];
         }
      }
   } 

}