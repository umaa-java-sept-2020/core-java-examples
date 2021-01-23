package org.collections;

import java.util.LinkedList;
import java.util.Queue;

// PriorityQueue // Element at the root has priority
// Max Heap / Min Heap / Heapify
public class QueueList {

    // FI-FO
    // 10, 20, 30, 40, 50
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("john");
        queue.add("doe");

        queue.offer("alex");

        System.out.println(queue.peek());

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.remove());

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.remove()); // empty queue NoSuchElementException

    }
}
