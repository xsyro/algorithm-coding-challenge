package leetcode;

public class JavaSolution26 {

    public void inPlaceSwap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
