// Source: https://www.apcomputersciencetutoring.com/files/2d-array-practice/TwoDArrayPractice.java

public class TwoDArrayPractice
{
    /**
     * Swaps all values in the specified 2 rows of mat.
     * @param mat the array
     * @param rowAIndex the index of a row to be swapped
     * @param rowBIndex the index of a row to be swapped
     */
    public static void rowSwap(int[][] mat, int rowAIndex, int rowBIndex)
    {
        // TODO: implement
    }
    
    /**
     * Swaps all values in the specified 2 columns of mat.
     * @param mat the array
     * @param colAIndex the index of a column to be swapped
     * @param colBIndex the index of a column to be swapped
     */
    public static void colSwap(int[][] mat, int colAIndex, int colBIndex)
    {
        // TODO: implement
    }
    
    /**
     * Returns an array with the specified number of rows and columns
     * containing the characters from str in row-major order. If str.length()
     * is greater than rows * cols, extra characters are ignored. If
     * str.length() is less than rows * cols, the remaining elements in the
     * returned array contain null.
     * 
     * @param str the string to be placed in an array
     * @param rows the number of rows in the array to be returned
     * @param cols the number of columns in the array to be returned
     * @return an array containing the characters from str in row-major order
     */
    public static String[][] fillRowMajor(String str, int rows, int cols)
    {
        return null; // TODO: implement
    }
    
    /**
     * Returns an array containing the elements of vals in column-major order.
     * 
     * Precondition: vals.length == rows * cols
     * 
     * @param vals the elements
     * @param rows the number of rows in the array to be returned
     * @param cols the number of columns in the array to be returned
     * @return an array containing the elements of vals in column-major order
     */
    public static int[][] fillColumnMajor(int[] vals, int rows, int cols)
    {
        return null; // TODO: implement
    }
    
    /**
     * Returns an array with the specified number of rows and columns that
     * contains the elements of vals in the order specified below. Elements
     * from vals are placed in the array by moving down the first column,
     * up the second column and so on.
     * 
     * For example, if vals was:
     * {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}
     * 
     * rows was 3 and cols was 4,
     * the returned array would be:
     * { {1, 6, 7, 12},
     *   {2, 5, 8, 11},
     *   {3, 4, 9, 10} }
     * 
     * Precondition: vals.length == rows * cols
     * 
     * @param vals the elements
     * @param rows the number of rows in the array to be returned
     * @param cols the number of columns in the array to be returned
     * @return an array containing the elements from vals in the specified order
     */
    public static int[][] fillDownUp(int[] vals, int rows, int cols)
    {
        return null; // TODO: implement
    }
    
    /**
     * Returns a larger array containing the same elements as the
     * mat. The elements from mat are read in row-major order and
     * appear in the new array in row-major order.
     * 
     * For example, if mat was:
     * { {10, 9, 8, 7},
     *   {6, 5, 4, 3},
     *   {2, 1, -1, 0} }
     * 
     * newRows was 4 and newCols was 5
     * the returned array would be:
     * { {10, 9, 8, 7, 6},
     *   {5, 4, 3, 2, 1},
     *   {-1, 0, 0, 0, 0},
     *   {0, 0, 0, 0, 0} }
     * 
     * Precondition: newRows > mat.length && newCols > mat[0].length
     * 
     * @param mat the 2D array containing the original elements
     * @param newRows the number of rows in the new array
     * @param newCols the number of columns in the new array
     * @return a larger array containing the elements from mat in row-major order
     */
    public static int[][] grow(int[][] mat, int newRows, int newCols)
    {
        return null; // TODO: implement
    }
    
    /**
     * Returns a smaller array containing the elements in the specified
     * range of the mat.
     * 
     * For example,
     * 
     * mat:
     * { {10, 9, 8, 7},
     *   {6, 5, 4, 3},
     *   {2, 1, -1, 0} }
     * 
     * startRow: 0, startCol: 1, endRow: 1, endCol: 2
     * 
     * would yield:
     * { {9, 8},
     *   {5, 4} }
     * 
     * @param mat the 2D array containing the original elements
     * @param startRow the first row to be kept
     * @param startCol the first column to be kept
     * @param endRow the last row to be kept
     * @param endCol the last column to be kept
     * @return a smaller array containing the specified elements
     */
    public static int[][] crop(int[][] mat,
            int startRow, int startCol,
            int endRow, int endCol)
    {
        return null; // TODO: implement
    }
    
    /**
     * Returns an array containing the same elements as
     * mat but with the rows and columns reversed.
     * 
     * For example:
     * 
     * mat:
     * { {10, 9, 8, 7},
     *   {6, 5, 4, 3},
     *   {2, 1, -1, 0} }
     *   
     * would yield:
     * { {10, 6, 2},
     *   {9, 5, 1},
     *   {8, 4, -1},
     *   {7, 3, 0} }
     * 
     * @param mat the array
     * @return an array containing elements as described
     */
    public static int[][] invert(int[][] mat)
    {
        return null; // TODO: implement
    }
    
    /**
     * Consolidates the non-null elements in mat such
     * that they appear in row-major order, starting at
     * the top left.
     */
    public static void consolidate(String[][] mat)
    {
    	// TODO: implement
    }
    
    /**
     * Returns a new 2D array that is a 90-degree clockwise rotation of mat.
     * The first row of mat becomes the last column of the returned array,
     * the second row becomes the second-to-last column, and so on.
     * 
     * For example, if mat is:
     * { {1, 2, 3},
     *   {4, 5, 6},
     *   {7, 8, 9} }
     * 
     * The returned array would be:
     * { {7, 4, 1},
     *   {8, 5, 2},
     *   {9, 6, 3} }
     * 
     * @param mat the 2D array to be rotated
     * @return a new 2D array that is a 90-degree clockwise rotation of mat
     */
    public static int[][] rotateClockwise(int[][] mat)
    {
        return null; // TODO: implement
    }
}