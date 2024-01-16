package leetcode

import "strings"

var possibleParenthesis = map[string]string{
	"(": ")",
	")": "(",
	"[": "]",
	"]": "[",
	"{": "}",
	"}": "{",
}

// https://leetcode.com/problems/valid-parentheses
// "()[]{}"
//
//	func isValid(s string) bool {
//		if len(s) == 0 {
//			return true
//		}
//		split := strings.Split(s, "")
//		if possibleParenthesis[split[0]] != split[1] {
//			return false
//		} else {
//			return isValid(s[2:])
//		}
//		return false
//	}
func isValid(s string) bool {
	for strings.Contains(s, "[]") || strings.Contains(s, "()") || strings.Contains(s, "{}") {
		s = strings.ReplaceAll(s, "[]", "")
		s = strings.ReplaceAll(s, "()", "")
		s = strings.ReplaceAll(s, "{}", "")
	}
	return s == ""
}
