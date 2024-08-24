package Queue;

import java.util.Collections;
import java.util.PriorityQueue;

// By default, priority queue prefer to give higher priority for smaller value
public class Priority_queue {
    public static void main(String[] args) {
        // if want to reverse the priority queue order than we have to write something in constructor
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int [] ranks = {33,53,2,1,88,4};
        for (int item: ranks) {
            pq.add(item);
        } // complexity for this loop is O(nlogn) because n for traversal and logn for adding
        while(pq.size()>0){
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}
