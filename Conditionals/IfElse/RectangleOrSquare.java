/*
Description
Write a Java program to take the values of length and breadth from user and print whether the quadrilateral is a rectangle or a square.
(You can assume that all angles in the quadrilateral are right angles).
1) Print out “Square” in case the quadrilateral is a square
1) Print out “Rectangle” in case the quadrilateral is a rectangle
Sample Input:
4
4
Sample Output:
Square

 */

package Conditionals.IfElse;
import java.util.*;
public class RectangleOrSquare {

    public static void main(String[] args) {

        int length,breadth;
        Scanner input = new Scanner(System.in);
        length=input.nextInt();
        breadth=input.nextInt();
        if (length==breadth){
            System.out.println("Square");
        }
        else {
            System.out.println("Rectangle");
        }
    }
}
