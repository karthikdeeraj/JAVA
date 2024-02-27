import java.util.Scanner;
public class FinanceDomain {
    int[] inv_p = {200000};
    int[] stock = new int[100];
    int[] bonds = new int[100];
    int[] cash = new int[100];
    int[] mf = new int[100];
    int[] etf = new int[100];
    int[] reit = new int[100];
    int[] cd = new int[100];
    int[][] arrays = {stock, bonds, cash, mf, etf, reit, cd};
    int n;
    int inp;

    void in_Value() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many investments you want to add");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the type of investment to add:");
            System.out.println("1.Stock");
            System.out.println("2.Bonds");
            System.out.println("3.Cash");
            System.out.println("4.Mutual Funds");
            System.out.println("5.Exchange-Traded Funds");
            System.out.println("6.Real Estate Investment Trusts");
            System.out.println("7.Certificates of Deposit");
            inp = sc.nextInt();
            if (inp == 1) {
                System.out.println("Enter the stocks you want to add:");
                stock[i] = sc.nextInt();
                inv_p[0] += stock[i];
            }
            if (inp == 2) {
                System.out.println("Enter the bonds you want to add:");
                bonds[i] = sc.nextInt();
                inv_p[0] += bonds[i];
            }
            if (inp == 3) {
                System.out.println("Enter the cash you want to add:");
                cash[i] = sc.nextInt();
                inv_p[0] += cash[i];
            }
            if (inp == 4) {
                System.out.println("Enter the mutual funds you want to add:");
                mf[i] = sc.nextInt();
                inv_p[0] += mf[i];
            }
            if (inp == 5) {
                System.out.println("Enter the Exchange-Traded Funds you want to add:");
                etf[i] = sc.nextInt();
                inv_p[0] += etf[i];
            }
            if (inp == 6) {
                System.out.println("Enter the Real Estate Investment Trusts you want to add:");
                reit[i] = sc.nextInt();
                inv_p[0] += reit[i];
            }
            if (inp == 7) {
                System.out.println("Enter the Certificates of Deposit you want to add:");
                cd[i] = sc.nextInt();
                inv_p[0] += cd[i];
            }
        }
    }

    void total_value() {
        System.out.println("The total value of portfolio is :" + inv_p[0]);
    }

    void h_value() {
        int max = 0;
        String investmentType = "";

        for (int i = 0; i < arrays.length; i++) {
            int[] array = arrays[i];

            for (int j = 0; j < array.length; j++) {
                int element = array[j];

                if (element > max) {
                    max = element;

                    switch (i) {
                        case 0:
                            investmentType = "Stock";
                            break;
                        case 1:
                            investmentType = "Bonds";
                            break;
                        case 2:
                            investmentType = "Cash";
                            break;
                        case 3:
                            investmentType = "Mutual Funds";
                            break;
                        case 4:
                            investmentType = "Exchange-Traded Funds";
                            break;
                        case 5:
                            investmentType = "Real Estate Investment Trusts";
                            break;
                        case 6:
                            investmentType = "Certificates of Deposit";
                            break;

                    }
                }
            }
        }

        System.out.println("The investment with the highest value is " + investmentType + " with a value of " + max);
    }

    void average() {
        double avg, sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + stock[i]+bonds[i]+cash[i]+mf[i]+etf[i]+reit[i]+cd[i];
        }
        avg = sum / n;
        System.out.println("The average value of investment portfolio is:" +avg);
    }
    public void main(String[] args) {
        FinanceDomain fd = new FinanceDomain();
        fd.in_Value();
        fd.total_value();
        fd.h_value();
        fd.average();
    }
}


