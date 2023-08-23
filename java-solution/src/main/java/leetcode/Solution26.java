package leetcode;

public class Solution26 {

    public void inPlaceSwap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
