public class Vehicle {
    String make;
    String model;
    int year;

    void vehicleStart() {
        System.out.println("Vehicle is started");
    }

    void vehicleDetails(String make, String model, int year) {
        System.out.println(make);
        System.out.println(model);
        System.out.println(year);


    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.vehicleStart();
        vehicle.vehicleDetails("Toyota","Camry",2023 );


    }
}