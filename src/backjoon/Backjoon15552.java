package backjoon;
import java.io.*;

public class Backjoon15552 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int num = Integer.parseInt(br.readLine());
            int[] input = new int[num];

            for (int i = 0; i < num; i++) {
                String str = br.readLine();

                String[] temp = str.split(" ");
                int a = Integer.parseInt(temp[0]);
                int b = Integer.parseInt(temp[1]);

                bw.write(Integer.toString(a+b));
                bw.newLine();
            }
            bw.flush();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}