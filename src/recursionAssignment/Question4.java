package recursionAssignment;
public class Question4 {
    public static int steps(int n){
        if(n<=1)
            return 1;
        if(n==2)
            return 2;
        else
            return steps(n-3)+steps(n-2)+steps(n-1);
    }
    public static void main(String[] args) {
        System.out.println(steps(4));
    }
}