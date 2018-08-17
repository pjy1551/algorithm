import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Backjoon2193 {

static BigInteger[] array = new BigInteger[100];
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Arrays.fill(array, BigInteger.valueOf(-1));
        int a = sc.nextInt();
        System.out.println(dp(a));
    }
    
    public static BigInteger dp(int input) {
        array[0] = BigInteger.valueOf(1);
        array[1] = BigInteger.valueOf(1);
        if(input >= 2) {
            for(int i = 2; i <= input; i++) {
                array[i] = array[i-1].add(array[i-2]);
            }
        }
        return array[input -1];
    }
}
