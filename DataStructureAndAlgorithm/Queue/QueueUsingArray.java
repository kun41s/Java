//package Queue;
//
//public class QueueUsingArray {
//    String[] arr;
//    int capacity;
//    int front;
//    int rear;
//
//    public QueueUsingArray(int capacity){
//        this.capacity = capacity;
//        arr = (String[]) new Object[capacity];
//        this.front = -1;
//        this.rear = -1;
//    }
//
//    public boolean isEmpty(){return this.front == -1;}
//    public boolean isFull(){ return (this.front + 1) % capacity == this.rear;}
//
//    public void enQueue(String data) throws Exception{
//        if (isFull()){
//            throw new Exception("Queue is Full");
//        }
//
//        front = (front + 1)%capacity;
//        this.arr[front] = data;
//
//        if (rear == -1){
//            rear = front;
//        }
//    }
//
//    public void deQueue() throws Exception{
//        if (isEmpty()){
//            throw new Exception("Full");
//        }
//
//        boolean isLastElement = rear == front;
//
//        String data = this.arr[rear];
//
//        rear = (rear+1)%capacity;
//        if (isLastElement){
//            rear = -1;
//            front = -1;
//        }
//        return data;
//    }
//
//    public static void main(String[] args) throws Exception{
//        QueueUsingArray<String> queueUsingArray = new QueueUsingArray<>(3);
//
//        System.out.println("Is Empty "+queueUsingArray.isEmpty());
//        queueUsingArray.enQueue("Vishwa");
//        System.out.println("Is Empty "+queueUsingArray.isEmpty());
//
//        queueUsingArray.enQueue("Mohan");
//        System.out.println(queueUsingArray.deQueue());
//
//        queueUsingArray.enQueue("Roshan");
//        queueUsingArray.enQueue("Aakash");
//        System.out.println("Is Full "+queueUsingArray.isFull());
//    }
//}
