import java.util.Scanner;
public class PrintZicZac {
    public static void pzz(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println("pre"+n);
        pzz(n-1);
        System.out.println("in"+n);
        pzz(n-1);// here we are double recursive call
        System.out.println("post"+n);

    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        pzz(n);

    }
}
