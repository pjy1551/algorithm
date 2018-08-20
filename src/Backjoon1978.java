import java.util.ArrayList;
import java.util.Scanner;

public class Backjoon1978 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        for (int i = 0; i < a; i++) {
            if (primeNumberYN(sc.nextInt())) 
                count++;
        }
        System.out.println(count);
    }

    public static boolean primeNumberYN(int input) {
        boolean result = false;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        
        if(input == 1) {
            return false;
        }
        
        if(input == 2) {
            return true;
        }
        
        for(int i = 2; i <= input; i++) {
            for( int j = 0; j < list.size(); j++) {
                if(i % list.get(j) == 0) {
                    break;
                }
                if(j+1 == list.size()) {
                    list.add(i);
                }
                result = list.get(list.size()-1) == input ? true : false;  
            }
        }
        
        return result;
    }

}
