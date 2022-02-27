import java.util.ArrayList;
import java.util.Scanner;
// wap a program to print all the SubSequence of an String using recursion ..
public class GetSubSequence {
    public static ArrayList<String>gss(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String>bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
         char ch=str.charAt(0);//a
        //System.out.println(ch);
        String ros=str.substring(1);//bc
        ArrayList<String> rres=gss(ros);
       // System.out.println(ch);
       // System.out.println(rres);//[--,-b,b-,bc]
        ArrayList<String>myres=new ArrayList<>();
        for(String rstr:rres)
        {

            myres.add(""+rstr);

        }
        for(String rstr:rres)
        {
            myres.add(ch + rstr);
        }
        return myres;
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        String str=readme.nextLine();
        ArrayList<String> res=gss(str);
        System.out.println(res);
    }
}
