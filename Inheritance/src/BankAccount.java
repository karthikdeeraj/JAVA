import java.util.Scanner;

public class BankAccount {
    double principal;
    double time;
    double roi;
    double p_balance;

    BankAccount(double principal, double time, double roi, double p_balance) {
        this.principal = principal;
        this.time = time;
        this.roi = roi;
        this.p_balance=p_balance;

    }


    void interest() {

    }

    void fee() {

    }
}
class SavingsAccount extends BankAccount{
    SavingsAccount(double principal, double time, double roi,double p_balance){
        super(principal,time,roi,p_balance);
    }
    void interest()
    {
        double interest;
        p_balance = principal;
        interest=(principal*time*roi)/100;
        System.out.println("Interest added successfully");
        System.out.println("The added interest is:"+interest);
        p_balance=p_balance+interest;
        System.out.println("The principal balance is:"+p_balance);
    }
}


class CheckingAccount extends BankAccount{
    int month;
    CheckingAccount(double principal, double time, double roi,int month,double p_balance){
      super(principal,time,roi,p_balance);
      this.month=month;

    }
    void fee(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println(month);
        for(n=1;n<month+1;n++) {
            if (n == 1) {
                System.out.println("Monthly fee has been charged for" + " " + n + "st" + " " + "month");
                p_balance = p_balance - 10;
                System.out.println("The total balance is:" + p_balance);
            } else if (n ==2) {
                System.out.println("Monthly fee has been charged for" + " " + n + "nd" + " " + "month");
                p_balance = p_balance - 10;
                System.out.println("The total balance is:" + p_balance);
            } else if (n==3) {
                System.out.println("Monthly fee has been charged for" + " " + n + "rd" + " " + "month");
                p_balance = p_balance - 10;
                System.out.println("The total balance is:" + p_balance);
            }
            else {
                System.out.println("Monthly fee has been charged for" + " " + n + "th" + " " + "month");
                p_balance = p_balance - 10;
                System.out.println("The total balance is:" + p_balance);
            }

        }



        /*switch (month){
           case 1:
               p_balance = p_balance + 10;
               System.out.println(p_balance);
               break;
           case 2:
               p_balance = p_balance + 20;
               System.out.println(p_balance);
               break;
           case 3:
               p_balance = p_balance + 30;
               System.out.println(p_balance);
               break;
           case 4:
               p_balance = p_balance + 40;
               System.out.println(p_balance);
               break;
           case 5:
               p_balance = p_balance + 50;
               System.out.println(p_balance);
               break;
           case 6:
               p_balance = p_balance + 60;
               System.out.println(p_balance);
               break;
           case 7:
               p_balance = p_balance + 70;
               System.out.println(p_balance);
               break;
           case 8:
               p_balance = p_balance + 80;
               System.out.println(p_balance);
               break;
           case 9:
               p_balance = p_balance + 90;
               System.out.println(p_balance);
               break;
           case 10:
               p_balance = p_balance + 100;
               System.out.println(p_balance);
               break;
           case 11:
               p_balance = p_balance + 110;
               System.out.println(p_balance);
               break;
           case 12:
               p_balance = p_balance + 120;
               System.out.println(p_balance);
               break;


       }*/
    }
    public static void main(String[] args){
        SavingsAccount sa= new SavingsAccount(10000,3,10.5,10000);
        sa.interest();
        CheckingAccount ca = new CheckingAccount(10000,3,3.5,5,10000);
        ca.fee();
    }
}