import java.util.Scanner;

public class Backjoon10039 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }
        for(int i = 0; i < 5; i++) {
            sum += array[i] > 40 ? array[i] : 40;
        }
        System.out.println(sum / 5);

    }

}
