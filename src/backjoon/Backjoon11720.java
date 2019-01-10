package backjoon;
import java.util.Scanner;

public class Backjoon11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        
        int[] intArray = new int[101];
        String str = sc.next();
        int strLength = str.length();
        int result = 0;
        
        for(int i=0; i < count; i++) {
            result += Character.getNumericValue(str.charAt(i));
        }
        
        System.out.println(result);

    }

}
