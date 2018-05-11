import java.util.ArrayList;
import java.util.Scanner;

public class Backjoon1003 {
    static int temp[] = new int[41];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        temp [0] = 1;
        temp [1] = 1;
        
        for(int i = 0; i < count; i++) {
            int a = sc.nextInt();
            if(a == 0) {
                System.out.println("1 0");
            }
            else if (a == 1) {
                System.out.println("0 1");
            }
            else {
                fibonacci(a);
                System.out.println(temp[a-2] + " " + temp[a-1]);
            }
        }

    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return temp[n];
        } else {
            if (temp[n] > 0) {
                return temp[n];
            }
        }
        return temp[n] = fibonacci(n - 1) + fibonacci(n - 2);
    }
}
