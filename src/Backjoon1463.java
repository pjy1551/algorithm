import java.util.Scanner;

public class Backjoon1463 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int d[] = new int[n*3+1];
		for(int i=4; i<=n;i++) {
			d[i] = 1000001;
		}
		d[1] = 0;
		d[2] = 1;
		d[3] = 1;
		for(int i=1;i<=n;i++) {
			d[i+1] = Math.min(d[i]+1,d[i+1]);
			d[i*2] = Math.min(d[i]+1,d[i*2]);
			d[i*3] = Math.min(d[i]+1, d[i*3]);
		}
		
		System.out.println(d[n]);

	}
}
