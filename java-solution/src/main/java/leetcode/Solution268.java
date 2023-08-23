package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution268 {

    public int missingNumber(int[] nums) {
        List<Integer> numsToList = new ArrayList<>(nums.length);
        List<Integer> newNumToList = new ArrayList<>(nums.length + 1);
        for(int i = 0; i < nums.length; i++) numsToList.add(nums[i]);
        for(int i = 0; i <= nums.length; i++) newNumToList.add(i);
        return newNumToList.stream().dropWhile(numsToList::contains).findFirst().get();
    }

}
