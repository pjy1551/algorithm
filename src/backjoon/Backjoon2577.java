package backjoon;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Backjoon2577 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String sum = String.valueOf(a*b*c);
        List<String> list = Arrays.asList(sum.split(""));
        int out0, out1, out2, out3, out4, out5, out6, out7, out8, out9;
        out0 = out1 = out2 = out3 = out4 = out5 = out6 = out7 = out8 = out9 = 0;
        
        for(String str : list) {
            if(str.equals("0"))
                out0++;
            if(str.equals("1"))
                out1++;
            if(str.equals("2"))
                out2++;
            if(str.equals("3"))
                out3++;
            if(str.equals("4"))
                out4++;
            if(str.equals("5"))
                out5++;
            if(str.equals("6"))
                out6++;
            if(str.equals("7"))
                out7++;
            if(str.equals("8"))
                out8++;
            if(str.equals("9"))
                out9++;
        }
        System.out.println(out0);
        System.out.println(out1);
        System.out.println(out2);
        System.out.println(out3);
        System.out.println(out4);
        System.out.println(out5);
        System.out.println(out6);
        System.out.println(out7);
        System.out.println(out8);
        System.out.println(out9);
    }

}
