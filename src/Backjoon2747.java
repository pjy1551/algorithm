import java.util.ArrayList;
import java.util.Scanner;

public class Backjoon2747 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        ArrayList<Long> list = new ArrayList<Long>();
        
        list.add((long)0);
        list.add((long)1);
        
        for(int i = 2; i <= input; i++) {
            list.add(i, list.get(i-1) + list.get(i-2));
        }
        System.out.println(list.get(input));

    }
}
