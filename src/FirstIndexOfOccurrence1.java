import java.util.Scanner;
//first index of occurrence in given array...
public class FirstIndexOfOccurrence1 {
    public static int  firstIndex(int []arr,int idx,int data)
    { if(idx==arr.length)
    {
        return -1;
    }
        if(arr[idx]==data)
        {
            return idx;
        }
        else
        {
            int fiisa=firstIndex(arr,idx+1,data);
            return fiisa;//common statement..
        }
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=readme.nextInt();
        }
        System.out.println("Enter the data element that you want to check");
        int d=readme.nextInt();
        int index= firstIndex(arr,0,d);
        System.out.println(index);



    }
}
