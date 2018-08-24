import java.util.HashMap;
import java.util.Scanner;

public class Backjoon1157 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<Character, Integer>() {{ put('A', 0); put('B', 0); put('C', 0); put('D', 0); put('E', 0);
                                                                               put('F', 0); put('G', 0); put('H', 0); put('I', 0); put('J', 0);
                                                                               put('K', 0); put('L', 0); put('M', 0); put('N', 0); put('O', 0);
                                                                               put('P', 0); put('Q', 0); put('R', 0); put('S', 0); put('T', 0);
                                                                               put('U', 0); put('V', 0); put('W', 0); put('X', 0); put('Y', 0);
                                                                               put('Z', 0); }};
         
      String str = sc.nextLine().toUpperCase();
      char[] charArray = str.toCharArray();
      boolean isMultiValue = true;
      
      for(char ch : charArray) {
          for(Character key : map.keySet()) {
              if(ch == key) {
                  map.put(key, map.get(key)+1);
              }
          }
      }

      HashMap.Entry<Character, Integer> maxEntry = null;
      for(HashMap.Entry<Character, Integer> temp : map.entrySet()) {
          if(maxEntry != null && temp.getValue().compareTo(maxEntry.getValue()) == 0) {
              isMultiValue = true;
          }
          if(maxEntry == null || temp.getValue().compareTo(maxEntry.getValue()) > 0) {
              maxEntry = temp;
              isMultiValue = false;
          }
      }
      
      System.out.println(isMultiValue == true ? "?" : maxEntry.getKey());

    }

}
