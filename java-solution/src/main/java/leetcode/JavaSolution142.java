package leetcode;

public class JavaSolution142 {

    public boolean isPalindrome(String s) {
        boolean isValidPalindrome = true;
        char[] cleanStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().trim()
                .toCharArray();
        if(cleanStr.length < 2) return true;
        int i = 0, j = cleanStr.length-1;
        while (i < j) {
            if(cleanStr[i] != cleanStr[j]) {
                return false;
            }
            i++;
            j--;
        }

        return isValidPalindrome;
    }

}
