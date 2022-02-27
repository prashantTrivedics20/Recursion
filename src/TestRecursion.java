import java.util.Scanner;

public class TestRecursion {
    public static void Demo(String str)
    {
        if(str.length()==0)
        {
            return;
        }
        //char ch=str.charAt(0);
        //System.out.println(ch);
        //System.out.println(str);
        System.out.println(str);
        String s=str.substring(1);
        Demo(s);
        System.out.println(s);
        //System.out.println(str);
        //System.out.println(s+" ");

    }


    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        String s=readme.nextLine();
        Demo(s);
    }
}
