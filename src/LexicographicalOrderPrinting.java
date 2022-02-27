// write a program to print the number in lexicografic from...
import java.util.Scanner;
public class LexicographicalOrderPrinting {
    public static void dfs(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.println(i);
        for (int j = 0; j <10 ; j++) {// after first call j=0, i becomes  i=100,i=10,i=1, in stack,when j=1
                                     // stack
                                    //  i=100  check for second call when j=1(condition false)
                                    //  i=10    ''   ''   ''''(condition false)
                                    // i= 1     ''   ''' ''' ''(condition true)
            ///  similarly it will happen......
            dfs(10*i+j,n);
        }
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        // code
        for (int i = 1; i <=9 ; i++) {
            dfs(i,n);
        }
    }
}
