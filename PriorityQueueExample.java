import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueExample{
    public static void main(String[] args){
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
            priorityQueue.add(5);
            priorityQueue.add(2);
            priorityQueue.add(8);
            priorityQueue.add(1);
            priorityQueue.add(7);
            System.out.println("PriorityQueue Elements: " + priorityQueue);
            System.out.println("Peek Elements: " + priorityQueue.peek());
            System.out.println("Poll Elements: " + priorityQueue.poll());
            System.out.println("PriorityQueue Elements After poll: " + priorityQueue);
            priorityQueue.add(3);
            priorityQueue.add(6);
            System.out.println("PriorityQueue Elements After adding more elements: " + priorityQueue);
            priorityQueue.remove(6);
            System.out.println("PriorityQueue Elements After removing element 6: " + priorityQueue);
            System.out.println("Is 5 is present in priorityQueue?: " + priorityQueue.contains(5));
            Object[] array = priorityQueue.toArray();
            System.out.println("priorityQueue as an array: " + Arrays.toString(array));
            priorityQueue.clear();
            System.out.println("priorityQueue after cleaning: " + priorityQueue);
    }
}