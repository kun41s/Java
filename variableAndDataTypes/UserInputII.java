/*
Description
Write Java code below which  —

    Asks the user to input three integer variables: a, b, and c

    Does the following calculation: a*b+c

    Prints out the value obtained in step 2

Input
a = 2, b = 3, c = 4

Output
10
 */

package variableAndDataTypes;
import java.util.Scanner;

public class UserInputII {
    public static void main( String[] args) {
        int a;
        int b;
        int c;

        Scanner input = new Scanner(System.in);

        a= input.nextInt();
        b= input.nextInt();
        c= input.nextInt();
        System.out.println(a*b+c);
    }
}

