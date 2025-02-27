public class ArrayAlgorithmsTest {

    public static void main(String[] args) {
        int score = 0; // Initialize score to 0

        // Test 1: Testing findMin() method
        int[] nums1 = {1, 2, 3, 0, -1, -5};
        int min1 = ArrayAlgorithms.findMin(nums1);
        if (min1 == -5) {
            System.out.println("Test 1 - Passed (findMin)");
            score++; // Add 1 point
        } else {
            System.out.println("Test 1 - Failed (findMin), Expected: -5, Got: " + min1);
        }

        // Test 2: Testing findMax() method
        int max1 = ArrayAlgorithms.findMax(nums1);
        if (max1 == 3) {
            System.out.println("Test 2 - Passed (findMax)");
            score++; // Add 1 point
        } else {
            System.out.println("Test 2 - Failed (findMax), Expected: 3, Got: " + max1);
        }

        // Test 3: Testing arraySum() method
        int sum1 = ArrayAlgorithms.arraySum(nums1);
        if (sum1 == 0) {
            System.out.println("Test 3 - Passed (arraySum)");
            score++; // Add 1 point
        } else {
            System.out.println("Test 3 - Failed (arraySum), Expected: 0, Got: " + sum1);
        }

        // Test 4: Testing arrayAverage() method
        double avg1 = ArrayAlgorithms.arrayAverage(nums1);
        if (avg1 == 0.0) {
            System.out.println("Test 4 - Passed (arrayAverage)");
            score++; // Add 1 point
        } else {
            System.out.println("Test 4 - Failed (arrayAverage), Expected: 0.0, Got: " + avg1);
        }

        // Test 5: Testing mode() method
        int[] nums2 = {1, 2, 2, 3, 3, 3, 4};
        int mode1 = ArrayAlgorithms.mode(nums2);
        if (mode1 == 3) {
            System.out.println("Test 5 - Passed (mode)");
            score++; // Add 1 point
        } else {
            System.out.println("Test 5 - Failed (mode), Expected: 3, Got: " + mode1);
        }

        // Test 6: Testing hasAtLeastOnePositive() method
        boolean hasPositive1 = ArrayAlgorithms.hasAtLeastOnePositive(nums1);
        if (hasPositive1) {
            System.out.println("Test 6 - Passed (hasAtLeastOnePositive)");
            score++; // Add 1 point
        } else {
            System.out.println("Test 6 - Failed (hasAtLeastOnePositive), Expected: true, Got: " + hasPositive1);
        }

        // Test 7: Testing allAreNegative() method
        boolean allNegative1 = ArrayAlgorithms.allAreNegative(nums1);
        if (!allNegative1) {
            System.out.println("Test 7 - Passed (allAreNegative)");
            score++; // Add 1 point
        } else {
            System.out.println("Test 7 - Failed (allAreNegative), Expected: false, Got: " + allNegative1);
        }

        // Test 8: Testing isStrictlyIncreasing() method
        int[] nums3 = {-3, -2, -1, 0, 1, 2, 3, 4};
        boolean isIncreasing1 = ArrayAlgorithms.isStrictlyIncreasing(nums3);
        if (isIncreasing1) {
            System.out.println("Test 8 - Passed (isStrictlyIncreasing)");
            score++; // Add 1 point
        } else {
            System.out.println("Test 8 - Failed (isStrictlyIncreasing), Expected: true, Got: " + isIncreasing1);
        }

        // Test 9: Testing containsDuplicates() method (String)
        String[] words1 = {"apple", "banana", "orange", "apple"};
        boolean containsDuplicates1 = ArrayAlgorithms.containsDuplicates(words1);
        if (containsDuplicates1) {
            System.out.println("Test 9 - Passed (containsDuplicates)");
            score++; // Add 1 point
        } else {
            System.out.println("Test 9 - Failed (containsDuplicates), Expected: true, Got: " + containsDuplicates1);
        }

        // Test 10: Testing countFourLetterWords() method (String)
        String[] words2 = {"this", "is", "four", "test", "word"};
        int count4LetterWords1 = ArrayAlgorithms.countFourLetterWords(words2);
        if (count4LetterWords1 == 3) {
            System.out.println("Test 10 - Passed (countFourLetterWords)");
            score++; // Add 1 point
        } else {
            System.out.println("Test 10 - Failed (countFourLetterWords), Expected: 3, Got: " + count4LetterWords1);
        }

        // Test 11: Testing shiftLeft() method
        int[] nums4 = {1, 2, 3, 4, 5};
        ArrayAlgorithms.shiftLeft(nums4);
        System.out.print("Test 11 - Expected Array after shiftLeft: [2, 3, 4, 5, 1], ");
        System.out.print("Actual Array after shiftLeft: ");
        printArray(nums4);
        score++; // Add 1 point

        // Test 12: Testing shiftRight() method
        int[] nums5 = {1, 2, 3, 4, 5};
        ArrayAlgorithms.shiftRight(nums5);
        System.out.print("Test 12 - Expected Array after shiftRight: [5, 1, 2, 3, 4], ");
        System.out.print("Actual Array after shiftRight: ");
        printArray(nums5);
        score++; // Add 1 point

        // Test 13: Testing reverseArray() method
        int[] nums6 = {1, 2, 3, 4, 5};
        ArrayAlgorithms.reverseArray(nums6);
        System.out.print("Test 13 - Expected Array after reverse: [5, 4, 3, 2, 1], ");
        System.out.print("Actual Array after reverse: ");
        printArray(nums6);
        score++; // Add 1 point

        // Test 14: Testing findLarge() method (String)
        String[] words3 = {"apple", "orange", "banana", "grape"};
        String largeWord1 = ArrayAlgorithms.findLarge(words3);
        if (largeWord1.equals("orange")) {
            System.out.println("Test 14 - Passed (findLarge)");
            score++; // Add 1 point
        } else {
            System.out.println("Test 14 - Failed (findLarge), Expected: orange, Got: " + largeWord1);
        }

        // Final score
        System.out.println("\nTotal Score: " + score + "/15");
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
