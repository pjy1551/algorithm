import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Backjoon2839 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int calc;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int temp = input / 3;
        int temp2 = input / 5;
        for (int i = 0; i <= temp; i++) {
            for (int j = 0; j <= temp2; j++) {
                calc = 3 * i + 5 * j;
                if (calc == input) {
                    list.add(i + j);
                }
            }
        }
        if (list.size() > 0) {
            System.out.println(Collections.min(list));
        } else {
            System.out.println(-1);
        }

    }

}
