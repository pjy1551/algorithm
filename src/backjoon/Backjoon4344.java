package backjoon;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Backjoon4344 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt();
        double b = 0.000;
        
        for( int i = 0; i < a; i++) {
            List<Double> list = new ArrayList<>();
            b = sc.nextInt();
            double sum = 0;
            double index2 = 0;
            double result = 0.000;
            double count = 0.000;
            for(int j = 0; j < b; j++) {
               list.add(sc.nextDouble());
               sum = sum + list.get(j);
               index2++;
            }
            result = sum / index2;
            
            for(int k=0; k < b; k++) {
                if(result < list.get(k)) {
                    count++;
                }
            }
            result = count / list.size() * 100.00f;
            System.out.printf("%.3f", result);
            System.out.println("%");
            
        }
    }
}
