/*
String Concatenation
Description
Consider that you have to send a welcome email to every user registering at your college.
A student would have free access to your website till he/she graduates in four years after enrollment.
The welcome message is as follows:
Hello <name>,
Free services till:<year of graduation>

You have to take the username and year of enrollment as input from the user and generate the welcome message as output.
Note: The code for taking the name and year of enrollment has already been written for you.
Sample Input:
Aishwarya
2010
Sample Output:
Hello Aishwarya
Free services till:2014
 */

package variableAndDataTypes;
import java.util.*;
import java.util.Scanner;

public class StringConcatenation {

    public static void main(String[] args) {

        String name;
        int year;
        Scanner input= new Scanner(System.in);
        name=input.nextLine();
        year=input.nextInt();

        int yearOfGraduation;
        yearOfGraduation=year+4;
        System.out.println("Hello "+name);
        System.out.println("Free services till:"+yearOfGraduation);

    }
}

