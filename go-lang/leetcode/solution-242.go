package leetcode

import (
	"strings"
)

func isAnagram(s string, t string) bool {
	isAnagm := false
	if len(s) != len(t) {
		return false
	}
	sArr := strings.Split(s, "")
	tArr := strings.Split(t, "")

	for _, item := range sArr {
		tArr, isAnagm = findAndRemoveItem(tArr, item)
		if !isAnagm {
			return isAnagm
		}
	}

	return isAnagm
}

func findAndRemoveItem(arr []string, item string) ([]string, bool) {
	for i := range arr {
		if arr[i] == item {
			//delete the item from the slice and
			return append(arr[:i], arr[i+1:]...), true
		}
	}
	return arr, false
}
