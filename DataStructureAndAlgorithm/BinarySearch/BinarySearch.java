package DataStructureAndAlgorithm.BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 10, 11};

        search(arr, 0, arr.length-1 , 6);
    }

    public static int search(int[] arr, int left, int right, int numToFind){
        //Base Condition
        if(numToFind > right){
            System.out.println("Number : "+ numToFind +" can't be found in the array");
        }

        int mid = left + (right - left)/2;

        if(arr[mid] == numToFind){
            System.out.println("Number : "+ numToFind +" found in the array at index " + mid);
        }else if (arr[mid] > numToFind){
            search(arr, left, mid-1, numToFind);
        }else if (arr[mid] < numToFind){
            search(arr, mid+1, right, numToFind);
        }

        return -1;
    }
}
