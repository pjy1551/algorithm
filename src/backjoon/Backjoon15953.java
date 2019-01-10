package backjoon;
import java.util.ArrayList;
import java.util.Scanner;

public class Backjoon15953 {
    public static ArrayList<Integer> list2017 = new ArrayList<Integer>();
    public static ArrayList<Integer> list2018 = new ArrayList<Integer>();

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int a = 0;
        int b = 0;

        addList("2017", 5000000, 1);
        addList("2017", 3000000, 2);
        addList("2017", 2000000, 3);
        addList("2017", 500000, 4);
        addList("2017", 300000, 5);
        addList("2017", 100000, 6);
        addList("2018", 5120000, 1);
        addList("2018", 2560000, 2);
        addList("2018", 1280000, 4);
        addList("2018", 640000, 8);
        addList("2018", 320000, 16);
        
        for ( int i = list2017.size(); i < 100; i++) {
            list2017.add(0);
        }
        for ( int i = list2018.size(); i < 64; i++) {
            list2018.add(0);
        }


        for (int i = 0; i < count; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            
            if ( a <= 21 && b <= 31 && a > 0 && b > 0) {
                System.out.println(list2017.get(a-1) + list2018.get(b-1));
            }
            else if( (a <= 21 && b > 31 && a > 0) || ( b <= 0 && a > 0) ) {
                b = 0;
                System.out.println(list2017.get(a-1));
            }
            else if( (a > 21 && b <= 31 && b > 0) || ( a <= 0 && b > 0)){
                a  = 0;
                System.out.println(list2018.get(b-1));
            }
            else {
                a = 0;
                b = 0;
                System.out.println(0);
            }

        }
    }

    public static void addList(String year, int reward, int count) {
        for (int i = 0; i < count; i++) {
            if (year.equals("2017")) {
                list2017.add(reward);
            }
            else {
                list2018.add(reward);
            }
        }

    }

}
