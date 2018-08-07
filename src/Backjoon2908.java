import java.util.Scanner;

public class Backjoon2908 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int temp1 = Integer.parseInt(new StringBuilder(String.valueOf(a)).reverse().toString());
        int temp2 = Integer.parseInt(new StringBuilder(String.valueOf(b)).reverse().toString());
        
        int result = temp1 > temp2 ? temp1:temp2;
        System.out.println(result);
    }

}
