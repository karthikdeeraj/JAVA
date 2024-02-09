public class BankAccount {
    String name;
    int acc_num;
    double balance;
    void deposit(){

    }
    void withdraw(){

    }
void checkbalance(){

}
void acc_details(int acc_num,String name, double balance){
        System.out.println(acc_num);
        System.out.println(name);
        System.out.println(balance);

}
public static void main(String[] args){
        BankAccount bank = new BankAccount();
        bank.acc_details(100,"Satya",15000);
}
}

