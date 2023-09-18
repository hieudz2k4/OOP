// Import your library
import java.lang.Math;

// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
    /**
     * Uoc so chung lon nhat.
     * @param a b: int.
     * @return GCD(a,b): int.
    **/
    public static int gcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return Math.abs(gcd(b, a % b));
    }
} 
