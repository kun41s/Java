/*
Write a program in Java that takes an array of strings as input and returns the sorted array.
Assume that the sorting needs to be done based on the size of each string.
So, a string with fewer characters should come before another string with more number of characters.
Use the quicksort algorithm for the program.

Sample Input - 1:
7
Christene
Tomas
Marline
Marcelluss
Michelle
Quiana
Keny

Sample Output - 1:
Keny
Tomas
Quiana
Marline
Michelle
Christene
Marcelluss

So, the first input is the number of elements in the array. In this case, the number of elements is 7.
Next 7 inputs are the elements inside the array. As you can see in the output,
 the names are sorted as per their length. The name with fewer characters comes before the names with more characters.

Please note that Quick Sort is an unstable sorting algorithm.
So, the words with same number of characters may come in a different sequence for different people depending upon the factors outside our control.
 */

package DataStructureAndAlgorithm.Sorting.QuickSort;

import java.util.Scanner;

public class Source {
    public static void quickSort(String array[], int left, int right) {
        if (left < right) {
            int position = partition(array, left, right);
            quickSort(array, left, position - 1);
            quickSort(array, position + 1, right);
        }

    }

    public static int partition(String[] arr, int start, int end){
        String pivot = arr[end];
        int i= start;

        for (int j = start; j < end; j++){
            if (arr[j].length() <= pivot.length()){
                String temp1 = arr[j];
                arr[j] = arr[i];
                arr[i]= temp1;
                i++;
            }
        }

        String temp2 = arr[i];
        arr[i] = arr[end];
        arr[end] = temp2;

        return i;
    }
//
    static void printArray(String arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.println(arr[i]+" ");
//        System.out.println();
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lengthOfArray = input.nextInt();
        String arr[] = new String[lengthOfArray];

        for (int i =0; i<arr.length; i++){
            arr[i] = input.next();
        }

        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }


}
