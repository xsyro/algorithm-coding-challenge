package leetcode;


import java.math.BigDecimal;
import java.util.Arrays;

public class Solution66 {

    /**
     * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
     * The digits are ordered from most significant to least significant in left-to-right order.
     * The large integer does not contain any leading 0's.
     * <p>
     * Increment the large integer by one and return the resulting array of digits.
     *
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        StringBuilder stringBuffer = new StringBuilder();
        Arrays.stream(digits).forEach(stringBuffer::append);
        BigDecimal digitAdd = new BigDecimal(stringBuffer.toString()).add(new BigDecimal(1));
        String[] splitDigits = digitAdd.toString().split("");
        int[] newDigits = new int[splitDigits.length];
        for (int i = 0; i < splitDigits.length; i++) {
            newDigits[i] = Integer.parseInt(splitDigits[i]);
        }
        return newDigits;
    }
};
