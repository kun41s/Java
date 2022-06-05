package DataStructureAndAlgorithm.Sorting.InsertionSort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortReverseOrder {

    public static void insertSortReverseOrder(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int v = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < v){
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j+1] = v;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int element = input.nextInt();
        int[] arr = new int[element];
        for (int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        InsertionSortReverseOrder is = new InsertionSortReverseOrder();
        is.insertSortReverseOrder(arr);

        for (int i = 0 ; i < arr.length; ++i){
            System.out.println(arr[i]);
        }
    }
}
