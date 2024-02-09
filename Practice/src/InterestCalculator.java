public class InterestCalculator {
    int p;
    int roi;
    int t;
    void CalculateSimpleInterest(int p, int roi, int t){
        System.out.println((p*t*roi)/100);
    }
    public static void main(String[] args){
        InterestCalculator interest = new InterestCalculator();
        interest.CalculateSimpleInterest(10000,5,2);
    }

}
