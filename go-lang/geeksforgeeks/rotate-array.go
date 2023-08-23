package geeksforgeeks

// RotateArr
// Ref URL: https://www.geeksforgeeks.org/array-rotation
// Given an array of integers arr[] of size N and an integer of position d, the task is to rotate the array elements to the left by d positions.
// <p>
// Examples:
// <p>
// Input:
// arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
// Output: 3 4 5 6 7 1 2
// <p>
// Input: arr[] = {3, 4, 5, 6, 7, 1, 2}, d=2
// Output: 5 6 7 1 2 3 4
//
// using in-place logic
//
// @param arr
// @param d
//
func RotateArr(arr []int, d int, len int) []int {
	tmp := arr[:d]
	arr = arr[d:len]
	for _, v := range tmp {
		arr = append(arr, v)
	}
	return arr
}
