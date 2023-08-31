package leetcode;

public class Solution151 {
    public String reverseWords(String s) {
        String[] words = s.split("\\s");
        String[] newWord = new String[words.length];
        int c = 0;
        for (int i = words.length - 1; i >= 0; i--) {
            newWord[c] = words[i];
            c++;
        }

        StringBuilder strBuilder = new StringBuilder();
        for (String s1 : newWord) {
            if(s1.equals(" ") || s1.equals("")) continue;
            strBuilder.append(s1);
            strBuilder.append(" ");
        }
        return strBuilder.substring(0, strBuilder.length()-1);
    }
}
