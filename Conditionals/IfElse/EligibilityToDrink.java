/*
Description
Write a Java program to check eligibility to drink based on entered age.(Assume legal drinking age as 21).
If the person is eligible, print “You are eligible to consume alcohol”
If the person is not eligible, print “You are not eligible to consume alcohol. Go home kid!”
Sample Input:
21
Sample Output:
You are eligible to consume alcohol
 */

package Conditionals.IfElse;
import java.util.*;
public class EligibilityToDrink {

    public static void main(String[] args) {
        int age;
        Scanner input= new Scanner(System.in);
        age=input.nextInt();
        if (age>=21){
            System.out.println("You are eligible to consume alcohol");
        }
        else {
            System.out.println("You are not eligible to consume alcohol. Go home kid!");
        }
    }
}
