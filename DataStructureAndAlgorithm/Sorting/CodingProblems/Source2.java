package DataStructureAndAlgorithm.Sorting.CodingProblems;

import java.util.Arrays;
import java.util.Scanner;

class Source2 {
    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray1 = scanner.nextInt();
        int sortedArray1[] = getArrayInput(sizeArray1, scanner);
        int sizeArray2 = scanner.nextInt();
        int sortedArray2[] = getArrayInput(sizeArray2, scanner);

        int descendingMerge[]=mergeBothInDescendingOrder(sortedArray1, sortedArray2);

        // write your code here
        for (int i=0; i< descendingMerge.length ; i++){
            System.out.println(descendingMerge[i]);
        }


    }

    public static int[] getArrayInput(int sizeArray, Scanner scanner){

        int[] array = new int[sizeArray];

        for(int i = 0; i < sizeArray; i++)
        {
            array[i]=scanner.nextInt();
        }

        return array;
    }


    public static int[] mergeBothInDescendingOrder(int[] array1, int[] array2) {

        int length1 = array1.length;
        int length2 = array2.length;

        int[] merged = new int[length1 + length2];

        int fooPosition, barPosition, mergedPosition;
        fooPosition = barPosition = mergedPosition = 0;

        while(fooPosition < length1 && barPosition < length2) {
            if (array1[fooPosition] < array2[barPosition]) {
                merged[mergedPosition++] = array1[fooPosition++];
            } else {
                merged[mergedPosition++] = array2[barPosition++];
            }
        }

        while (fooPosition < length1) {
            merged[mergedPosition++] = array1[fooPosition++];
        }

        while (barPosition < length2) {
            merged[mergedPosition++] = array2[barPosition++];
        }


        for (int i = 0; i < merged.length; i++) {
            for (int j = i+1; j < merged.length; j++) {
                if(merged[i] < merged[j]) {
                    int temp = merged[i];
                    merged[i] = merged[j];
                    merged[j] = temp;
                }
            }
        }


        return merged;
    }
}