import java.util.Scanner;

public class Backjoon2441 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        for (int i = a; i > 0; i--) {
            for (int j = 1; j <= a; j++) {
                if(j+i <= a) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
