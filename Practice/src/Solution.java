import java.util.Scanner;
class Solution{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            printSeries(a,b,n);
        }

        in.close();
    }
    public static void printSeries(int a,int b,int n){
        for(int j=0;j<n;j++){
            System.out.printf("%d ", (a + ((int) Math.pow(2, j)) * b));


        }
        System.out.println();
    }
}