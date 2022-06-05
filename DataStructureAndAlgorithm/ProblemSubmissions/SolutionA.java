package DataStructureAndAlgorithm.ProblemSubmissions;

import java.util.Scanner;

public class SolutionA {

    static int binarySearch(int arr[], int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (mid == arr[mid])
                return mid;
            int res = -1;
            if (mid + 1 <= arr[high])
                res = binarySearch(arr, (mid + 1), high);
            if (res != -1)
                return res;
            if (mid - 1 >= arr[low])
                return binarySearch(arr, low, (mid - 1));
        }
        return -1;
    }

     public static void main(String[] args) {

         SolutionA solutionA = new SolutionA();

         Scanner input = new Scanner(System.in);
         int elements = input.nextInt();
         int array[] = new int[elements + 1];

         for (int i = 1; i < elements + 1; i++) {
             array[i] = input.nextInt();
         }

         int result = solutionA.binarySearch(array, 0, elements + 1);
         if (result != -1) {
             try {
                 System.out.println(result);
             } catch (ArrayIndexOutOfBoundsException e) {
                 System.out.println("NOT_FOUND");
             }
         }
     }
}
