public class SubscriptionPlan {
    void CalculateBill() {

    }
}
class UnlimitedPlan extends SubscriptionPlan{
    void CalculateBill(){
        int cost = 50;
        System.out.println("Cost of unlimited plan is:"+cost);
    }
}
class PayAsYouGoPlan extends SubscriptionPlan{
    void CalculateBill(int usage){
        int cost;
        int bcost = 10;
        cost = bcost + usage;
        System.out.println("Cost of Pay as you go plan is:"+cost);
    }
public static void main(String[] args){
        UnlimitedPlan un = new UnlimitedPlan();
        un.CalculateBill();
        PayAsYouGoPlan pa = new PayAsYouGoPlan();
        pa.CalculateBill(15);
}
}
