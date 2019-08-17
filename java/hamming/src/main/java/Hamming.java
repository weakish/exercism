class Hamming {

    private String left;
    private String right;
    private int strandLength;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand == "") {
            throw new IllegalArgumentException("left strand must not be empty.");
        } else if (rightStrand == "") {
            throw new IllegalArgumentException("right strand must not be empty.");
        } else if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        } else {
            left = leftStrand;
            right = rightStrand;
            strandLength = leftStrand.length();
        }
    }

    int getHammingDistance() {
        int counter = 0;
        for (int i = 0; i < strandLength; i++) {
            if (left.charAt(i) != right.charAt(i)) {
				counter++;
			}
        }
        return counter;   
    }
}
