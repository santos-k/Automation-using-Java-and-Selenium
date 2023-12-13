
public class ObjectExample {
    public static void main(String[] args) {
        // Creating objects of the Car class
        CarClass myCar = new CarClass();
        CarClass friendCar = new CarClass();

        // Setting values for object properties
        myCar.make = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2022;

        friendCar.make = "Honda";
        friendCar.model = "Accord";
        friendCar.year = 2021;

        // Using object methods
        myCar.start();
        myCar.drive();

        friendCar.start();
        friendCar.stop();
    }
}
