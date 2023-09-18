// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
    /**
     * phuong thuc isPrime de kiem tra so nguyen to.
     * @param n : int.
     * @return boolean.
     */
    public static boolean isPrime(int n) {
        if (n <= 0) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
} 
