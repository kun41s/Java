/*
The following code stores a set of four numbers in an array named ‘random’, as written in the main method. Then, a method printArray is called on this variable, which is expected to print the elements of the array, with each number printed in a separate line.

Complete the code to declare the printArray method.

Sample input
There is no input for this program.

Expected output
2
4
5
10
*/

package Arrays;

public class CreatingJavaArray {
    public static void main(String[] args) {
        int random[ ] = {2, 4, 5, 10};
        printArray(random);
    }

    public static void printArray(int[] arr) {
        for(int s: arr){
            System.out.println(s);
        }
    }
}
