package leetcode;

public class JavaSolution387 {

    /**
     * Given a string of @str, find the first non-repeating character in it and return its index.
     * If it does not exist, return -1
     *
     * @param str
     * @return {@index}
     */
    public Integer firstUniqChar(String str) {
        char[] chars = str.toCharArray();
        for (int left = 0; left < chars.length; left++) {
            String subStrRight = str.substring(left + 1, chars.length);
            String subStrLeft = str.substring(0, left);
            String currentChar = String.valueOf(chars[left]);
            if(!subStrRight.contains(currentChar) && !subStrLeft.contains(currentChar)) {
                return left;
            }
        }
        return -1;
    }

}
