import java.util.Scanner;

public class Backjoon15904 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] charArray = str.toCharArray();
        int idx = 0;
        char[] UCPCArray = { 'U', 'C', 'P', 'C'};
         
        for(int i = 0; i < charArray.length; i++) {
            if ( Character.isLowerCase(charArray[i]) == true ) {
                charArray[i] = ' ';
            }
        }
        for(int i = 0; i < charArray.length; i++) {
            if(idx == 4) {
                break;
            }
            if(charArray[i] == UCPCArray[idx]) {
                idx++;
            }
        }
        
        if(idx == 4) {
            System.out.println("I love UCPC");
        }
        else {
            System.out.println("I hate UCPC");
        }
    }

}
