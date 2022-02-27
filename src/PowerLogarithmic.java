// Calculate the power Logarithmic using recursion (in less time complexity)
import java.util.Scanner;
public class PowerLogarithmic {
    public static int powerLogarithmic(int x,int n)
    {
       if(n==0)
       {
           return 1;
       }
//        if(n%2==0)
//        {
//            int xpnb2=powerLogarithmic(x,n/2);
//            int xn=xpnb2*xpnb2;
//            return xn;
//        }
//        else
//        {
//            int xpnb2=powerLogarithmic(x,n/2);
//            int xn=xpnb2*xpnb2;
//            return xn*x;
//        }
        int xpnb2=powerLogarithmic(x,n/2);
        int xn=xpnb2*xpnb2;
        if(n%2==1)
        {
            xn=xn*x;
        }
        return xn;
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int x=readme.nextInt();
        int n=readme.nextInt();
        int p=powerLogarithmic(x,n);
        System.out.println(p);
    }
}
