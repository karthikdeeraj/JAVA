public class Vehicle {
    String make;
    String model;
    Vehicle(String make,String model){
        this.make=make;
        this.model=model;
    }
    void specifications(){

    }
    void features(){

    }

}
class Car extends Vehicle{
    int cargo_capacity;
    int seating_capacity;
    String transmission;
    String entry;
    int n_color;
    Car(String make,String model,int cargo_capacity,int seating_capacity,String transmission,String entry,int n_color){
        super(make,model);
        this.cargo_capacity=cargo_capacity;
        this.seating_capacity=seating_capacity;
        this.transmission=transmission;
        this.entry=entry;
        this.n_color=n_color;

    }
    void specifications(){
        System.out.println("Specifications of car:");
        System.out.println("Make:"+make);
        System.out.println("Model:"+model);
        System.out.println("Cargo capacity:"+cargo_capacity);
        System.out.println("Seating Capacity:"+seating_capacity);

    }
    void features(){
        System.out.println();
        System.out.println("Features of car:");
        System.out.println("Transmission:"+transmission);
        System.out.println("Entry:"+entry);
        System.out.println("No.of colors"+n_color);
    }
}
class Truck extends Vehicle{
    int cargo_capacity;
    int seating_capacity;
    String transmission;
    String entry;
    int n_color;
    Truck(String make,String model,int cargo_capacity,int seating_capacity,String transmission,String entry,int n_color){
        super(make,model);
        this.cargo_capacity=cargo_capacity;
        this.seating_capacity=seating_capacity;
        this.transmission=transmission;
        this.entry=entry;
        this.n_color=n_color;

    }
    void specifications(){
        System.out.println();
        System.out.println("Specifications of truck:");
        System.out.println("Make:"+make);
        System.out.println("Model:"+model);
        System.out.println("Cargo capacity:"+cargo_capacity);
        System.out.println("Seating Capacity:"+seating_capacity);

    }
    void features(){
        System.out.println();
        System.out.println("Features of truck:");
        System.out.println("Transmission:"+transmission);
        System.out.println("Entry:"+entry);
        System.out.println("No.of colors:"+n_color);
    }
    public static void main(String[] args){
        Car c = new Car("Tesla","X",40,7,"Automatic","Keyless",5);
        c.specifications();
        c.features();
        Truck tr = new Truck("Tesla","Cyber",300,2,"Automatic","Remote",3);
        tr.specifications();
        tr.features();
    }
}
