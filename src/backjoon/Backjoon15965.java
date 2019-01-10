package backjoon;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Backjoon15965 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        int count = 1;
        int input = sc.nextInt();

        for (int i = 2; i > 0; i++) {
            for (int j = 0; list.size() > j; j++) {
                if (i % list.get(j) == 0) {
                    break; // 소수가 아닌 경우 pass
                }

                if (j + 1 == list.size()) { // 소수일 때
                    list.add(i);
                    count++;
                }
            }
            if (count == input) {
                break;
            }
        }
        System.out.println(list.get(input - 1));
    }

}
