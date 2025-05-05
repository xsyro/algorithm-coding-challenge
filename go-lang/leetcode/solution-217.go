package leetcode

import "slices"

// https://leetcode.com/problems/contains-duplicate
// 1. Approach Is inefficient for large exponential number
func containsDuplicate_Inefficient(nums []int) bool {
	for i, item := range nums {
		if slices.Contains(nums[(i+1):], item) {
			return true
		}
	}
	return false
}

func containsDuplicate(nums []int) bool {
	var records map[int]int = make(map[int]int)
	for _, num := range nums {
		currentCount, isExist := records[num]
		if isExist {
			return true
		}
		records[num] = currentCount + 1
	}
	return false
}
