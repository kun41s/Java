/*
Description
Write a code that sorts an array in decreasing order using Merge Sort algorithm.

Note that the array in the question which needs to be sorted is named as "randomNumbers".
You need to sort the numbers inside the "randomNumbers" array and store the sorted array inside the "sortedNumbers" array.

Input:
         1. The first input is 'n', that is, the number of elements in the array.
         2. In the next line, n elements of the array space-separated.

Output:
The array sorted in decreasing order.

Sample Input-1:
8
9 45 76 23 47 1 5 11

Sample Output-1
[76,47,45,23,11,9,5,1]

The first input is n (number of elements in the array), here it is 8.
The next line in the input represents the elements of the array (space-separated).
The output is the same array arranged in decreasing order.

Sample Input-1:
4
1 4 19 3

Sample Output-1
[19,4,3,1]

The first input is n (number of elements in the array), here it is 4.
The next line in the input represents the elements of the array (space-separated).
The output is the same array arranged in decreasing order.
 */

package DataStructureAndAlgorithm.Sorting.MergeSort;

import java.util.Arrays;
import java.util.Scanner;

public class Source {

    public static int[] sort(int[] randomNumbers) {
        return mergeSort(randomNumbers, 0, randomNumbers.length - 1);
    }

    public static int[] mergeSort(int[] numbers, int first, int last) {
        // first denotes the starting index of the "numbers" array
        // last denotes the ending index of the "numbers" array

        //Complete this function
        if (first < last){
            int mid = (first + last)/2;
            mergeSort(numbers, first, mid);
            mergeSort(numbers, mid+1, last);
            Merge(numbers, first, mid, last);
        }

        return numbers;
    }

    /// .......
    // Write the Merge function here which uses the merge sort to sort the array in decreasing order...
    /// .......

    static void Merge(int arr[], int start, int mid, int end){
        int leftLength = mid-start+1;
        int rightLength = end-mid;

        int L[] = new int[leftLength];
        int R[] = new int[rightLength];

        for (int i=0; i < leftLength; i++){
            L[i] = arr[start+i];
        }
        for (int j=0; j<rightLength; j++){
            R[j] = arr[mid+j+1];
        }

        int i=0, j=0, k=start;

        while (i < leftLength && j < rightLength){
            if (L[i] >= R[j]){
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i<leftLength){
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j<rightLength){
            arr[k] = R[j];
            j++;
            k++;
        }
    }



    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = scanner.nextInt();
        }
        int[] sortedNumbers;
        sortedNumbers = sort(randomNumbers);
        System.out.println(Arrays.toString(sortedNumbers));
    }
}
