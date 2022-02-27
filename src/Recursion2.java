import java.util.Scanner;
// wap to print decreasing increasing
public class Recursion2 {
    public static void pdi(int n)
    {
        if(n==0)
    {
        return;
    }
    System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
       Scanner readme=new Scanner(System.in);
       int n=readme.nextInt();
       pdi(n);
    }
}
