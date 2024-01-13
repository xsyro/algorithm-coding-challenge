package leetcode

import (
	"strings"
)

func ReverseWords(s string) string {
	words := strings.Split(s, " ")
	newWords := make([]string, len(words))
	c := 0
	for i := len(words) - 1; i >= 0; i-- {
		if words[i] == "" || words[i] == " " {
			continue
		}
		newWords[c] = words[i]
		c++
	}
	return strings.TrimRight(strings.Join(newWords, " "), " ")
}
