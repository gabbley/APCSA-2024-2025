//import statement to access more Java libraries and functions
import java.util.Scanner;

public class Modulus {
    
    public static void main(String[] args) {
        // Creates a Scanner object to take in user input
        Scanner kb = new Scanner(System.in);
        int quarters, dimes, nickles, pennies; //declare but don't initialize your coin vars
        
        // prompt the user to enter a whole number
        System.out.println("How much change do we owe you (in cents)?");
        int change = kb.nextInt(); // takes in input and stores in a variable

        System.out.println("Calculating your change...\n\n\n");
        
        int centsLeft = change;
        quarters = centsLeft/25;   // how many quarters?
        centsLeft %= 25;           // gives you change < 25
        dimes = centsLeft / 10;    // how many dimes?
        centsLeft %= 10;           // gives you change < 10
        nickles = centsLeft / 5;   // how many nickles?
        centsLeft = centsLeft % 5; // gives you change < 5
        pennies = centsLeft;       // remaining change < 5

        // You should be able to explain...why strictly < 25? <10?

        // final output
        System.out.println("Your change is: " + change + "\n\nDispensing " + 
                            quarters + " quarter(s), " + dimes + " dime(s), " + 
                            nickles + " nickle(s), and " + pennies + " pennie(s).");
        
        kb.close();

    }

}
