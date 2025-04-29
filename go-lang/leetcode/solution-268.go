package leetcode

import "slices"

func missingNumber(nums []int) int {
	//LOL. There's a plot twist to the question.
	//1. Loop through the array in [0 <= len(nums)]
	//2. Find if the n of the current loop and check if the value exist, and if it doesn't return the value of n as the missing value of the array
	for n := 0; n <= len(nums); n++ {
		foundIndex := slices.Index(nums, n)
		if foundIndex == -1 {
			return n
		}
	}
	return 0
}
