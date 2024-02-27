import java.util.Scanner;
public class AutomobileDomain {
    double[] speed = new double[100];
    int n;

    void carSpeed(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of cars for which you want to store the speed");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the speed of car(in km/h):");
            speed[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("The recorded speeds are:"+speed[i]);
        }
    }
    void avg_speed(){
        double avg,sum = 0;
        for(int i=0;i<n;i++){
            sum+=speed[i];
        }
        avg = sum/n;
        System.out.println("The average speed is:"+avg);
    }
    void m_speed(){
        double max = speed[0];
        for(int i=0;i<n;i++){
            if (speed[i]>max){
                max=speed[i];
            }
        }
        System.out.println("The maximum speed recorded is:"+max);
    }
    void limit() {
        double max = 100;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (speed[i] > max) {
                count = count+1;
            }
        }
        System.out.println(count+" "+ "has exceeded the speed limit");
    }
    public static void main(String[] args){
        AutomobileDomain amd = new AutomobileDomain();
        amd.carSpeed();
        amd.avg_speed();
        amd.m_speed();
        amd.limit();
    }
}