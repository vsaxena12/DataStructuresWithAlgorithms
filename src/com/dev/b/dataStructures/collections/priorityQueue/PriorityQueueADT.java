package com.dev.b.dataStructures.collections.priorityQueue;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueADT {
    public static void main(String[] args){
        PriorityQueue<int[]> pr = new PriorityQueue<>((a, b) -> (a[0] - b[0]));

        pr.add(new int[]{500});
        pr.add(new int[]{750});
        pr.add(new int[]{900});
        pr.add(new int[]{500});
        pr.add(new int[]{100});

        System.out.println(Objects.requireNonNull(pr.poll())[0]);
        System.out.println(pr.size());
    }
}
