import java.util.Scanner;
// calculate the power of pow(a,b) using recursion.....
public class Power {
    public static int power(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int xnm1=power(x,n-1);
        int xn=x*xnm1;
        return xn;
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int x=readme.nextInt();
        int n=readme.nextInt();
        int p=power(x,n);
        System.out.println(p);
    }
}
