package backjoon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Backjoon1546 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<Double> list = new ArrayList<>();
        double sum = 0;
        
        for(int i = 0; i < count; i++) {
           list.add(sc.nextDouble());
        }
        // �ִ밪
        Double max = Collections.max(list);
        
        for(int i = 0; i< count; i++) {
            list.set(i, list.get(i) / max * 100);
            sum += list.get(i);
         }
        System.out.printf("%.2f", sum / list.size());

    }

}
