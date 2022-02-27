// print the last index of the array using the recursion...
import java.util.Scanner;

public class LastIndexOccurrence {
    public static int lastIndex(int[]arr,int idx,int data)
    {
        if(idx==arr.length)
        {
            return -1;
        }
        int liisa=lastIndex(arr,idx+1,data);
        if(liisa==-1)
        {
            if(arr[idx]==data)
            {
                return idx;
            }
            else
            {
                return -1;
            }
        }
        else {
            return liisa;
        }
    }
    public static void main(String[] args) {
        Scanner readme = new Scanner(System.in);
        int n = readme.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = readme.nextInt();
        }
        System.out.println("Enter the data element that you want to check");
        int d = readme.nextInt();
        int index = lastIndex(arr, 0, d);
        System.out.println(index);
    }
}
