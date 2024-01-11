package leetcode

import (
	"slices"
)

// https://leetcode.com/problems/merge-sorted-array
func merge(nums1 []int, m int, nums2 []int, n int) {
	for y := 0; y < n; y++ {
		x := m + y
		nums1[x] = nums2[y]
	}
	slices.SortFunc(nums1, func(a, b int) int {
		return a - b
	})
}
