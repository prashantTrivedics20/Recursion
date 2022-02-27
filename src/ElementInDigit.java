import java.util.Scanner;

//. Write a program to find out and return the number of digits present in a number recursively.
//Sample Input 1 :
// 156
//Sample Output 1 :
//3
//Sample Input 2 :
// 7
//Sample Output 2 :
//1
public class ElementInDigit {
    public static int count(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int c=count(n/10);
        int cou=++c;
        return cou;
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int c=count(n);
        System.out.println(c);
    }
}
