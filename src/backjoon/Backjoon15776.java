package backjoon;
import java.util.ArrayList;
import java.util.Scanner;

public class Backjoon15776 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        sc.nextLine();
        String input2 = sc.nextLine();
        boolean check = true;
        int S = 0;
        int L = 0;
        
        
        String[] list = new String[1000001];
        list = input2.split("");
        
        for (int i = 0; i < list.length; i++) {
            if(list[i].equals("0") && check == true) {
                S = i;
                check = false;
            }
            if(list[i].equals("0")) {
                L += 1;
            }
        }
        System.out.println(S + " " + L);

    }

}
