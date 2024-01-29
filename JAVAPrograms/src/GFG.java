public class GFG {
    int N;
    public GFG(int N){
        this.N=N;

    }
    public static void findAbsolute(int N)
        {

            if (N < 0)
            {
                N = (-1) * N;
            }
            System.out.printf("%d ", N);
        }

    }


