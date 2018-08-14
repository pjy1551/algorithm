import java.util.Arrays;
import java.util.Scanner;

public class Backjoon11724 {
    
    public static int[] vertex  = new int[1001];
    public static int[][] edge = new int[1001][1001];
    public static int N, M;
    

    public static void main(String args[]) {
        Arrays.fill(vertex, 0);
        for(int[] row: edge) {
            Arrays.fill(row, 0);
        }
        
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        for(int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            edge[a][b] = 1;
            edge[b][a] = 1;
        }
        int count = 0;
        for(int i = 1; i <= N; i++) {
            if(vertex[i] == 0) {
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }
    
    public static void dfs(int v) {
        vertex[v] = 1;
        for(int i = 1; i <= N; i++) {
            if(edge[v][i] == 1 && vertex[i] == 0) {
                dfs(i);
            }
        }
    }
    
    
}
