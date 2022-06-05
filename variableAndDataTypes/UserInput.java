package variableAndDataTypes;

import java.util.Scanner;

public class UserInput {
    public static void main( String[] args ) {
        int numberA;
        int numberB;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value for a");

        numberA = input.nextInt();

        System.out.println("Enter the value for b");

        numberB = input.nextInt();
        System.out.println(numberA + numberB);
    }
}
