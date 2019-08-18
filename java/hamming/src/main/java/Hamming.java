class Hamming {

    private String left;
    private String right;
    private int strandLength;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            String errorMessage;
            if (leftStrand.length() == 0) {
                errorMessage = "left strand must not be empty.";
            } else if (rightStrand.length() == 0) {
                errorMessage = "right strand must not be empty.";
            } else {
                errorMessage = "leftStrand and rightStrand must be of equal length.";
            }
            throw new IllegalArgumentException(errorMessage);
        }    
        left = leftStrand;
        right = rightStrand;
        strandLength = leftStrand.length();
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
