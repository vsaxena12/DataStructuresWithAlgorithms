package com.dev.c.algorithms.recursion.problems;

public class FibonacciSeries {

    private static int fibo(int n){
        if(n == 1 || n == 2)
            return 1;
        return fibo(n-1) + fibo(n-2);

    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(fibo(n));
    }
}
