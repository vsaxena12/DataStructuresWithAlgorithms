package com.dev.c.algorithms.dynamicProgramming.memoization;

import java.util.Map;

public class GridTraveller {

    public static long gridTraveller(long m, long n){
        if(m == 1 && n == 1)
            return 1;
        if(m == 0 || n == 0)
            return 0;

        return gridTraveller(m-1, n) + gridTraveller(m, n-1);
    }

    public static long gridTravellerMemo(long m, long n, Map<String, Long> memo){
        String key = m + "," + n;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        if(m == 1 && n == 1)
            return 1;
        if(m == 0 || n == 0)
            return 0;

        memo.put(key, gridTravellerMemo(m - 1, n, memo) + gridTravellerMemo(m, n - 1, memo));
        return memo.get(key);
    }
}
