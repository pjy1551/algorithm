import java.util.Scanner;

public class Backjoon1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp[] = new int[n * 3 + 1];

        temp[1] = 0;
        temp[2] = 1;
        temp[3] = 1;

        for (int i = 4; i <= n; i++) {
            temp[i] = 1000001;
        }

        for (int i = 0; i <= n; i++) {
            temp[i + 1] = Math.min(temp[i] + 1, temp[i + 1]);
            temp[i * 2] = Math.min(temp[i] + 1, temp[i * 2]);
            temp[i * 3] = Math.min(temp[i] + 1, temp[i * 3]);
        }

        System.out.println(temp[n]);
    }
}
