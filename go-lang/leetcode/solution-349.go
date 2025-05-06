package leetcode

import "slices"

//https://leetcode.com/problems/move-zeroes
func intersection(nums1 []int, nums2 []int) []int {
	var numSet1, numSet2, intersection []int
	for _, item := range nums1 {
		if !slices.Contains(numSet1, item) {
			numSet1 = append(numSet1, item)
		}
	}
	for _, item := range nums2 {
		if !slices.Contains(numSet2, item) {
			numSet2 = append(numSet2, item)
		}
	}
	for _, item := range numSet1 {
		if slices.Contains(numSet2, item) {
			intersection = append(intersection, item)
		}
	}
	return intersection
}
