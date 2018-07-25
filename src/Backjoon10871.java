import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Backjoon10871 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int a = sc.nextInt();
        List<Integer> temp = new ArrayList<>();
        
        for(int i = 0; i < count; i++) {
            temp.add(sc.nextInt());
        }
        
        List<Integer> list = temp.stream().filter(line -> a > line).collect(Collectors.toList());
        
        for(int i = 0; i < list.size(); i++ ) {
            System.out.print(list.get(i) + " ");
        }

    }

}
