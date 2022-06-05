/*
Description
Write a code below that takes a 5-digit positive number from the user as an input.

For example, you can take 34768 as an input.
The program should print the numbers in the ones, tens, hundreds, thousands, and ten thousands places of the 5-digit number the user inputs.

Input:
34768

Output:
3
4
7
6
8
 */

package variableAndDataTypes;
import java.util.Scanner;

class PlaceValueAtPosition {

    public static void main(String[] args) {


        //Create new scanner
        Scanner input = new Scanner(System.in);

        //Values of each digit
        int tenThousands, thousands, hundreds, tens, ones;

        //Prompt user to input 5 digit number

        int number = input.nextInt();
        if (number > 99999) {
            System.out.println("Error! Number more than 5 digits.");
        }
        else if (number < 10000) {
            System.out.println("Error! Number less than 5 digits.");
        }
        else if (10000<=number&&number<=99999){

            //Displays ten thousands place digit
            tenThousands = number / 10000;
            System.out.println(tenThousands);

            //Displays thousands digit
            thousands = (number % 10000) / 1000;
            System.out.println(thousands);

            //Displays hundreds place digit
            hundreds = number % 1000 / 100;
            System.out.println(hundreds);

            //Displays tens digit
            tens = (number % 100) / 10;
            System.out.println(tens);

            //Displays ones digit
            ones = number % 10;
            System.out.println(ones);

            //Error if number is less or more than five digits
        }

    }
}