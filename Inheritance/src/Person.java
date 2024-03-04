import java.util.Scanner;
public class Person {
String name;
int age;
String address;

Person(String name,int age,String address){
    this.name=name;
    this.age=age;
    this.address=address;
}
void appointment(){

}
void prescription(){

}
}
class Patient extends Person{
    int option;
    Patient(String name,int age,String address,int option){
        super(name,age,address);
        this.option=option;
    }
    void appointment(){
        if(option==1){
            System.out.println("Your appointment has been successfully scheduled. Below are the details");
            System.out.println(name);
            System.out.println(age);
            System.out.println(address);
        }
        else{
            System.out.println("Choose correct option");
            }
        }
    }
class Doctor extends Person{
    String disease;
    Doctor(String name,int age,String address,String disease){
        super(name,age,address);
        this.disease=disease;
    }
    void prescription(){
        if(disease=="fever"){
            System.out.println("These are medicines for fever:");
            System.out.println("med1,med3,med5");
        }
        if(disease=="cough"){
            System.out.println("These are medicines for cough:");
            System.out.println("med2,med4,med5");
        }
    }
    public static void main(String[] args){
        Patient p = new Patient("Karthik",24,"Minneapolis",1);
        p.appointment();
        Doctor d = new Doctor("Ajay",30,"Hyderabad","cough");
        d.prescription();
    }
}
