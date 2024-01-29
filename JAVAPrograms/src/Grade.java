import java.util.Scanner;
public class Grade {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Five Subject Marks :");
        int m1 = input.nextInt();
        int m2 = input.nextInt();
        int m3 = input.nextInt();
        int m4 = input.nextInt();
        int m5 = input.nextInt();
        int tot = m1+m2+m3+m4+m5;
        float per = tot/5;
        System.out.println("Total :"+tot);
        System.out.println("Percentage :"+per);
        if(per>=90)
            System.out.println("Grade A");
        else if(per>=70)
            System.out.println("Grade B");
        else if(per>=50)
            System.out.println("Grade C");
        else if(per>=30)
            System.out.println("Grade D");
        else
            System.out.println("Grade F");
    }
}
