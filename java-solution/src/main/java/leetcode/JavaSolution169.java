package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class JavaSolution169 {

    /**
     * Given an array nums of size n, return the majority element.
     * <p>
     * The majority element is the element that appears more than ⌊n / 2⌋ times.
     * You may assume that the majority element always exists in the array.
     * <p>
     * Follow-up: Could you solve the problem in linear time and in O(1) space?
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> mapOfElementAndCount = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!mapOfElementAndCount.containsKey(nums[i])) mapOfElementAndCount.put(nums[i], 1);
            else mapOfElementAndCount.put(nums[i], mapOfElementAndCount.get(nums[i]) + 1);
        }
        return mapOfElementAndCount.entrySet().stream().sorted((o1, o2) -> o2.getValue() - o1.getValue())
                .findFirst().get().getKey();

    }


}
