/*
Description
There is a total of N students in Professor X’s school for mutants.
Each student has a first name as well as a last name,
maintained separately in two separate database columns.
One day, Professor X asks a student named Logan to copy the items
 of both these columns in two separate arrays and sort them using insertion sort.
However, the first names should be in ascending order and the last names in descending order.
Logan never used insertion sort on an array of strings, so he’s seeking for help. Write a function that takes an array of
strings as input and returns the sorted array as output. Assume that the names can only be in lowercase.

Input:
      1. The first line will be 'n', the size of the two arrays.
      2. The next 'n' lines are the first name of the students.
      3. The next 'n' lines are the last name of the students.

Output:
       1. The first 'n' lines are first names arranged in ascending order.
       2. The next 'n' lines are the last names arranged in descending order.

HINT: You can use the compareTo() method to compare two strings lexically.

Sample Input-1:
2
logan
jean
gray
wolverine
Sample Output-1:
jean
logan
wolverine
gray

Here 2 represents the size of the arrays for first and last name. Next 2 lines are first names of 2 students "logan" and "jean".
Followed by next 2 inputs of their last names, "gray" and "wolverine".
The output has first 2 lines representing first names arranged in ascending order (lexicographically).
The next two outputs represent last name of the students arranged in descending order (lexicographically).
 */


package DataStructureAndAlgorithm.Sorting.InsertionSort;

import java.util.Scanner;

class Source {

    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String firstNames[] = new String[size];
        String lastNames[] = new String[size];
        for (int i = 0; i < size; i++) {
            firstNames[i] = scanner.next().toLowerCase();
        }
        for (int i = 0; i < size; i++) {
            lastNames[i] = scanner.next().toLowerCase();
        }

        String sortedFirstName[] = firstNameInAscending(firstNames);
        for (int i=0; i<sortedFirstName.length; i++){
            System.out.println(sortedFirstName[i]);
        }

        String sortedLastName[] = lastNameInDescending(lastNames);
        for (int i = 0 ; i< sortedLastName.length; ++i){
            System.out.println(sortedLastName[i]);
        }
    }


    public static String[] firstNameInAscending(String firstName[]){
        for (int i= 1; i < firstName.length; i++){
            String v = firstName[i];
            int j = i;

            while (j >= 1 && firstName[j - 1].compareToIgnoreCase(v) > 0){
                firstName[j] = firstName[j-1];
                j--;
            }
            firstName[j] = v;
        }
        return firstName;
    }

    public static String[] lastNameInDescending(String lastName[]){

        for (int i = 1; i < lastName.length; i++){
            String v = lastName[i];
            int j = i-1;

            while (j >= 0 && lastName[j].compareToIgnoreCase(v) < 0){
                lastName[j+1] = lastName[j];
                j--;
            }
            lastName[j+1] = v;
        }
        return lastName;
    }
}
