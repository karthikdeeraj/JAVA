public abstract class Vehicle {
    String manufacturer;
     abstract void accelerate();
     abstract void brake();
     void getManufacturerInfo(){
         System.out.println("The manufacturer of the vehicle is " + manufacturer);

     }
}
class Car extends Vehicle{
    void accelerate(){
        System.out.println("Car is accelerating");
    }
    void brake(){
        System.out.println("Brakes are applied to car");
    }
    void getManufacturerInfo(String manufacturer){
        System.out.println("The manufacturer of car is " +manufacturer);
    }
}
class Truck extends Vehicle{
    void accelerate(){
        System.out.println("Truck is accelerating");
    }
    void brake(){
        System.out.println("Brakes are applied to truck");
    }
    void getManufacturerInfo(String manufacturer){
        System.out.println("The manufacturer of truck is " +manufacturer);
    }
}
class MotorCycle extends Vehicle{
    void accelerate(){
        System.out.println("Motorcycle is accelerating");
    }
    void brake(){
        System.out.println("Brakes are applied to motorcycle");
    }
    void getManufacturerInfo(String manufacturer){
        System.out.println("The manufacturer of motorcycle is " +manufacturer);
    }
    public static void main(String[] args){
        Car c = new Car();
        Truck tr = new Truck();
        MotorCycle mc = new MotorCycle();
        c.accelerate();;
        c.brake();
        c.getManufacturerInfo("Ford");
        tr.accelerate();
        tr.brake();
        tr.getManufacturerInfo("Ram");
        mc.accelerate();
        mc.brake();
        mc.getManufacturerInfo("Kawasaki");

    }

}
