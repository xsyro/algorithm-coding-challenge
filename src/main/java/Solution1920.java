public class Solution1920 {

    public static void main(String[] args) {
        int[] ints = new Solution1920().buildArray(new int[]{5, 0, 1, 2, 3, 4});
        for (int anInt : ints) {
            System.out.print(anInt);
        }
    }

    /*
     * Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
     * A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
     */
    public int[] buildArray(int[] nums) {
        int prevPosition = nums[0];
        for (int position = 0; position < nums.length; position++) {
            int num = nums[position];

        }
        return nums;
    }
}
