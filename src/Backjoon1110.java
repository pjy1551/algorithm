import java.util.Scanner;

public class Backjoon1110 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = 0;
        int compareNumber = 0;
        int a = 0;
        int b = 0;
        compareNumber = input;
        while(true) {
            a = compareNumber / 10;
            b = compareNumber % 10;
            
            compareNumber = (b * 10) + (( a + b ) % 10);
            count ++;
            if(input == compareNumber) {
                break;
            }
        }
        
        System.out.println(count);

    }

}
