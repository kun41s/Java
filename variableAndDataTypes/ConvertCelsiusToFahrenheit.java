/*
Description
 Write a Java program to take the temperature from the user in Celsius, convert it into Fahrenheit
 and display it to the user. You can use the following formula for this purpose:
F=9C/5+32
Where, C is the temperature in Celsius and F is the temperature in Fahrenheit.
Note: You can assume that C and F are integer values.
Sample Input: 1
Sample Output: 33
 */


package variableAndDataTypes;
import java.util.*;
public class ConvertCelsiusToFahrenheit {

    public static void main(String[] args) {

        int C, F;
        Scanner input= new Scanner(System.in);
        C=input.nextInt();
        F=9*C/5+32;
        System.out.println(F);
    }
}
