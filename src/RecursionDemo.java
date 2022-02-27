// with out using for loop (print decreasing of a given number using recursion.....)
import java.util.Scanner;
public class RecursionDemo {
    public static void printDecreasing(int n)
    {
        if(n==0)
        {
            return ;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        printDecreasing(n);
    }
}
