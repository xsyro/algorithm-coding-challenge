package leetcode

import (
	"sort"
)

// https://leetcode.com/problems/majority-element
func majorityElement(nums []int) int {
	itemCount := map[int]int{}
	for i := range nums {
		currentCount, isExist := itemCount[nums[i]]
		if isExist {
			itemCount[nums[i]] = currentCount + 1
		} else {
			itemCount[nums[i]] = 1
		}
	}

	keys := make([]int, 0, len(itemCount))
	for k := range itemCount {
		keys = append(keys, k)
	}

	sort.SliceStable(keys, func(i, j int) bool {
		return itemCount[keys[i]] > itemCount[keys[j]]
	})

	return keys[0]
}
