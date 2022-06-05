package DataStructureAndAlgorithm.Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] randomNumbers = {13, 3242, 23, 2351, 352, 5462, 86, 256,0, 1,2};
        int[] sortedArray;
        sortedArray = BubbleSort(randomNumbers);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] BubbleSort(int[] numbers){

        for (int i=0; i< numbers.length; i++){
            for (int j=1; j<(numbers.length -i); j++){
                if (numbers[j-1] > numbers[j]){
                    //swap elements
                    swap(j-1, j, numbers);
                }
            }
        }
        return numbers;
    }

    public static void swap(int i, int j, int[] array){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
