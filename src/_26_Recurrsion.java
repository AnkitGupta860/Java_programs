public class _26_Recurrsion {
    static int n1=0,n2=1,n3=0;
    static void Fibonacci_series(int n)
    {
        if(n>0)
        {
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.printf(" %d",n3);
            Fibonacci_series(n-1);
        }

    }
    public static void main(String[] args) {
        int n = 5;
        System.out.print(n1+" "+n2);
        Fibonacci_series(n-2);
    }
}
