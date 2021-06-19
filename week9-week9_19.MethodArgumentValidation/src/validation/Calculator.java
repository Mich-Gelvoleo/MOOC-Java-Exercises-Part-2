package validation;

public class Calculator {

    public int multiplication(int fromInteger) {

        int multiplication = 1;
        if(fromInteger < 0){
            throw new IllegalArgumentException(fromInteger + " is a number that is either negative or 0.");
        }
        for (int i = 1; i <= fromInteger; i++) {
            multiplication *= i;
        }

        return multiplication;
    }

    public int binomialCoefficient(int setSize, int subsetSize) {
        
        if(setSize < 0 || subsetSize < 0){
            throw new IllegalArgumentException("One or both numbers are negative.");
        }
        
        if(subsetSize > setSize){
            throw new IllegalArgumentException("Subset size is greater than the set size.");
        }

        int numerator = multiplication(setSize);
        int denominator = multiplication(subsetSize) * multiplication(setSize - subsetSize);

        return numerator / denominator;
    }
}
