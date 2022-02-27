import java.util.ArrayList;
import java.util.Scanner;
// keyPad Combnition Solution..../using recursion.........
public class keypadCombination {
    public static ArrayList<String>getKPC(String str)
    {
        if(str.length()==0)
        {
            ArrayList<String>bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch=str.charAt(0);//6
        String ros=str.substring(1);// recursion result...(6 words 78)
        ArrayList<String>rres=getKPC(ros);
        ArrayList<String>mres=new ArrayList<>();//24 words of 678
        String codeforch=codes[ch-'0'];
        for (int i = 0; i <codeforch.length() ; i++) {
            char chcode=codeforch.charAt(i);
            for(String rstr:rres)
            {
                mres.add(chcode+rstr);
            }
        }
        return mres;
    }
    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        String str=readme.nextLine();
        ArrayList<String>words=getKPC(str);
        System.out.println(words);
    }
}
