/*
Arrays
Description
In addition to taking marks as input, write code to take as input a student’s roll number and display his/her marks.
Here, roll numbers start from 0.
The first 5 lines will contain marks of students and the sixth line will contain roll number of the student whose marks are to be displayed.
Note: The following statement will print the marks of a student whose roll number is stored in the variable rollNumber :
System.out.println(marks[rollNumber]);
Sample Input:
11
12
13
14
15
3

Sample Output:
The student with roll number 3 has scored 14 marks
 */

package Arrays;
import java.util.*;

public class ArrayToStoreStudentsMarksAndShow {

    public static void main(String[] args) {

        int marks[];
        marks= new int[5];
        Scanner input= new Scanner(System.in);
        marks[0]=input.nextInt();
        marks[1]=input.nextInt();
        marks[2]=input.nextInt();
        marks[3]=input.nextInt();
        marks[4]=input.nextInt();

        int rollNumber;
        rollNumber=input.nextInt();
        System.out.println("The student with roll number "+rollNumber+" has scored "+marks[rollNumber]+" marks");
    }
}
