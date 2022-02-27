import java.util.Scanner;
public class PrintZicZac1 {
    public static void pzz(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println("pre"+n);
        pzz(n-1);


    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        pzz(n);

    }
}
