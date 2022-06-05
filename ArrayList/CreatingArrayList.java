/*
The following code was written using an array in your previous practice coding question. Modify the code, and implement it using the ArrayList.

Also, a new element 99 must be added at the end of the newly implemented ArrayList. This implementation is already written in the code.

Sample input
There is no input for this program.

Expected output
2
4
5
10
99
 */

package ArrayList;
import java.util.ArrayList;                          //ArrayList library imported

class CreatingArrayList {
    public static void main(String[] args) {
        ArrayList random = new ArrayList();          //An object named 'random' is created for the ArrayList class
        random.add(2);
        random.add(4);
        random.add(5);
        random.add(10);
        random.add(99);                             //Command for adding a new element
        printArray(random);
    }

    public static void printArray(ArrayList arr) {
        for(Object a : arr) {          //The data type of an element of ArrayList taken to be 'random'
            System.out.println(a);
        }
    }
}