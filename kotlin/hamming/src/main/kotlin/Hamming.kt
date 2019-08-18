object Hamming {
    fun compute(left: String, right: String): Int {
        if (left.length != right.length) {
            throw java.lang.IllegalArgumentException("left and right strands must be of equal length.")
        } else {
            return left.zip(right) { x, y -> if (x == y) 0 else 1 }.sum()
        }
    }
}