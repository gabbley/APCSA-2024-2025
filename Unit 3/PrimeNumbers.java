// Started from CSAwesome Unit 3

public class PrimeNumbers {

    public static void main(String[] args)
    {
        int number = 5;
        System.out.println("A prime number is only divisible by 1 and itself.");
        System.out.println(
                "Is " + number + " divisible by 1 up to " + number + "?");
        System.out.println("Divisible by 1? " + (number % 1 == 0));
        System.out.println("Divisible by 2? " + (number % 2 == 0));
        System.out.println("Divisible by 3? " + (number % 3 == 0));
        System.out.println("Divisible by 4? " + (number % 4 == 0));
        System.out.println("Divisible by 5? " + (number % 5 == 0));

        // Below here, write 2 separate print statements that check number for divisibility by 6 and 7



        // Below here, write 1 print statement that checks that number is divisible by 2 AND 5. Use a logical operator
        // EXPECTED OUTPUT:
        // Divisible by 2 AND divisible by 5? true/false (depending on the value)


        // After checking divisibility by 2 AND 5, change number to a value that causes that print statement to output true
        
    }

}
