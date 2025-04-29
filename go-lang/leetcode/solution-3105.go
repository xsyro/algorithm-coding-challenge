package leetcode

// https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/
func longestMonotonicSubarray(nums []int) int {
	var maxLen int
	//check for increasing strictly
	for i := 0; i < len(nums); i++ {
		currentLength := 1
		for j := i + 1; j < len(nums); j++ {
			if nums[j] > nums[j-1] {
				currentLength++
			} else {
				break
			}
		}
		maxLen = max(currentLength, maxLen)
	}
	//check for decreasing strictly
	for i := 0; i < len(nums); i++ {
		currentLength := 1
		for j := i + 1; j < len(nums); j++ {
			if nums[j] < nums[j-1] {
				currentLength++
			} else {
				break
			}
		}
		maxLen = max(currentLength, maxLen)
	}
	return maxLen
}
