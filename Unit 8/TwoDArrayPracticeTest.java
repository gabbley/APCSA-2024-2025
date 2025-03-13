public class TwoDArrayPracticeTest {
    public static void main(String[] args) {
        testRowSwap();
        testColSwap();
        testFillRowMajor();
        testFillColumnMajor();
        testFillDownUp();
        testGrow();
        testCrop();
        testInvert();
        testRotateClockwise();
    }

    private static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void testRowSwap() {
        int[][] mat = {{1, 2}, {3, 4}};
        TwoDArrayPractice.rowSwap(mat, 0, 1);
        printMatrix(mat);
    }

    private static void testColSwap() {
        int[][] mat = {{1, 2}, {3, 4}};
        TwoDArrayPractice.colSwap(mat, 0, 1);
        printMatrix(mat);
    }

    private static void testFillRowMajor() {
        String[][] result = TwoDArrayPractice.fillRowMajor("hello", 2, 3);
        for (String[] row : result) {
            for (String s : row) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void testFillColumnMajor() {
        int[] vals = {1, 2, 3, 4, 5, 6};
        int[][] result = TwoDArrayPractice.fillColumnMajor(vals, 2, 3);
        printMatrix(result);
    }

    private static void testFillDownUp() {
        int[] vals = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[][] result = TwoDArrayPractice.fillDownUp(vals, 3, 4);
        printMatrix(result);
    }

    private static void testGrow() {
        int[][] mat = {{10, 9, 8, 7}, {6, 5, 4, 3}, {2, 1, -1, 0}};
        int[][] result = TwoDArrayPractice.grow(mat, 4, 5);
        printMatrix(result);
    }

    private static void testCrop() {
        int[][] mat = {{10, 9, 8, 7}, {6, 5, 4, 3}, {2, 1, -1, 0}};
        int[][] result = TwoDArrayPractice.crop(mat, 0, 1, 1, 2);
        printMatrix(result);
    }

    private static void testInvert() {
        int[][] mat = {{10, 9, 8, 7}, {6, 5, 4, 3}, {2, 1, -1, 0}};
        int[][] result = TwoDArrayPractice.invert(mat);
        printMatrix(result);
    }

    private static void testRotateClockwise() {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = TwoDArrayPractice.rotateClockwise(mat);
        printMatrix(result);
    }
}
