import java.util.ArrayList;
import java.util.Scanner;

public class Backjoon15903 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Long> list = new ArrayList<Long>();
        
        int cardCount = scanner.nextInt();
        int sumCount = scanner.nextInt();
        
        long result = 0;
        long temp;
        for(int i = 0; i < cardCount; i++) {
            list.add(scanner.nextLong());
        }
        for(int j = 0; j < sumCount; j++) {
            if(list.size() >= 2) {
                list.sort(null);
                temp = list.get(0) + list.get(1);
                list.set(0, temp);
                list.set(1, temp);
            }
            else {
                temp = list.get(0);
                break;
            }
        }
        result = list.stream().mapToLong(Long::longValue).sum();
        System.out.println(result);
    }

}
