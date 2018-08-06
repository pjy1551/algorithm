import java.util.Arrays;
import java.util.Scanner;

public class Backjoon2579 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[301]; // 입력받는 배열
        int[] dp = new int[301]; // 최대값이 저장되어 있는 배열
        Arrays.fill(input, -1);
        Arrays.fill(dp, -1);
        
        int count = sc.nextInt();
        
        for(int i = 0; i < count; i++) {
            input[i] = sc.nextInt();
        }
        
        dp[0] = input[0];
        dp[1] = input[0] + input[1];
        dp[2] = Math.max(input[0] + input[2], input[1] + input[2]);
        
        for(int i = 3; i < dp.length; i++ ) {
            dp[i] = Math.max(input[i] + dp[i-2], input[i] + dp[i-3] + input[i-1]);
        }
        
        System.out.println(dp[count-1]);
        

    }

}
