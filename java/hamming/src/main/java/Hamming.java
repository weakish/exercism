import main.java.StrandLengthMismatchException;

class Hamming {

    private String left;
    private String right;
    private int strandLength;

    Hamming(String leftStrand, String rightStrand) throws StrandLengthMismatchException {
        if (leftStrand.length() == rightStrand.length()) {
            left = leftStrand;
            right = rightStrand;
            strandLength = leftStrand.length();
        } else {
            throw new StrandLengthMismatchException("leftStrand and rightStrand length mismatch");
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
