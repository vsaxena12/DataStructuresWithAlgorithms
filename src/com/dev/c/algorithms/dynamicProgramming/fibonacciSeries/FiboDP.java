package com.dev.c.algorithms.dynamicProgramming.fibonacciSeries;

public class FiboDP {
    public static long fiboDP(int n){
        long[] f = new long[n + 2]; // 1 extra to handle case, n = 0
        int i;

        // 0th and 1st number of the Fibonacci series are 0 and 1
        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++) {
            // Add the previous 2 numbers in the series and store it
            f[i] = f[i - 1] + f[i - 2];
        }

        // n'th Fibonacci Number
        return f[n];
    }

    public static long fibMemo(int n, long[] memo) {
        if (n <= 1) {
            return n;
        }

        // Check if the result is already computed
        if (memo[n] != 0) {
            return memo[n];
        }

        // Compute and store the result in the memo array
        memo[n] = fibMemo(n - 1, memo) + fibMemo(n - 2, memo);
        return memo[n];
    }
}
