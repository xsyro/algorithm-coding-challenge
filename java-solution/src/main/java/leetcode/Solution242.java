package leetcode;


public class Solution242 {
    /**
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     *
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
     * typically using all the original letters exactly once.
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] tComposedChars = new char[t.length()];
        char[] tRemainingChar = t.toCharArray();
        //fill the data
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if(t.indexOf(currentChar) < 0) return false;
            tComposedChars[i] = tRemainingChar[t.indexOf(currentChar)];
//            tRemainingChar[t.indexOf(currentChar)] = ' ';
        }
        System.out.printf("%s %s", s, String.valueOf(tComposedChars));
        return s.equals(String.valueOf(tComposedChars));
    }
}
