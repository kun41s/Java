/*
Complete the code below to create an ArrayList named ‘random’, using Generics, with five elements — 2, 4, 5, 10, and 99.9 — stored as float-type values in ArrayList, and then, print this ArrayList using the printList method.

Sample input
There is no input for this program.

Expected output
2.0
4.0
5.0
10.0
99.9

 */

package ArrayList;
import java.util.ArrayList;

class ArrayListUsingGenerics {
    public static void main(String[] args) {
        ArrayList<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);

        printList(random);
    }

    public static void printList(ArrayList<Float> arr) {
        for(Float a : arr) {
            System.out.println(a);
        }
    }
}