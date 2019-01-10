import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjoon2751 {
    public static int result[];
   
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine().trim());
        result = new int[N];
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine().trim());
        }
        mergeSort(0, N-1, arr);
        for(int i = 0; i <N; i++) {
            sb.append(result[i]+"\n");
        }
        System.out.println(sb);
    }
    // 병합정렬
    public static void mergeSort(int left, int right, int[] arr) {
        int mid;
        if(left < right) {
            mid = (left+right)/2;
            mergeSort(left, mid, arr);
            mergeSort(mid+1, right, arr);
            merge(left, mid, right, arr);
         }
    }
    // 머지하기
    public static void merge(int left, int mid, int right, int[] arr) {
        int l = left;
        int m = mid+1;
        int k = left;
        
        while(l <= mid || m <= right) {
            if(l <= mid && m <= right) {
                if(arr[l] <= arr[m]) {
                    result[k] = arr[l++];
                }
                else {
                    result[k] = arr[m++];
                }
            }else if (l <= mid && m > right) {
                result[k] = arr[l++];
            }else {
                result[k] = arr[m++];
            }
            k++;
        }
        for(int i = left; i < right+1; i++) {
            arr[i] = result[i];
        }
    }
}
