package DataStructureAndAlgorithm.Queue;
import java.util.LinkedList;

public class ToDoList {
    public static void main(String[] args) {
        MyQueue<String> todoList = new MyQueue<String>();
        makeToDoList(todoList);
        doAllTasks(todoList);
    }

    private static void makeToDoList(MyQueue<String> todoList) {
        todoList.add("task 1");
        todoList.add("task 2");
        todoList.add("task 3");
        todoList.add("task 4");   //enqueue
    }

    private static void doAllTasks(MyQueue<String> todoList) {
        while (todoList.size() != 0){
            System.out.println(todoList.remove());      //dequeue
        }
    }
}

class MyQueue<T>{
    private LinkedList<T> list = new LinkedList<T>();

    public void add(T el) {
        this.list.add(el);
    }

    public T remove() {
        return this.list.remove();
    }

    public int size() {
        return this.list.size();
    }
}