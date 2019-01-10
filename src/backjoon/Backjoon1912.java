package backjoon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Backjoon1912 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count, result;
        int[] dp = new int[100001];
        Arrays.fill(dp, -12345);
        
        count = sc.nextInt();
        for(int i = 0; i < count; i++) {
            dp[i] = sc.nextInt();
        }
        result = dp[0];
        for(int i = 1; i <= count; i++) {
            dp[i] = Math.max(dp[i], dp[i] + dp[i-1]);
            result = Math.max(result, dp[i]);
        }
        System.out.println(result);
    }

}
