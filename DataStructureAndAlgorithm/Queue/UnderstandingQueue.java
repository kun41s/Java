package DataStructureAndAlgorithm.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class UnderstandingQueue {
//    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<Integer>();
//
//        //Enqueue
//        queue.add(5);       //This will thrown exception if queue is already full
//        queue.offer(5);     //doesn't thrown exception
//
//        //Peek
//        queue.element();    //return element which was added first and still present. Throws exception if queue is empty
//        queue.peek();       //same thing as above. Returns null instead of exception
//
////        Deque
//        queue.remove();     //This removes the element in FIFO order. If the queue is empty, this will throw the exception
//        queue.poll();       //Same as remove() but not throwing exception. Return null if empty.
//    }

    public static void main(String arg[]) {
        Queue<Character> q=new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add('a');
        q.add('b');
        q.add('c');
        q.add('d');
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q);
        System.out.println(q.isEmpty());
    }
}
