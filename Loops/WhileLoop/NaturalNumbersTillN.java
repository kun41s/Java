/*
Description
        Write a program to print numbers from 1 to n, where n is a number taken as input from the user.

        Sample Input:
        4
        Sample Output:
        1
        2
        3
        4
*/

package Loops.WhileLoop;
import java.util.*;

public class NaturalNumbersTillN {

    public static void main(String[] args) {
        int n;
        Scanner input= new Scanner(System.in);
        n=input.nextInt();
        int counter=1;
        while (counter<=n){
            System.out.println(counter);
            counter=counter+1;
        }
    }
}

