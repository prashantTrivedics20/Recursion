import java.util.Scanner;
// print all the  occurrence of a perticular number of an array using recursion...
public class AllIndicesOfAnArray {
    public static int [] AllIndices(int []arr,int idx,int ele,int fsf) {
        if(idx==arr.length)
        {
            return new int[fsf];// here we are returning the anonymous array..
        }
        if(arr[idx]==ele)
        {
            int iarr[]=AllIndices(arr,idx+1,ele,fsf+1);
            iarr[fsf]=idx;
            return iarr;
        }
        else
        {
            int iarr[]= AllIndices(arr,idx+1,ele,fsf);
            return iarr;
        }
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in );
        int n=readme.nextInt();
        int []arr=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=readme.nextInt();
        }
        System.out.println("Enter the element that you want to check");
        int ele=readme.nextInt();
      int []arr1= AllIndices(arr,0,ele,0);
      if(arr1.length==0)
      {
          System.out.println();
          return;
      }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }

}
