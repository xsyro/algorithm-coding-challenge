package leetcode

import (
	"regexp"
	"strings"
)

// https://leetcode.com/problems/valid-palindrome
func isPalindrome(s string) bool {
	s = regexp.MustCompile(`[^A-z]+`).ReplaceAllString(strings.ToLower(s), "")
	i := 0
	j := len(s) - 1

	for i < j {
		if string(s[i]) != string(s[j]) {
			return false
		}
		i++
		j--
	}
	return true
}
