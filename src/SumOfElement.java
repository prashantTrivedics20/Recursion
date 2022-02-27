import java.util.Scanner;

public class SumOfElement {
    public static int sum(int []arr,int idx)
    {
        if(idx==0)// base case
        {
            return arr[idx];
        }
        int rsum=sum(arr,idx-1);
        int myres=rsum+arr[idx];
        return myres;

    }

    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=readme.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=readme.nextInt();
        }
        int array=sum(arr,arr.length-1);
        System.out.println("sum->="+array);
    }
}
