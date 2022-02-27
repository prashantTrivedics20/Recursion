import java.util.ArrayList;
import java.util.Scanner;
public class Question3 {
    public static int convertor(String s,int n)
    {
        if(n==0)
        {
            return 0;
        }
        int power=(int)Math.pow(10,(n-1))*(s.charAt(0)-'0');
        int con=convertor(s.substring(1),n-1);
        return power+con;
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        String s=readme.nextLine();
        int n=s.length();
        System.out.println(convertor(s,n));
    }
}
