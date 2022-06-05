package DataStructureAndAlgorithm.Sorting.MergeSort;

public class MergeSort {
    void merge(int arr[], int start, int mid, int end){

        //Sorting
        int leftLength = mid - start + 1;
        int rightLength = end - mid;

        int L[] = new int[leftLength];
        int R[] = new int[rightLength];

        for(int i=0; i < leftLength; i++){
            L[i] = arr[start+i];
        }
        for (int j=0; j < rightLength; j++){
            R[j] = arr[mid+j+1];
        }

        //Merging
        int i = 0;
        int j=0;
        int k = start;

        while (i < leftLength && j < rightLength){
            if (L[i] <= R[j]){
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

        while (j < rightLength){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int start, int end){
        if (start < end){
            int mid = (start + end)/2;
            sort(arr, start, mid);
            sort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }

    static void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {52, 81, 23, 59, 61, 78};

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length -1);
        printArray(arr);
    }
}
