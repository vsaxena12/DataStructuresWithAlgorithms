package com.dev.b.dataStructures.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueADT {
    /**
     * Queues -> First In First Out
     * Queue has front for remove(poll)
     * Queue has rear for add
     *
     */
    public static void main(String[] args){
        Queue<Integer> queue = new ArrayDeque<>(); //LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        System.out.println(queue);

        //queue.offer(integer); -> same as add

        queue.remove();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);

        System.out.println(queue.element());
        System.out.println(queue.peek());

        System.out.println(queue.size());
        System.out.println(queue.isEmpty());


    }
}
