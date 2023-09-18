// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
    /**
    * Calculates the Fibonacci number at the given index.

    * @param n The index of the Fibonacci number to calculate.
    * @return The Fibonacci number at the given index.
    */
    public static long fibonacci(long n) {
        if (n < 0) {
            return -1;
        } else {
            long[] dp = new long[105];
            dp[0] = 0;
            dp[1] = 1;
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
                if (dp[i] < 0) {
                    return Long.MAX_VALUE;
                }
            }
            return dp[(int) (n)];
        }
    }
} 
