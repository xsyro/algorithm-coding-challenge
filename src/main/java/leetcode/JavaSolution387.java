package leetcode;

import java.util.*;

public class JavaSolution387 {

    public static void main(String[] args) {
        System.out.println("Result is "+ firstUniqCharApproach1("leet"));
    }

    //Using O(n2) - Not so good
    static int firstUniqCharApproach1(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for(int j = 1; j < chars.length; j++) {
                System.out.printf("I:%d J:%d\n", i, j);
            }
        }
        return -1;
    }


    static int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            if(!characterSet.contains(chars[i])) {
                return i;
            }
            characterSet.add(chars[i]);
        }
        return -1;
    }

}
