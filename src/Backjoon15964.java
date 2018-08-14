import java.math.BigInteger;
import java.util.Scanner;

public class Backjoon15964 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(calc(a, b));
    }
    
    public static BigInteger calc(BigInteger a, BigInteger b) {
        BigInteger result;
        result = (a.add(b)).multiply((a.subtract(b)));
        return result;
    }
}
