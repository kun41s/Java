package DataStructureAndAlgorithm.Stacks;/*
Problem Statement:
You are given 4 books. You are required to place them in a stack, and then pick the book at the top and read 100 pages of it.
The book object contains a title and the number of pages which you have to read.
In a single reading session, you can only read 100 pages. After a book is completed, remove it from the stack,
and then begin reading the book that is now at the top of the stack.

Write a program that would first push the books into the stack, and then read all the books one by one, 100 pages at a time.

You will define a stack of Book objects as:
Stack<Book> bookStack = new Stack<Book>();

Sample Input:
 No Input Required

Output:

Reading 100 pages of Tinkle
Reading 100 pages of Lord of the Rings
Reading 100 pages of Lord of the Rings
Reading 100 pages of Lord of the Rings
Reading 100 pages of Champak
Reading 100 pages of Harry Potter
Reading 100 pages of Harry Potter
 */

//package Stacks;
//import java.util.EmptyStackException;
//import java.util.Scanner;
//import java.util.Stack;
//
//class Book {
//    public String title;
//    public int pagesLeft;
//
//    public Book(String title, int pages) {
//        this.title = title;
//        this.pagesLeft = pages;
//    }
//
//    public String getTitle() {
//        return this.title;
//    }
//
//    public int getPages() {
//        return this.pagesLeft;
//    }
//
//    public void read100Pages() {
//        System.out.println("Reading 100 pages of " + this.title);
//        this.pagesLeft = this.pagesLeft - 100;
//    }
//
//    public Boolean completed() {
//        return this.pagesLeft <= 0;
//    }
//}
//
//public class Source {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Book book1 = new Book("Harry Potter", 200);
//        Book book2 = new Book("Champak", 100);
//        Book book3 = new Book("Lord of the Rings", 300);
//        Book book4 = new Book("Tinkle", 100);
//
//
//        Stack<Book> bookStack = new Stack<Book>();
//        // Add code to push the books on the Stack here (in order:
//        // book1,book2,book3,book4)
//        bookStack.push(book1);
//        bookStack.push(book2);
//        bookStack.push(book3);
//        bookStack.push(book4);
//
//
//        // Add code to pick the book at the top and read 100 pages
//        // Remove the book from the stack if it is completed
//        try {
//            while (true) {
//                Book peek = bookStack.peek();
//
//                while (peek.getPages() > 100 || peek.getPages() == 100){
//                    peek.read100Pages();
//                }
//                bookStack.pop();
//            }
//        } catch (EmptyStackException e) {
//        }
//    }
//}





/**********************************************************************************************************************/


/*
Description
Given a sequence S1, check if it exists in another sequence S2.
Assume that all the elements are distinct in both the sequences.
Sequence S1 exists in sequence S2 if all the elements of S1 appear in S2 and their relative ordering is the same,
which means that there may be elements in the middle of two elements in S2, which are adjacent in S1.

Example:
For input:
S1 = 1 2 3
S2 = 1 4 2 5 6 3
Return: True because S2 also contains 1, 2, 3

For input:
S1 = 1 2 3
S2 = 1 2 4
Return: False because 3 is not present in S2


TestCases
Input 1:

1 2 3
1 4 2 5 3


Output 1:

true



Input 2:
1 2 3
1 2 4 5
Output 2:
false



1 2 3
3 2 1
 */
//import java.util.Scanner;
//import java.util.Stack;
//
//public class Source {
//
//    public static Boolean contains(Stack<Integer> sequence1, Stack<Integer> sequence2) {
//        // This block will be filled by the student
//        boolean flag = sequence2.containsAll(sequence1);
//        return flag;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String line1 = scanner.nextLine();
//        String line2 = scanner.nextLine();
//        Stack<Integer> sequence1 = new Stack<Integer>();
//        Stack<Integer> sequence2 = new Stack<Integer>();
//        for (String elem1 : line1.split(" ")) {
//            sequence1.add(Integer.parseInt(elem1));
//        }
//        for (String elem2 : line2.split(" ")) {
//            sequence2.add(Integer.parseInt(elem2));
//        }
//        Boolean isSubsequence = contains(sequence1, sequence2);
//        System.out.println(isSubsequence);
//    }
//}





/*************************************************************************************************************/

/*
You are given a stack with n integers. You need to reverse the last half of the elements i.e.
floor(n/2) elements from the bottom of the stack using recursion and print the elements of the stack.
Note : Floor function takes input as a real number and it returns the greatest integer less than or equal to the input.
Ex. floor(5.4) will give output as 5 and floor(4) will give 4.

Example:
Stack(bottom -> top) = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
Output: [1, 2, 3, 4, 5, 6, 12, 11, 10, 9, 8, 7]

Stack(bottom -> top) = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
Output: [1, 2, 3, 4, 5, 6, 11, 10, 9, 8, 7]

Input Format:
12
1 2 3 4 5 6 7 8 9 10 11 12

Output format:
[1, 2, 3, 4, 5, 6, 12, 11, 10, 9, 8, 7]
 */

//import java.util.*;
//
//public class Source {
//    public static void main(String args[]) {
//        Stack<Integer> stack = new Stack<>();
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        while (n-- > 0)
//            stack.push(s.nextInt());
//        reverseSecondHalf(stack);
//    }
//
//    // Method to reverse the last half of the elements from the bottom of the stack
//    static void reverseSecondHalf(Stack<Integer> stack) {
//        int n = stack.size();
//        reverse(stack, n / 2);
//        System.out.println(stack);
//    }
//
//    // Recursive method to reverse the last half of the elements from the bottom of the stack
//    static void reverse(Stack<Integer> stack, int n) {
//        if (n > 0) {
//            int temp = stack.pop();
//            reverse(stack, n - 1);
//            //Insert all the integers held in function call stack one by one from the bottom to top
//            insertAtBottom(stack, temp, n - 1);
//        }
//    }
//
//    // Recursive method to insert the el
//
//    static void insertAtBottom(Stack<Integer> stack, int temp, int n) {
//        if (n == 0)
//            stack.push(temp);
//        else {
//            int temp2 = stack.pop();
//            // Remove all the elements except the first ceil(n/2) elements of the original stack
//            insertAtBottom(stack, temp, n - 1);
//            // Push all the integers held in function call stack once the integer is inserted at the (ceil(n/2)+1)th position
//            stack.push(temp2);
//        }
//    }
//}



/**********************************************************************************************************************/

/*
Description
You are given a stack with n integers.
You need to sort the elements of the stack in ascending order such that the minimum value is at the bottom-most position of the stack.

Input Format:
The first line of input is the number of elements in the stack.
The next line of input consists n space separated integers in the order bottom to top.

Output Format:
The output is sorted stack with minimum value at bottom of the stack and maximum value at the top of the stack.

Example:
Stack(bottom -> top) = [6, 12, 3, 4]
Output: [3, 4, 6,12]

Sample Input:
12
6 12 3 4 5 1 7 8 10 9 11 2

Sample Output:
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]

 */


import java.util.*;

public class Source {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        sort(stack);
    }

    // Method to sort the elements of the stack in ascending order
    public static void sort(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<Integer>();

        while (!stack.isEmpty()) {

            int s1 = (int) stack.pop();

            while (!temp.isEmpty() && (temp.peek() > s1)) {
                stack.push(temp.pop());
            }
            temp.push(s1);

        }

        System.out.println(temp);

    }
}