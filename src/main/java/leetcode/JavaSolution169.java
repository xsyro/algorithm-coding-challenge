package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JavaSolution169 {

    /**
     * Given an array nums of size n, return the majority element.
     *
     * The majority element is the element that appears more than ⌊n / 2⌋ times.
     * You may assume that the majority element always exists in the array.
     *
     * Follow-up: Could you solve the problem in linear time and in O(1) space?
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        Set<Integer> setNumber = new HashSet<>();
        if(nums.length == 1) return nums[0];

        for (int num : nums) {
            if(setNumber.contains(num)) continue;
            setNumber.add(num);
        }
        for (Integer integer : setNumber) {
            if(isMajority(integer)) return integer;
        }
        return -1;
    }

    private boolean isMajority(int n) {
        return n % 2 == 0;
    }

}
