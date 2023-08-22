package leetcode

func reverseString(s []byte) {
	var (
		i = 0
		j = len(s) - 1
	)
	for i < j {
		swap(s, i, j)
		i++
		j--
	}
}

func swap(s []byte, i int, j int) {
	tmp := s[i]
	s[i] = s[j]
	s[j] = tmp
}
