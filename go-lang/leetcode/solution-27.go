package leetcode

import "slices"

// https://leetcode.com/problems/remove-element/
func removeElement(nums []int, val int) int {
	//for i := range nums {
	//	if nums[i] == val {
	//
	//	}
	//}
	nums = slices.DeleteFunc(nums, func(i int) bool {
		return val == i
	})
	return len(nums)
}
