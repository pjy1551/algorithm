package backjoon;
import java.util.ArrayList;
import java.util.Scanner;

public class Backjoon10817 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(scanner.nextInt());
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());

        list.sort(null);

        System.out.println(list.get(1));

    }
}
