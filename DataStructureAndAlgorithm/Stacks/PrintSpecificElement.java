package DataStructureAndAlgorithm.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class PrintSpecificElement {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        printFifthElementFromStart(stack);
    }

    // Method to print the fifth element from the top of the stack
//    static void printFifthElementFromEnd(Stack<Integer> stack) {
//        // Write your code here
//        Integer pos = (Integer) stack.search(5);
//        if(pos == -1)
//            System.out.println("There are not enough elements in the stack");
//        else
//            System.out.println(pos);
//    }

    static void printFifthElementFromEnd(Stack<Integer> stack) {
        int n = stack.size();
        // If the stack doesn't have enough elements
        if (n < 5)
            System.out.println("There are not enough elements in the stack");
        else {
            for (int i = 0; i < 4; i++){
                stack.pop();
            }
            System.out.println(stack.peek());
        }
    }


    // Method to print the fifth element from the bottom of the stack
    static void printFifthElementFromStart(Stack<Integer> stack) {
        if (stack.size() < 5) {
            System.out.println("There are not enough elements in the stack");
        } else {
            for (int i = stack.size(); i > 0; i--) {
                    if (i == 5){
                        System.out.println(stack.peek());
                    } else {
                        stack.pop();
                    }
            }
        }
    }
}

