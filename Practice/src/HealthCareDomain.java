import java.util.Scanner;
public class HealthCareDomain {
    double[] temp = new double[100];
    int n;
    void temperature() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of patients:");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the temperature:");
            temp[i]=sc.nextDouble();
        }
        System.out.println("Recorded temperatures are:");
        for(int i=0;i<n;i++){
            System.out.println(temp[i]);
        }
    }
    void avg_temp(){
        double avg,sum = 0;
        for (int i=0;i<n;i++) {
            sum = sum + temp[i];
        }
        avg = sum/ n;
        System.out.println("The average of temperature is :" +avg);
    }
    void h_temp(){
        double max = temp[0];
        for(int i=0;i<n;i++){
            if(temp[i]>max){
                max = temp[i];
            }
        }
        System.out.println("The highest temperature is:" +max);
    }
    void fever(){
        double max1 = 37.5;
        int count = 0;
        for(int i=0;i<n;i++){
            if(temp[i]>max1){
                count = count+1;

            }
        }
        if(count>0) {
            System.out.println(count + " " + "persons has fever");
        }
        else{
            System.out.println("No one has fever");
        }
    }
    public static void main(String[] args){
        HealthCareDomain hcd = new HealthCareDomain();
        hcd.temperature();
        hcd.avg_temp();
        hcd.h_temp();
        hcd.fever();
    }
}
