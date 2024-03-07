public interface EmergencyCare {
    void PR();
    void stopBleeding();

}
class Paramedic implements EmergencyCare{
    public void PR(){
        System.out.println("Performing PR");
    }
    public void stopBleeding(){
    }

}
class EmergencyDoctor implements EmergencyCare{
    public void PR(){

    }
    public void stopBleeding(){
        System.out.println("Doctor is stopping bleeding");
    }
    public static void main(String[] args){
        Paramedic pa = new Paramedic();
        pa.PR();
        EmergencyDoctor ed = new EmergencyDoctor();
        ed.stopBleeding();
    }
}
