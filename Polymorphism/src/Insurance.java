public class Insurance {
    void quote() {

    }
}
class LifeInsurance extends Insurance{
        void quote(){
           int premium = 213;
            double tax=21.5;
            double quote = premium + tax;
            System.out.println("Quote for Life Insurance is:"+quote);
        }
}

class CarInsurance extends Insurance {
    void quote() {
        int premium = 130;
        double tax = 14.5;
        double quote = premium + tax;
        System.out.println("Quote for Car Insurance is:" + quote);
    }
    public static void main(String[] args){
        LifeInsurance li = new LifeInsurance();
        li.quote();
        CarInsurance ci = new CarInsurance();
        ci.quote();
    }
}

