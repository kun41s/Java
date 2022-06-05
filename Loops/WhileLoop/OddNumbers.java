/*
Description
Write a program that prints all the odd numbers from 25 to 1 (in decreasing order).

Input:
No input required

Output

25 23 21 19 17 15 13 11 9 7 5 3 1
 */

package Loops.WhileLoop;

class OddNumbers {
    public static void main(String[] args) {
        int num = 25;
        while( num >= 1) {
            System.out.print (num + " ");
            num = num - 2;
        }
    }
}
