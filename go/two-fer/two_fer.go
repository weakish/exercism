// Package twofer is just an example.
package twofer

// ShareWith me.
func ShareWith(name string) string {
	var who string
	if name == "" {
		who = "you"
	} else {
		who = name
	}
	return "One for " + who + ", one for me."
}
