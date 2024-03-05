public class Vehicle {
        String make;
        String model;

        Vehicle(String make, String model) {
            this.make = make;
            this.model = model;
        }

        void specifications() {

        }


    }

    class Car extends Vehicle {
        int cargo_capacity;
        int seating_capacity;
        Car(String make, String model, int cargo_capacity, int seating_capacity) {
            super(make, model);
            this.cargo_capacity = cargo_capacity;
            this.seating_capacity = seating_capacity;

        }

        void specifications() {
            System.out.println("Specifications of car:");
            System.out.println("Make:" + make);
            System.out.println("Model:" + model);
            System.out.println("Cargo capacity:" + cargo_capacity);
            System.out.println("Seating Capacity:" + seating_capacity);

        }

    }

    class Truck extends Vehicle {
        int cargo_capacity;
        int seating_capacity;
        Truck(String make, String model, int cargo_capacity, int seating_capacity) {
            super(make, model);
            this.cargo_capacity = cargo_capacity;
            this.seating_capacity = seating_capacity;

        }

        void specifications() {
            System.out.println();
            System.out.println("Specifications of truck:");
            System.out.println("Make:" + make);
            System.out.println("Model:" + model);
            System.out.println("Cargo capacity:" + cargo_capacity);
            System.out.println("Seating Capacity:" + seating_capacity);

        }
        public static void main(String[] args){
            Car c=new Car("Tesla","X",40,7);
            c.specifications();
            Truck tr=new Truck("Tesla","Cyber",300,2);
            tr.specifications();

        }
    }
