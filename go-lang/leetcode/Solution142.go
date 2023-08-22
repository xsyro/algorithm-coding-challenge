package leetcode

import (
	"regexp"
	"strings"
)

func removeSpecialChar(str *string) {
	nonAlphanumericRegex := regexp.MustCompile("[^a-zA-Z0-9]+")
	nonAlphanumericRegex.ReplaceAllString(*str, "")
	strings.ToLower(*str)
	strings.TrimSpace(*str)
}

func isPalindrome(s string) bool {
	removeSpecialChar(&s)
	var cleanStr []string
	cleanStr = strings.Split(s, "")
	var (
		i = 0
		j = len(cleanStr) - 1
	)
	for i < j {
		if cleanStr[i] != cleanStr[j] {
			return false
		}
		i++
		j--
	}
	return true
}
