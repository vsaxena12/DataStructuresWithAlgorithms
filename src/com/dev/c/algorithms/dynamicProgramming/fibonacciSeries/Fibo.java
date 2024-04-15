package com.dev.c.algorithms.dynamicProgramming.fibonacciSeries;

public class Fibo {

    public static void main(String[] args){
        System.out.println("Fibo Recur: "+FiboRecur.fiboRecur(7));
        System.out.println("Fibo Recur: "+FiboRecur.fiboRecur(8));
        System.out.println("Fibo Recur: "+FiboRecur.fiboRecur(9));
        //System.out.println("Fibo Recur: "+FiboRecur.fiboRecur(50));

        System.out.println("Fibo Recur: "+FiboDP.fiboDP(50));
        System.out.println("Fibo Recur: "+FiboDP.fibMemo(50, new long[50+1]));
    }
}
