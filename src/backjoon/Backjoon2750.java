package backjoon;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Backjoon2750 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < number; i++) {
            list.add(sc.nextInt());
        }
        list.sort(null);
        List<Integer> duplicateRemoveList = new ArrayList<Integer>(new LinkedHashSet<Integer>(list));
        
        for(int j = 0; j < duplicateRemoveList.size(); j++) {
            System.out.println(duplicateRemoveList.get(j));
        }
    }

}
