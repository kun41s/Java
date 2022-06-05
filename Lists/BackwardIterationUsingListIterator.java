/*
Given below is the code for ArrayList, which contains a random object with six elements — 2, 4, 5, 10, 99.9, and 101 — stored as float-type values. The code prints all the elements using a for loop.

Modify this code to print all the elements backward (starting from the last element of the list), using the ListIterator class.

Sample Input:
No input required

Expected Output:

101.0
99.9
10.0
5.0
4.0
2.0
 */

package Lists;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;



public class BackwardIterationUsingListIterator {

    public static void main(String[] args) {
        List<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
        random.add(101f);

        iterateBkwd(random);
    }

    public static void iterateBkwd(List<Float> num) {
        ListIterator<Float> it = num.listIterator(num.size());
        while(it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}