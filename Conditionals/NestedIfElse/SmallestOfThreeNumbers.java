/*
Smallest of three numbers
Description
Write Java code to determine the smallest number of three numbers entered by the user.
You can take in some numbers as an input, and calculate the smallest of them.
After doing that, print out the smallest number as:
The smallest number entered is <the smallest calculated number>
Sample input:
1
4
0
Sample Output:
The smallest number entered is 0
 */

package Conditionals.NestedIfElse;
import java.util.*;

public class SmallestOfThreeNumbers {   
    public static void main(String[] args) {

        int n1, n2, n3;
        Scanner input = new Scanner(System.in);
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();

        if (n1<n2){
            if (n1<n3){
                System.out.println("The smallest number entered is "+n1);
            }
            else {
                System.out.println("The smallest number entered is "+n3);
            }
        }
        else {
            if(n2<n3){
                System.out.println("The smallest number entered is "+n2);
            }
            else {
                System.out.println("The smallest number entered is "+n3);
            }
        }
    }
}