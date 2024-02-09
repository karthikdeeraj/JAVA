public class Patient {
    int pid;
    String name;
    String diag;

    void PatientInformation(int pid,String name, String diag){
        System.out.println(pid);
        System.out.println(name);
        System.out.println(diag);
    }
    public static void main(String[] args){
        Patient patient = new Patient();
        patient.PatientInformation(3,"Satya","Eye");
    }
}
