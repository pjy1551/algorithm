import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Backjoon2309 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int sum = 0;
        int tempSum = 0;
        int a = 0;
        int b = 0;
        for(int i = 0; i < 9; i++) {
            list.add(sc.nextInt());
        }
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        
        for(int i = 0; i < list.size(); i++) {
          for(int j = i+1; j < list.size(); j++) {
              tempSum = 0;
              if(j != list.size()) {
                  tempSum = sum - ( list.get(i) + list.get(j) );
                  a = list.get(i);
                  b = list.get(j);
              }
               if ( tempSum == 100 ) {
                   list.remove((Integer)a);
                   list.remove((Integer)b);
              }
          }
        }
        list.sort(null);
        
        for(int str : list) {
            System.out.println(str);
        }
    }

}
