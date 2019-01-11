package codeground;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeground1 {
    static int Answer;

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);


        int T = sc.nextInt();
        int test_case; 
        for(test_case = 0; test_case < T; test_case++) {
            Answer = 0;
            /////////////////////////////////////////////////////////////////////////////////////////////
            int inputCount = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < inputCount; i++) {
                list.add(sc.nextInt());
            }
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            
            for(Integer in: list) {
                Integer count = map.get(in);
                map.put(in,(count == null) ? 1: count+1);
            }
            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(entry.getValue() % 2 == 1) {
                    Answer = Answer ^ entry.getKey();
                }
            }
            /////////////////////////////////////////////////////////////////////////////////////////////


            // Print the answer to standard output(screen).
            System.out.println("Case #"+(test_case+1));
            System.out.println(Answer);
        }
    }
}