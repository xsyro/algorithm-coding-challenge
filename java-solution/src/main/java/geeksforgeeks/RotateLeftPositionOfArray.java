package others;

/**
 * Ref:
 * https://www.geeksforgeeks.org/array-rotation/?ref=lbp
 */
public class RotateLeftPositionOfArray {

    /**
     * Given an array of integers arr[] of size N and an integer of position d, the task is to rotate the array elements to the left by d positions.
     * <p>
     * Examples:
     * <p>
     * Input:
     * arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
     * Output: 3 4 5 6 7 1 2
     * <p>
     * Input: arr[] = {3, 4, 5, 6, 7, 1, 2}, d=2
     * Output: 5 6 7 1 2 3 4
     *
     * using in-place logic
     *
     * @param arr
     * @param d
     */
    public void rotate(int[] arr, int d, int len) {

        for (int i = d-1; i > 0; i--) {
//            System.out.println("i: " + i + "  D: " + (arr.length-1-i));
            swap(arr, i, len-1-i);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


}
