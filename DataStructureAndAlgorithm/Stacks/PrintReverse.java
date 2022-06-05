package DataStructureAndAlgorithm.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class PrintReverse {
    public static void main(String arg[]) {
        Stack<Character> s = new Stack<Character>();
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        //write your code here

        System.out.println(ReverseString(data, s));
    }

    public static String ReverseString(String str, Stack<Character> stack) {
        char[] reverseString = new char[str.length()];
        // Declare a stack of type Character

        // Traverse the String and push the character one by
        // one into the Stack
        for (int i = 0; i < str.length(); i++) {
            // push the character into the Stack
            stack.push(str.charAt(i));
        }

        // Now Pop the Characters from the stack until it
        // becomes empty

        int i = 0;
        while (!stack.isEmpty()) { // popping element until
            // stack become empty
            // get the character from the top of the stack
            reverseString[i++] = stack.pop();
        }
        // return string object
        return new String(reverseString);
    }
}



    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*
    You are given some lines of code. You have to modify the given stack to return the desired output as shown below.

Output Format

[2, 45, 53, 54, 12]
     */

//    public static void main(String arg[]) {
//        Stack<Integer> stack = new Stack<Integer>();
//        stack.push(2);
//        stack.push(14);
//        stack.push(23);
//        stack.pop();
//        stack.push(12);
//
//
//        //Write your code here. Your stack should finally look like this: [2, 45, 53, 54, 12].
//
//        stack.pop();
//        stack.pop();
//        stack.push(45);
//        stack.push(53);
//        stack.push(54);
//        stack.push(12);
//
//        System.out.print(stack);
//
//
//    }
//}
