package recursionAssignment;

import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(count(sc.nextInt()));
    }
    private static int count(int n) {
        int sum = 0;
        if (n == 0) {
            return 1;
        }
        if (n >= 1) {
            sum += count(n-1);
        }
        if (n >= 2) {
            sum += count(n-2);
        }
        if (n >= 3) {
            sum += count(n-3);
        }
        return sum;
    }
}
