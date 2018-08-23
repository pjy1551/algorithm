import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Backjoon10845 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<Integer>();
        int count = sc.nextInt();
        String command;
        int temp;
        for(int i = 0; i < count; i++) {
            command = sc.next();
            switch(command) {
            case "push" : 
                temp = sc.nextInt();
                q.add(temp);
                break;
            case "pop" : 
                temp = q.isEmpty() == true ? -1 : q.poll();
                System.out.println(temp);
                break;
            case "size" : 
                System.out.println(q.size());
                break;
            case "empty" :
                System.out.println(q.isEmpty() == true ? 1 : 0);
                break;
            case "front" : 
                System.out.println(q.isEmpty() == true ? -1 : q.peek());
                break;
            case "back" :
                Object[] array = q.toArray();
                System.out.println(q.isEmpty() == true ? -1 : array[array.length-1]);
                break;
            default:
                break;
            }
        }
    }

}
