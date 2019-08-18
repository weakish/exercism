object Hamming {
    fun compute(a: String, b: String): Int = a.zip(b) { x, y -> if (x == y) 0 else 1 }.sum()
}