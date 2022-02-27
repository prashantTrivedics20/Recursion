// reverse array using recursion ....
import java.util.Scanner;

public class ArrayReverseUsingRecursion {
    public static void reverseArray(int arr[],int idx)
    {
        if(idx<0)
        {
            return;
        }
        System.out.println(arr[idx]);
        reverseArray(arr,idx-1);
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=readme.nextInt();
        }
        reverseArray(arr,arr.length-1);
    }
}
