// display od an array using recursion....
import java.util.Scanner;
public class DisplyArrayUsingRecursion {
    public static void displayArray(int []arr,int idx)
    {
        if(arr.length==idx)
        {
            return;
        }
        System.out.println(arr[idx]);
        displayArray(arr,idx+1);
//        displayArray(arr,idx+1);// line 11 and 12 if you want to print the reverse
//        System.out.println(arr[idx]);
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=readme.nextInt();
        }
        displayArray(arr,0);
    }
}
