public interface ElectricVehicle {
    void chargeBattery();
    void getBatteryLevel(int blevel);
}
class ElectricCar implements ElectricVehicle{
    public void chargeBattery(){
        System.out.println("Your electric car is charging");
    }
    public void getBatteryLevel(int blevel){
        System.out.println("Battery level is:"+blevel);
    }

}
class ElectricBike implements ElectricVehicle{
    public void chargeBattery(){
        System.out.println("Your electric bike is charging");
    }
    public void getBatteryLevel(int blevel){
        System.out.println("Battery level is:"+blevel);
    }
    public static void main(String[] args){
        ElectricCar ec = new ElectricCar();
        ElectricBike eb = new ElectricBike();
        ec.chargeBattery();
        ec.getBatteryLevel(85);
        ec.chargeBattery();
        ec.getBatteryLevel(75);

    }

}