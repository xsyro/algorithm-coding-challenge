package leetcode

import (
	"strings"
)

func lengthOfLastWord(s string) int {
	split := strings.Split(s, " ")

	for i := len(split) - 1; i >= 0; i-- {
		if split[i] == " " || split[i] == "" {
			continue
		} else {
			return len(split[i])
		}
	}
	return 0
}
