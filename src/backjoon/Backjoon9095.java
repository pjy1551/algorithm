package backjoon;
import java.util.Scanner;

public class Backjoon9095 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        for(int i = 0; i < count; i++) {
            int input = sc.nextInt();
            System.out.println(fib(input));
        }
    }
    public static int fib(int n) {
        int[] memo = new int[101]; 
        memo[0] = 1;
        memo[1] = 2;
        memo[2] = 4;
        for (int i = 3; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2] + memo[i - 3];
        }
        return memo[n-1];
    }
    
}
