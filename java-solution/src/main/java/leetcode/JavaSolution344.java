package leetcode;

public class JavaSolution344 {

    /**
     * Write a function that reverses a string. The input string is given as an array of characters s.
     * You must do this by modifying the input array in-place with O(1) extra memory.
     *
     * @param s
     */
    public static void reverseString(char[] s) {
        for (int begin = 0; begin < s.length; begin++) {
            for (int end = s.length - 1; end >= 0; --end) {
                System.out.printf("%d %d\n", begin, end);

            }
        }
    }

    public static void main(String[] args) {
        char[] chars = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString(chars);
    }


}
