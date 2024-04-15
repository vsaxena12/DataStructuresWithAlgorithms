package com.dev.c.algorithms.dynamicProgramming.fibonacciSeries;

public class FiboRecur {

    public static long fiboRecur(long n){
        if(n<=2)
            return 1;
        return fiboRecur(n-1) + fiboRecur(n-2);
    }
}
