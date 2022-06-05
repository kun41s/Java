/*
Assume that you have built a lie detector which detects the level of chemicals X and Y.
If the sum of the amounts of X and Y is greater than 30, then the person is telling the truth.
Write Java code to take in the values of X and Y and detect whether the person is telling the truth or not.
If the person is not lying then display "The person is telling the truth.", otherwise display"The person is lying."

Sample input:
12
23
Sample output:
The person is telling the truth.
 */

package Conditionals.IfElse;
import java.util.*;
public class LieDetector {

    public static void main(String[] args) {

        int X,Y;
        Scanner input= new Scanner(System.in);
        X=input.nextInt();
        Y=input.nextInt();
        if (X+Y>30){
            System.out.println("The person is telling the truth.");
        }
        else {
            System.out.println("The person is lying.");
        }
    }
}

