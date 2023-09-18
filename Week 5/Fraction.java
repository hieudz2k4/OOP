// Import your library
import java.lang.Math;

// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
     private int numerator = 1;
    private int denominator = 1;

    public Solution() {
        this.denominator = 1;
    }

    // set numerator
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    // get numerator
    public int getNumerator() {
        return numerator;
    }

    /**
     * setDenominator.
     * @param denominator set denominator.
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            this.denominator = 1;
        }
    }

    // get denominator
    public int getDenominator() {
        return denominator;
    }


    /**
     * set the numerator and denominator.
     * @param numerator int.
     * @param denominator int.
     */
    public Solution(int numerator, int denominator) {
        int firstNumer = this.numerator;
        int firstDeno = this.denominator;
        if (denominator != 0) {
            this.numerator = numerator;
            this.denominator = denominator;
        } else {
            this.numerator = firstNumer;
            this.denominator = firstDeno;
        }
    }

    /**
     * function return the gcd.
     * @param a int.
     * @param b int.
     * @return GCD(a, b): int.
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return Math.abs(gcd(b, a % b));
    }

    /**
     * reduce method.
     * @return Solution.
     */
    public Solution reduce() {
        int i = gcd(this.numerator, this.denominator);
        numerator /= i;
        denominator /= i;
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        return this;
    }

    /**
     * add method.
     * @param s Solution.
     * @return the Solution.
     */
    public Solution add(Solution s) {
        this.numerator = this.numerator * s.getDenominator() + s.getNumerator() * this.denominator;
        this.denominator = this.denominator * s.getDenominator();
        return this.reduce();
    }

    /**
     * subtract method.
     * @param s Solution.
     * @return the Solution.
     */
    public Solution subtract(Solution s) {
        this.numerator = this.numerator * s.getDenominator() - s.getNumerator() * this.denominator;
        this.denominator = this.denominator * s.getDenominator();
        return this.reduce();
    }

    /**
     * multiply method.
     * @param s Solution.
     * @return Solution.
     */
    public Solution multiply(Solution s) {
        if (s.getDenominator() != 0) {
            this.numerator = this.numerator * s.getNumerator();
            this.denominator = this.denominator * s.getDenominator();
        }
        return this.reduce();
    }

    /**
     * divide method.
     * @param s the divided Solution.
     * @return Solution.
     */
    public Solution divide(Solution s) {
        if (s.getNumerator() != 0) {
            this.numerator = this.numerator * s.getDenominator();
            this.denominator = this.denominator * s.getNumerator();
        }
        return this.reduce();
    }

    /**
     * equals method.
     * @param obj the Object will be compared.
     * @return boolean.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            // compare this vs other here
            Solution compare = subtract(other);
            if (compare.getNumerator() == 0) {
                return true;
            }
        }
        return false;
    }
} 
