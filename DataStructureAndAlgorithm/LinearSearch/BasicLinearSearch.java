package DataStructureAndAlgorithm.LinearSearch;

public class BasicLinearSearch {
    public static void main(String[] args) {
        int[] arr1 = {23,45,21,55,234,1,34,90};
        int searchKey = 34;
        System.out.println("Key " + searchKey + " found at index : " + linearSearch(arr1, searchKey));
    }

    public static int linearSearch(int[] arr, int key){
        int size = arr.length;

        for (int i=0; i<= size; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
