package recursionAssignment;

import java.util.Scanner;

public class Question1 {
    public static StringBuffer replace1(StringBuffer str,char ch1,char ch2,int idx)
    {
        if(idx==str.length())
        {
            return str;
        }
        if(str.charAt(idx)==ch1)
        {
            str.replace(idx,idx+1, String.valueOf(ch2));
        }
        replace1(str,ch1,ch2,idx+1);
        return str;

    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        System.out.println("Enter the String");
        StringBuffer s=new StringBuffer(readme.nextLine());
        //System.out.println("Enter the character that you want to replace");
        char ch1='a';
        char ch2='x';
       StringBuffer string= replace1(s,ch1,ch2,0);
        System.out.println(string);
    }

}
