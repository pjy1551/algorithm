import java.util.ArrayList;
import java.util.Scanner;

public class Backjoon11721 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();

       while(true) {
           if(input.length() > 10) {
               System.out.println(input.substring(0, 10));
               input = input.substring(10);
           }
           else {
               System.out.println(input);
               break;
           }
       }
    }

}
