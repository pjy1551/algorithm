import java.util.Scanner;
import java.util.Stack;

public class Backjoon10828 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        sc.nextLine();
        int count = 0;
        String input;
        String tmep;
        while (true) {
            input = sc.nextLine();
            switch (input) {
            case "pop":
                if (stack.empty() == true) {
                    System.out.println("-1");
                    break;
                }
                System.out.println(stack.peek());
                stack.pop();
                break;
            case "size":
                System.out.println(stack.size());
                break;
            case "empty":
                if (stack.empty() == true) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
                break;
            case "top":
                if(stack.empty() == true) {
                    System.out.println("-1");
                }
                else {
                    System.out.println(stack.peek());
                }
                break;
            default : 
                tmep = input.replace("push ", "");
                stack.push(Integer.parseInt(tmep));
                break;
            }

            count++;
            if (count == a)
                break;
        }

    }

}
