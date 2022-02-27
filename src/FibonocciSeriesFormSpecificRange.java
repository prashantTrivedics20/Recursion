import java.util.ArrayList;
import java.util.Scanner;
public class FibonocciSeriesFormSpecificRange {
    public static int fib(int n)
    {
        if(n==0||n==1)
        {
            return n;
        }
        return fib(n-2)+fib(n-1);
    }
    public static void main(String args[])
    {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        for ( int i = 0; i <=n; i++) {
            int fibres=fib(i);
            System.out.println(fibres);
        }
    }
}
