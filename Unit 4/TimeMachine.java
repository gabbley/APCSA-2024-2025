/**
 * The TimeMachine class simulates a simple time travel experience.
 * It allows a user to travel to a future year (forward) or a past year (backward) 
 * using the travel method.
 */
public class TimeMachine {

    public static void main(String[] args) {
        travel(2020, 3000); // Travel forward in time
        travel(2040, 2000); // Travel backward in time
    }

    /**
     * Simulates traveling between two years, either forward or backward in time.
     * The method checks the direction of travel (forward or backward) based on the values of 
     * `fromYear` and `toYear`, and prints each year during the time travel.
     * If either the start year or target year is negative, the method returns -1 to indicate an error.
     *
     * @param fromYear The starting year for the time travel.
     * @param toYear The target year to travel to.
     * @return The total number of years traveled, or -1 if an invalid year is provided (e.g., negative year).
     */
    public static int travel(int fromYear, int toYear) {
        // Calculate the number of years to travel (absolute value of the difference)
        int yearsToTravel = (int) Math.abs(fromYear - toYear);
        
        // Validate that both years are non-negative
        if (fromYear >= 0 && toYear >= 0) {
            if (toYear > fromYear) {
                // Travel forward in time
                System.out.println("Traveling forward in time from " + fromYear + " to " + toYear +"...\n");

                // Simulate time travel by printing each year incrementally
                while (fromYear <= toYear) {
                    System.out.println("You are now in year " + fromYear);
                    fromYear++;
                }
            } 
            else if (toYear < fromYear) {
                // TODO: Implmement traveling backwards in time
                System.out.println("Not yet implemented");
            }
            System.out.println("\nYou have successfully traveled to the year " + toYear);
            return yearsToTravel;
        }
        
        // Return -1 if either year is invalid (negative year)
        return -1;
    }

}
