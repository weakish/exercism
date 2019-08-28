package hamming

import "errors"

// Distance calculates the hamming distance of two ascii strings.
func Distance(a, b string) (int, error) {
	if len(a) != len(b) {
		return 0, errors.New("length of sequences mismatch")
	}
	var c int
	for i := 0; i < len(a); i++ {
		if a[i] != b[i] {
			c++
		}
	}
	return c, nil
}
