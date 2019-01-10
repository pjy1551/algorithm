package backjoon;
import java.util.Arrays;
import java.util.Scanner;

public class Backjoon10809 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] alphabetArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] tempArray = new int[26];
        char[] charArray = new char[101];
        charArray = str.toCharArray();
        Arrays.fill(tempArray, -1);
        int index = 0;
        int number = 0;
        for(char array1 : charArray) {
            for(char array2 : alphabetArray) {
                if(array2 == array1 && tempArray[index] == -1) {
                    tempArray[index] = number;
                    
                    break;
                }
                index++;
            }
            index = 0;
            number++;
        }
        
        for(int i = 0; i < tempArray.length; i++) {
            System.out.print(tempArray[i] + " ");
        }

    }
}
