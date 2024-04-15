package com.dev.c.algorithms.recursion.gfg;

public class Factorial {

    private static int fact(int n){
        if(n == 1 || n == 0)
            return 1;
        return n * fact(n-1); //T(O(n)) and S(O(n))
    }

    public static void main(String[] args){
        int n = 5;
        System.out.println("Factorial using recursion: "+fact(n));
    }
}
