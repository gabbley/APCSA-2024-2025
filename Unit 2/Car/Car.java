// Car.java
public class Car {

    private final String DEFAULT_STR = "Default";

    // Fields (attributes)
    private String make;
    private String model;
    private int year;
    private double mileage;

    public Car() {
      this.make = DEFAULT_STR;
      this.model = DEFAULT_STR;
      this.year = 0;
      this.mileage = 0;
    }
   
    // Constructor
    public Car(String make, String model, int year, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage + " miles");
    }

    // Method to update mileage
    public void updateMileage(double newMileage) {
        if (newMileage > mileage) {
            mileage = newMileage;
            System.out.println("Mileage updated to: " + mileage + " miles");
        } else {
            System.out.println("New mileage must be greater than the current mileage.");
        }
    }

    // Method to get the age of the car
    public int getCarAge() {
        return 2024 - year; // Assuming the current year is 2024
    }

}
