import java.util.ArrayList;
import java.util.Scanner;

public class Backjoon15903 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int cardCount = scanner.nextInt();
        int sumCount = scanner.nextInt();
        
        int result = 0;
        int temp;
        for(int i = 0; i < cardCount; i++) {
            list.add(scanner.nextInt());
        }
        for(int j = 0; j < sumCount; j++) {
            list.sort(null);
            temp = list.get(0) + list.get(1);
            list.set(0, temp);
            list.set(1, temp);
        }
        result = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(result);

    }

}
