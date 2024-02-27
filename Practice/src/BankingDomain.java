import java.util.Scanner;
public class BankingDomain {
    int[] tra = {10000};
    int[] x = new int[10];
    int[] y = new int[10];

    void transaction() {
        int inp,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of transactions:");
        n = sc.nextInt();
        if (n>10){
            System.out.println("Transaction limit is 10");
            System.out.println("Enter the no.of transactions:");
            n = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the transaction you want to do: Deposit/Withdrawal");
            System.out.println("1:Deposit");
            System.out.println("2.Withdrawal");
            inp = sc.nextInt();
            if (inp == 1) {
                System.out.println("Enter deposit amount:");
                x[i] = sc.nextInt();
                tra[0] = tra[0] + x[i];
            }
            if (inp == 2) {
                System.out.println("Enter withdrawal amount: ");
                y[i] = sc.nextInt();
                y[i] = -y[i];
                tra[0] = tra[0] + y[i];
            }
            if(inp!=1 && inp!=2){
                System.out.println("Enter valid input");
            }

        }
    }
    void balance(){
        System.out.println("Total balance :" +tra[0]);
    }
    void l_dep(){
    int max = x[0];
    for(int i=0;i<x.length;i++){
      if (x[i]>max) {
          max = x[i];
      }

}
    System.out.println("The largest deposit is:" +max);
    }
    void l_withdrawal(){
        int max1 = -y[0];
        for(int i=0;i<y.length;i++){
            if (-y[i]>max1){
                max1 = -y[i];
            }
        }
        System.out.println("The largest withdrawal is:" +max1);
    }

public static void main(String[] args){
        BankingDomain bd= new BankingDomain();
        bd.transaction();
        bd.balance();
        bd.l_dep();
        bd.l_withdrawal();

}

}
