import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Backjoon1697 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // ����ġ
        int K = sc.nextInt(); // ������ġ
        int[] min = new int[100005]; // ���� ���� �ð�(��) 
        Arrays.fill(min, -1); // �ʱ� ���� �� -1�� ����
        int result = BFS(N, K, min); // ���� ���� �ð� ���ϱ�
        System.out.println(result);
    }
    // �ʺ�켱Ž��
    public static int BFS(int N, int K, int[] min) {
        int nextN = N; // �̵��� ��ġ
        int[] status = new int[3]; // �̵��ϴ� 3���� ���� ( +1 / -1 / 2 )
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(nextN);
        min[nextN] = 0; // �ּҰ� : 0���� ����!
        
        while(!queue.isEmpty() && nextN != K) {
            nextN = queue.poll();
            // ������ �̵��� ��ǥ��
            status[0] = nextN -1;
            status[1] = nextN +1;
            status[2] = nextN *2;
            
            for(int i = 0; i < 3; i++) {
                // �迭�� ����� �ʾҴ��� Ȯ��
                if(status[i] >= 0 && status[i] <= 100000) {
                    // ������ �湮�ߴ��� Ȯ��( �湮 ���������� -1 )
                    if(min[status[i]] == -1) {
                        // ó�� �� ���̶�� ť�� �ְ� ���¸� �� ��ġ�� +1�� ���ش�.
                        queue.add(status[i]);
                        min[status[i]] = min[nextN] + 1;
                    }
                }
            }
        }
        return min[K];
    }

}
