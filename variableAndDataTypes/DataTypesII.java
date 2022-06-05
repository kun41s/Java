/*
Description
Consider that you want to store distance between two points in variables.
The distance given is 2.367 kms.
Initialize a variable named “distance” to store the distance in kilometres.
Initialize a variable named “distanceInMetres” to store the distance in metres.
Note: Remember to use appropriate data types to store the distances.
The code stub given will print the values accordingly, you only have to initialize the variables.
Sample test case:
Input: Nil
Output:
Distance in km=2.367
Distance in metres=2367
 */

package variableAndDataTypes;

import java.util.*;
public class DataTypesII {

    public static void main(String[] args) {

        //initialize your variables here
        float distance;
        distance=2.367f;
        int distanceInMetres;
        distanceInMetres=2367;
        System.out.println("Distance in km="+distance);
        System.out.println("Distance in metres="+distanceInMetres);
    }
}