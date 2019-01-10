package backjoon;
import java.util.ArrayList;
import java.util.Scanner;

public class Backjoon9012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int a = 0;
        sc.nextLine();
        
        while (true) {
            String input = sc.nextLine();
            ArrayList<String> list = new ArrayList<String>();
            String[] st = new String[51];
            st = input.split("");
            int i;
            for (i = 0; i < st.length; i++) {
                list.add(st[i].toString());
            }
            if(calc(list) == true) {
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
            a++;
            if(count == a) break; 
        }

    }

    public static boolean calc(ArrayList<String> input) {
        boolean result = true;
        for (int i = 0; i < input.size(); i++) {
            if (i < input.size()-1 && input.get(i).equals("(") && input.get(i + 1).equals(")")) {
                input.remove(i);
                input.remove(i);
                if (input.size() > 0) {
                    calc(input);
                }
            }
        }
        if(input.size() > 0) {
            result = true;
        }
        else {
            result = false;
        }

        return result;
    }

}
