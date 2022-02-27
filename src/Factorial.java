import java.util.Scanner;
// wap a program to find the factorial of a given number using recursion
public class Factorial {
    public static int  factorial(int n) {
        if(n==1)
            return 1;
         int fnm1=factorial(n-1);
        //System.out.println(n);
        //System.out.println(fnm1);
        int fn=n*fnm1;
        return fn;
    }
    public static void main(String[] args) {
       Scanner readme=new Scanner(System.in);
       int n=readme.nextInt();
      int f=factorial(n);
        System.out.println(f);
        System.out.println( factorial(n));

    }
}
