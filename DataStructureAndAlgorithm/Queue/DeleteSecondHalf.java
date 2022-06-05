/*
Sample Input:
12
1 2 3 4 5 6 7 8 9 10 11 12
Sample Output:
[1, 2, 3, 4, 5, 6]
 */

package DataStructureAndAlgorithm.Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DeleteSecondHalf {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        deleteSecondHalf(queue);
    }

    // Method to delete the second half of the elements and print the remaining elements
    static void deleteSecondHalf(Queue<Integer> queue) {
        // Write your code here
        int n = queue.size();
        int temp = n - n/2;

        for (int i = 0; i < temp; i++){
            queue.add(queue.remove());
        }

        for (int i = 0; i<n/2; i++){
            queue.remove();
        }

        System.out.println(queue);
    }
}
