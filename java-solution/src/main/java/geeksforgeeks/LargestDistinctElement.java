package geeksforgeeks;

import java.util.Arrays;

/**
 * Reference
 * https://www.geeksforgeeks.org/find-the-largest-three-elements-in-an-array
 */
public class LargestDistinctElement {

    /**
     * Given an array with all distinct elements, find the largest three elements. Expected time complexity is O(n) and extra space is O(1).
     * <p>
     * Examples :
     * <p>
     * Input: arr[] = {10, 4, 3, 50, 23, 90}
     * Output: 90, 50, 23
     *
     * @param arr
     * @return
     */
    public int[] find3LargestElement(int[] arr) {
        int[] largestElements = new int[3];
        Arrays.sort(arr);
        int inc = 0;
        for (int i = 0; i < arr.length; i++) {
            if(inc <= 3) {
                if(true) {

                    inc++;
                }
            } else break;
        }
//        for (int i = arr.length - 1; i >= arr.length - 3; i--) {
//            System.out.println(arr[i]);
//            int prevElem = largestElements[j <= 0 ? 0 : j - 1];
//            if (prevElem != arr[i]) {
//                largestElements[j] = arr[i];
//            }
//            j++;
//        }
        return largestElements;
    }

    public static void main(String[] args) {
        LargestDistinctElement obj = new LargestDistinctElement();
        int[] arr = {12, 45, 1, -1, 45, 54, 23, 5, 0, -10};
        for (int i : obj.find3LargestElement(arr)) {
//            System.out.println(i);
        }
    }
}
