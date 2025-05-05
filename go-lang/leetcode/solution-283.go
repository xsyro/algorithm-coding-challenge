package leetcode

// https://leetcode.com/problems/move-zeroes/
func moveZeroes(nums []int) {
	//using in-place, move the non-zeros to the end of the item
	//simply using brutal-force loop to cross verify the location and value of each inde
	for i := 0; i < len(nums); i++ {
		for j := i + 1; j < len(nums); j++ {
			prev := nums[i]
			if nums[i] == 0 {
				nums[i] = nums[j]
				nums[j] = prev
			}
		}
	}
}
