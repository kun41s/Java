/*
You are given an unsorted array with n integers. You need to move all zeros(if any) to the end of the array and the order of the non-zero integers shouldn’t be altered.

Example:
array = [5, 8, 0, 15, 6, 0, 1, 0, 13]
Output:
array = [5, 8, 15, 6, 1, 13, 0, 0, 0]

array = [0, 3, 14, 0, 1, -6, 18, 0]
Output:
array = [3, 14, 1, -6, 18, 0, 0, 0]

array = [5, 3, 14, 15, 1, -6, 18, 13]
Output:
array = [5, 3, 14, 15, 1, -6, 18, 13]

Input: The input will be in the following format :

    The first line should be the number of elements in the array.
    The second line should be the elements of the array space separated.

Note: You just need to move all zeros(if any) to the end of the array and need not print anything. The stub code will print the elements of the array.

Example :
Input:
9
5 8 0 15 6 0 1 0 13
 */

package Arrays;
import java.util.*;

public class MoveAllZerosToEnd {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        moveZerosToEnd(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // Method to find move all zeros to the end of the array
    static void moveZerosToEnd(int[] arr) {
        int index = 0;
        // Suppose there are k non-zero integers in the given n integers, then store that k non-zero integers at
        // first k positions in the array. Then store zeros at remaining positions.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                arr[index++] = arr[i];
        }
        for (int i = index; i < arr.length; i++)
            arr[i] = 0;
    }
}
