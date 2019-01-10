package backjoon;
import java.util.Arrays;

public class Backjoon4673 {

    public static void main(String[] args) {
        int[] array = new int[10001];
        Arrays.fill(array, -1);
        int temp;
        for(int i = 0; i < array.length; i++) { 
            temp = i + ( i / 10000 ) +( (i / 1000) % 10 ) + ( (i / 100) % 10 ) + ( ( i / 10 ) % 10 ) +  (i % 10);
            if(temp <= 10000) {
                array[temp] = 0;    
            }
        }
        for(int i = 0; i < array.length; i++) {
            if(array[i] == -1){
                System.out.println(i);
            }
        }

    }

}
