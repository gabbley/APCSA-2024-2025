public class CarTest {

    // Main method for testing
    public static void main(String[] args) {
        // Create a new Car object
        Car myCar = new Car("Toyota", "Camry", 2018, 25000.0);

        // Display car details
        myCar.displayDetails();

        // Update mileage
        myCar.updateMileage(30000.0);

        // Display updated details
        myCar.displayDetails();

        // Get the age of the car
        System.out.println("Car Age: " + myCar.getCarAge() + " years");
    }

}
