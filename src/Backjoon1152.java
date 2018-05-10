import java.util.Scanner;

public class Backjoon1152 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] worlds = a.split("\\s");
        int count = 0;
        for (String result : worlds) {
            count++;
            if (result.equals(""))
                count--; 
        }
        System.out.println(count);

	}

}
