// print increasing of a function by using recursion...
import java.util.Scanner;

public class Recursion1 {
    public static void printIncreasing(int n)
    {
        if(n==0)
        {
            return;
        }
        printIncreasing(n-1);
        System.out.print(n);
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        printIncreasing(n);
    }
}
