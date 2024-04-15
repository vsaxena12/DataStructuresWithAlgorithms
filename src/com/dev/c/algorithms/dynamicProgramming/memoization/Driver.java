package com.dev.c.algorithms.dynamicProgramming.memoization;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.dev.c.algorithms.dynamicProgramming.memoization.GridTraveller.gridTravellerMemo;

public class Driver {

    public static void main(String[] args){
        System.out.println("Number of Grid Travelling: "+GridTraveller.gridTraveller(1,1));
        System.out.println("Number of Grid Travelling: "+GridTraveller.gridTraveller(2,3));
        System.out.println("Number of Grid Travelling: "+GridTraveller.gridTraveller(3,3));


//        long startTime = System.nanoTime();
//        long gridTravelled = GridTraveller.gridTraveller(18,18);
//        System.out.println("Number of Grid Travelling: "+gridTravelled); //2333606220
//        long endTime = System.nanoTime();
//        long totalTime = endTime - startTime;
//        double totalTimeInSecs = TimeUnit.NANOSECONDS.toSeconds(totalTime);
//        System.out.println("The total time elapsed is " + totalTimeInSecs + " seconds");

        Map<String, Long> memo = new HashMap<>();
        long result = gridTravellerMemo(18, 18, memo);
        System.out.println("Number of Grid Travelled Memo: "+result);
    }
}
