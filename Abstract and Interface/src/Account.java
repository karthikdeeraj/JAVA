abstract class Account {
    int balance =10000;
    abstract void deposit();
    abstract void withdraw();
    public int getBalance(){
        return balance;
    }
}
class SavingsAccount extends Account{
    void deposit(){
        int dp = 3000;
        balance = balance + dp;
    }
    void withdraw(){
        int wd = 2000;
        balance = balance - wd;
    }
    public int getBalance(){
        return balance;
    }
}
class CheckingAccount extends Account{
    void deposit(){
        int dp = 3000;
        balance = balance + dp - 10;
    }
    void withdraw(){
        int wd = 2000;
        balance = balance - wd -10;
    }
    public int getBalance(){
        return balance;
    }
    public static void main(String[] args){
        SavingsAccount sa = new SavingsAccount();
        sa.deposit();
        sa.withdraw();
        System.out.println(sa.getBalance());
    }
}
