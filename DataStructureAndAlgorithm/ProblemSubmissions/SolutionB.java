package DataStructureAndAlgorithm.ProblemSubmissions;

import java.util.Scanner;

public class SolutionB {

    static int binarySearch(int arr[], int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, left, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, right, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int elements = input.nextInt();
        int key = input.nextInt();
        int array[] = new int[elements + 1];

        for (int i=1; i < elements + 1; i++){
            array[i] = input.nextInt();
        }

        int result = binarySearch(array, 0, array.length + 1 ,key);

        if (result == -1){
            throw new ArrayIndexOutOfBoundsException("You is in error");
        } else {
            System.out.println(result);
        }
    }
}
