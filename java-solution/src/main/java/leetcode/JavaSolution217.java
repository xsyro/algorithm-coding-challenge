package leetcode;

import java.util.HashSet;
import java.util.Set;

public class JavaSolution217 {

    /**
     * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> distinctInt = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(distinctInt.contains(nums[i])) {
                return true;
            }
            distinctInt.add(nums[i]);
        }
        return false;
    }

}
