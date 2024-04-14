import java.util.*;

public class AsLifoQueueDemo {

    public static void main(String[] args) {

        ArrayDeque<String> deque = new ArrayDeque<>();

        // Add elements to the Deque
        deque.add("Apple");
        deque.add("Banana");
        deque.add("Cherry");
        System.out.println(deque);

        // Convert the Deque to a LIFO Queue using asLifoQueue()
        Queue<String> lifoQueue = Collections.asLifoQueue(deque);

        // Print elements from the LIFO Queue
        System.out.println("LIFO Queue elements:");
       lifoQueue.forEach(System.out::println);

        lifoQueue.remove("Cherry");
        System.out.println(lifoQueue);
        System.out.println(deque);


    }
}
