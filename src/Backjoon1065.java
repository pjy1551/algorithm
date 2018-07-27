import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Backjoon1065 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 99;
        if(number < 100) {
            System.out.println(number);
        }
        else {
            for(int i = 100; i <= number; i++) {
                if(checkHANSU(i)) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
    }
    public static boolean checkHANSU(int input) {
        boolean result = true;
        List<Integer> list = new ArrayList<Integer>();

        for(String s : Arrays.asList(String.valueOf(input).split(""))) {
            list.add(Integer.valueOf(s));
        }
        if((list.get(0) - list.get(1)) == list.get(1) - list.get(2)) {
            return true;
        }
        else {
            return false;
        }
    }

}
