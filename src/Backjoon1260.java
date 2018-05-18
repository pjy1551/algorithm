import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Backjoon1260 {
    static int[][] graph; // �׷���
    static boolean visited[]; // �湮 ����
    static int N; // ����
    static int E; // ����
    static int startPoint; // ������ 
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        graph = new int[1001][1001]; 
        visited = new boolean[10001]; 
        N = sc.nextInt();
        E = sc.nextInt();
        startPoint = sc.nextInt();
        
        int a, b;
        
        for(int i = 1; i < E; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            
            graph[a][b] = graph[b][a] = 1;
        }
        System.out.println();
        dfs(startPoint);
        for(int j = 1; j <= N; j++) {
            visited[j] = false;
        }
        System.out.println();
        bfs(startPoint);
    }
    
    // DFS
    public static void dfs( int startPoint ) {
        visited[startPoint] = true;
        System.out.print(startPoint + " ");
        
        for(int j=1; j <= N; j++) {
            if(graph[startPoint][j] == 1 && visited[j] == false) {
                dfs(j);
            }
        }
    }
    
    // BFS
    public static void bfs( int startPoint ) {
        Queue<Integer> q = new LinkedList<Integer>();
        //  Java�� Queue �������̽������� ������ �� offer �޼��带 ����ϸ� ���� ���� ������ �ڷḦ ���� ���� poll �޼��带 ���
        q.offer(startPoint);
        visited[startPoint] = true;
        System.out.print(startPoint + " ");
        
        int temp;
        // empty(); : ����ִ��� �Ǻ�
        while(!q.isEmpty()) {
            temp = q.poll();
            for(int j = 0; j < N+1; j++) {
                if(graph[temp][j] == 1 && visited[j] == false) {
                    q.offer(j);
                    visited[j] = true;
                    System.out.print(j + " ");
                }
            }
        }
    }
    
    

}
