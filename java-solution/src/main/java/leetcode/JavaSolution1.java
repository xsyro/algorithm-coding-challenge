package leetcode;

import java.util.HashMap;
import java.util.Map;

//TODO
public class JavaSolution1 {

    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] sumResult = new int[2];
        Map<Integer, Integer> integerHashMap = new HashMap<>();
        for (int i = nums.length-1; i >= 0; i--) {
            integerHashMap.put(i, nums[i]);
        }
        integerHashMap.keySet().stream().sorted().forEach(integer -> {

        });
        for (int i = 0; i < nums.length; i++) {
            if((integerHashMap.get(i) + nums[i]) == target) {
                sumResult[0] = i;
                sumResult[1] = 1;

                return sumResult;
            }
        }
        return sumResult;
    }
}
