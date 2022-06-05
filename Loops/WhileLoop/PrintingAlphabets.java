/*
Write a Java program to print all alphabets from a to z in lowercase.
(Hint: The ASCII value of “a” is 97)
Note: You have to print the alphabets in a single line.
Sample Input:
Nil
Sample Output:
a b c d e f g h i j k l m n o p q r s t u v w x y z
 */

package Loops.WhileLoop;

public class PrintingAlphabets {

    public static void main(String[] args) {
        int counter = 97;
        while (counter <= 122) {
            System.out.print((char) counter+ " ");
            counter = counter + 1;
        }
    }
}
