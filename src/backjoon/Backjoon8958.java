package backjoon;
import java.util.Scanner;

public class Backjoon8958 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        
        for(int i = 0; i < a; i++) {
            String str = sc.next();
            char[] charArray = str.toCharArray();
            int count = 0;
            
            for(char ch: charArray) {
                if(ch == 'O') {
                    count++;
                    sum += count;
                }
                else {
                    count = 0;
                }
            }
            System.out.println(sum);
            sum = 0;
        }

    }

}
