import java.util.Scanner;
public class MaxOfArrayUsingRecursion {
    public static int maxElement(int []arr,int idx)
    {
      if(idx==arr.length-1)
      {
          return arr[idx];
      }
      int res=maxElement(arr,idx+1);
      if(res<arr[idx])
      {
          res=arr[idx];
      }
      return res;
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int []arr=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=readme.nextInt();
        }
        int maximum =maxElement(arr,0);
        System.out.println(maximum);

    }
}
