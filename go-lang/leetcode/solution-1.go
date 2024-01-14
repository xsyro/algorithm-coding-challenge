package leetcode

func twoSum(nums []int, target int) []int {
	var resultArr = make([]int, 0, 2)
	iterationMap := map[int]int{}
	for i := range nums {
		rNums := target - nums[i]
		c, ok := iterationMap[rNums]
		if !ok {
			iterationMap[nums[i]] = i
			rNums = 0
		} else {
			resultArr = append(resultArr, c, i)
			return resultArr
		}
	}
	return resultArr

}
