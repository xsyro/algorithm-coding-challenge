package geeksforgeeks;

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
     * <p>
     * using in-place logic
     *
     * @param arr
     * @param d
     */
    public void rotate(int[] arr, int d, int len) {
        int j = len - 1;
        for (int i = 0; i < d; i++) {
//            System.out.printf("%d %d\n", i, j);
            swap(arr, len - 1 - i, i);
            j--;
        }

        for (int i : arr) {
            System.out.printf("%d,", i);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        RotateLeftPositionOfArray rotateLeftPositionOfArray = new RotateLeftPositionOfArray();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotateLeftPositionOfArray.rotate(arr, 2, arr.length);
    }


}
