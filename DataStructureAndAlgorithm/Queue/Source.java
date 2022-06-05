/*
Modify like [1, 4, 9, 14, 15]
 */

package DataStructureAndAlgorithm.Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

// In java, you can use an inbuilt Queue using the Linked class
// Here, the convention changes a bit -
// Java queues don't have enqueue and dequeue methods; these operations are carried out using the following methods:
// Enqueuing: add(x), Throws an exception if it fails to insert the object, i.e. when the queue is full
// Dequeuing: remove(), Throws an exception if the queue is empty
// peek(): Returns the head of the queue. It would return null if the queue is empty
// isEmpty(): Returns true if the queue is empty
// You may read more here - https://docs.oracle.com/javase/tutorial/collections/interfaces/queue.html

public class Source {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        sort(queue);
        System.out.println(queue);
    }

    // Method to sort the queue
    static void sort(Queue<Integer> queue) {
        // Write your code here
        if (queue.isEmpty()){
            return;
        }
        int temp = queue.peek();
        queue.remove();
        sort(queue);
        pushInQueue(queue, temp, queue.size());
    }

    static void pushInQueue(Queue<Integer> q, int temp, int size){
        if (q.isEmpty() || size == 0){
            q.add(temp);
            return;
        } else if (temp <= q.peek()){
            q.add(temp);
            FrontToLast(q, size);
        } else {
            q.add(q.peek());
            q.remove();
            pushInQueue(q, temp, size - 1);
        }
    }

    static void FrontToLast(Queue<Integer> q, int qsize){
        if (qsize <= 0)
            return;
        q.add(q.peek());
        q.remove();
        FrontToLast(q, qsize-1);
    }
}