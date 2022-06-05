/*
Description
Lie Detector
You will be taking chemicals X,Y, A and B as inputs. Also, you will take the heart rate(heartRate) as input.

The person is telling the truth if one of the following conditions are met:
    Sum of amounts of X and Y is greater than 30
    Either A is greater than 3 or B is less than 6
    Heart rate is equal to 70 and X is greater than 3

The first four lines of input will have X,Y,A and B as inputs in that particular order.
The next line of input will have the heart rate.

Sample input:
12
23
1
3
77

Sample output:
The person is telling the truth.

Sample input:
1
2
1
7
77

Output:
The person is lying
 */

package Conditionals.ElseIf;
import java.util.*;

public class LieDetector {
    public static void main(String[] args) {

        int X,Y,A,B,heartRate;
        Scanner input= new Scanner(System.in);
        X=input.nextInt();
        Y=input.nextInt();
        A=input.nextInt();
        B=input.nextInt();
        heartRate=input.nextInt();
        if (X+Y>30){
            System.out.println("The person is telling the truth.");
        }
        else if (A>3 || B<6){

            System.out.println("The person is telling the truth.");
        }
        else if (heartRate==70 && X>3){
            System.out.println("The person is telling the truth.");
        }
        else {
            System.out.println("The person is lying");
        }
    }
}