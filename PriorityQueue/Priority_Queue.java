package PriorityQueue;
import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // least number will have highest Priority
        pq.add(5);
        pq.add(7);
        pq.add(1);
        pq.add(4);
        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" ");  // return highest priority value
            pq.remove();
        }

    }
}
