package DataStructureAndAlgorithm.LinearSearch;
import java.util.Scanner;

//public class Source {
//    public static void main(String args[]) {
//        int count;
//        int i;
//
//        Scanner input = new Scanner(System.in);
//        count = input.nextInt();
//        int array[] = new int[count];
//
//        for (i = 0; i < count; i++) {
//            array[i] = input.nextInt();
//        }
//
//        int key = input.nextInt();
//        input.close();
//        int result=0;
//        for (i = 0; i < count; i++) {
//            if (array[i] == key) {
//                result = (count-1)-i;
//            }
//        }
//        if (result>=0) System.out.println(result);
//
//    }
//}

class Source {
    public int getLinearSearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        // Write your code here
        int count = 0;

        for (int i=0; i< inputArr.length; i++){
            if (inputArr[i] == key){
                return i;
            }else{
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Source bs = new Source();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(bs.getLinearSearchUnsuccessfulComparisonCount(array, key));
    }
}



