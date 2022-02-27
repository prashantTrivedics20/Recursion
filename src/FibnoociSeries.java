import java.util.Scanner;

public class FibnoociSeries {
    public static int fib(int n)
    {
        if(n==0||n==1)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String args[])
    {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int fibres=fib(n);
        System.out.println(fibres);
    }
}
