package recursionAssignment;

import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(checkPattern(sc.next(), 0));
    }
    private static boolean checkPattern(String str, int i) {
        if (str.charAt(0)!='a'&&i==0) {
            return false;
        }
        if(str.length()==1)
        {
            return true;
        }
        if (str.charAt(0) == 'a') {
            if (str.length() == 2) {
                if (!(str.charAt(1) == 'a')) {
                    return false;
                }
            }
            else{
                if (!(str.substring(1,3).equals("bb"))) {
                    return false;
                }
            }
        }

        if (str.substring(0,2).equals("bb")) {
            if (str.length() > 2 && str.charAt(2) != 'a') {
                return false;
            }
        }
        return checkPattern(str.substring(1), i + 1);
    }
}