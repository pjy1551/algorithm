import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Backjoon1697 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 내위치
        int K = sc.nextInt(); // 동생위치
        int[] min = new int[100005]; // 가장 빠른 시간(초) 
        Arrays.fill(min, -1); // 초기 값을 다 -1로 설정
        int result = BFS(N, K, min); // 가장 빠른 시간 구하기
        System.out.println(result);
    }
    // 너비우선탐색
    public static int BFS(int N, int K, int[] min) {
        int nextN = N; // 이동한 위치
        int[] status = new int[3]; // 이동하는 3가지 상태 ( +1 / -1 / 2 )
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(nextN);
        min[nextN] = 0; // 최소값 : 0으로 시작!
        
        while(!queue.isEmpty() && nextN != K) {
            nextN = queue.poll();
            // 다음에 이동할 좌표들
            status[0] = nextN -1;
            status[1] = nextN +1;
            status[2] = nextN *2;
            
            for(int i = 0; i < 3; i++) {
                // 배열을 벗어나지 않았는지 확인
                if(status[i] >= 0 && status[i] <= 100000) {
                    // 이전에 방문했는지 확인( 방문 안한지점이 -1 )
                    if(min[status[i]] == -1) {
                        // 처음 간 곳이라면 큐에 넣고 상태를 전 위치값 +1을 해준다.
                        queue.add(status[i]);
                        min[status[i]] = min[nextN] + 1;
                    }
                }
            }
        }
        return min[K];
    }

}
