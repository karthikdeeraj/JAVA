public class InsurancePolicy {
    String p_name;
    String name;
    int age;
    double total;
    InsurancePolicy(String p_name,String name,int age,double total){
        this.p_name=p_name;
        this.name=name;
        this.age=age;
        this.total=total;
    }
    void premium(){

    }
    void policy_details(){

    }

}
class LifeInsurance extends InsurancePolicy{
    double amount;
    double tax;
    String p_type;
    int p_number;
    double p_value;
    LifeInsurance(String p_name,String name,int age,double total,double tax,String p_type,int p_number,double p_value){
        super(p_name,name,age,total);
        this.tax=tax;
        this.p_type=p_type;
        this.p_number=p_number;
        this.p_value=p_value;
    }
    void premium(){
        if(p_type.equalsIgnoreCase("term")) {
            total=100+tax;
            System.out.println("Premium calculation:"+total);
        }
        else if(p_type.equals("Whole")){
            total=1000+tax;
            System.out.println("Premium calculation:"+total);
        }
        else{
            System.out.println("Choose between the two plans");
        }

    }
    void policy_details(){
        System.out.println("Policy name:"+p_name);
        System.out.println("Name of Person:"+name);
        System.out.println("Age:"+age);
        System.out.println("Total:"+total);
        System.out.println("Tax:"+tax);
        System.out.println("Policy type:"+p_type);
        System.out.println("Policy number:"+p_number);
        System.out.println("Policy value:"+p_value);
    }
}
class HealthInsurance extends InsurancePolicy{
    double amount;
    double tax;
    String p_type;
    int p_number;
    double p_value;
    HealthInsurance(String p_name,String name,int age,double total,double tax,String p_type,int p_number,double p_value){
        super(p_name, name, age, total);
        this.tax=tax;
        this.p_type=p_type;
        this.p_number=p_number;
        this.p_value=p_value;
    }
    void premium(){
        if(p_type.equals("Month")) {
            total=100+tax;
            System.out.println("Premium calculation:"+total);
        }
        else if(p_type.equals("Deductible")){
            total=1000+tax;
            System.out.println("Premium calculation:"+total);
        }
        else{
            System.out.println("Choose between the two plans");
        }
    }
    void policy_details(){
        System.out.println("Policy name:"+p_name);
        System.out.println("Name of Person:"+name);
        System.out.println("Age:"+age);
        System.out.println("Total:"+total);
        System.out.println("Tax:"+tax);
        System.out.println("Policy type:"+p_type);
        System.out.println("Policy number:"+p_number);
        System.out.println("Policy value:"+p_value);
    }
    public static void main(String[] args){
        HealthInsurance hi=new HealthInsurance("Liberty","Karthik",24,1000,24.5,"Month",1000,10000);
        hi.premium();
        hi.policy_details();
        LifeInsurance li=new LifeInsurance("United","Satya",25,2000,85.5,"term",1321,50000);
        li.premium();
        li.policy_details();
    }
}