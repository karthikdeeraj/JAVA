public class ServicePlan {
    String p_name;
    int price;
    String n_name;
    ServicePlan(String p_name,int price,String n_name){
        this.p_name=p_name;
        this.price=price;
        this.n_name=n_name;
    }
    void PlanDetails(){
    }
    void MonthlyCost(){

    }

}
class Prepaid extends ServicePlan {
    int n_sms;
    int minutes;

    Prepaid(String p_name, int price, String n_name, int n_sms, int minutes) {
        super(p_name, price, n_name);
        this.n_sms = n_sms;
        this.minutes = minutes;
    }

    void PlanDetails() {
        System.out.println("Plan Details:");
        System.out.println("Plan name:" + p_name);
        System.out.println("Network name:" + n_name);
        System.out.println("No.of sms:" + n_sms);
        System.out.println("No.of minutes:" + minutes);
    }

    void MonthlyCost() {
        if (p_name.equalsIgnoreCase("unlimited")) {
            price = 399;
            System.out.println(price);
        } else {
            price = this.price;
            System.out.println(price);
        }
    }
}
class Postpaid extends ServicePlan {
    int n_sms;
    int minutes;

    Postpaid(String p_name, int price, String n_name, int n_sms, int minutes) {
        super(p_name, price, n_name);
        this.n_sms = n_sms;
        this.minutes = minutes;
    }

    void PlanDetails() {
        System.out.println("Plan Details:");
        System.out.println("Plan name:" + p_name);
        System.out.println("Network name:" + n_name);
        System.out.println("No.of sms:" + n_sms);
        System.out.println("No.of minutes:" + minutes);
    }

    void MonthlyCost() {
        if (p_name.equalsIgnoreCase("unlimited")) {
            price = 399;
            System.out.println(price);
        } else {
            price = this.price;
            System.out.println(price);
        }
    }

    public static void main(String[] args) {
        Prepaid pr = new Prepaid("limited", 10, "Tmobile", 300, 5000);
        pr.MonthlyCost();
        pr.PlanDetails();
        Postpaid po = new Postpaid("unlimited",15,"AT&T",400,4000);
        po.MonthlyCost();
        po.PlanDetails();
    }
}



