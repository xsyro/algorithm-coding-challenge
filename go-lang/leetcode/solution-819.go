package leetcode

import (
	"regexp"
	"slices"
	"sort"
	"strings"
)

func mostCommonWord(paragraph string, banned []string) string {
	paragraph = regexp.MustCompile(`[^a-zA-Z0-9 ]+`).ReplaceAllString(strings.ToLower(paragraph), "")
	var pSplit []string
	if strings.Contains(paragraph, " ") {
		pSplit = strings.Split(paragraph, " ")
	} else {
		pSplit = strings.Split(paragraph, "")
	}
	var wordCount = map[string]int{}
	for _, s := range pSplit {
		if slices.Contains(banned, s) {
			continue
		}
		count, ok := wordCount[s]
		if ok {
			wordCount[s] = count + 1
		} else {
			wordCount[s] = 1
		}
	}
	keys := make([]string, len(wordCount))
	for key := range wordCount {
		keys = append(keys, key)
	}

	sort.Slice(keys, func(i, j int) bool {
		return wordCount[keys[i]] > wordCount[keys[j]]
	})
	k := keys[0]
	return k
}
