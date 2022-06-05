/*
Casting

Description
Let’s say you have two variables, a and b:

    a is an int variable initialised to 6 and
    b is a double variable initialised to 5.5

Now you want to add these two variables and print their sum, but you’re not interested in the decimal part of a + b.
Write a code that computes a + b and prints out only the whole number part of the result.

Input:
No input required

Output:
11
 */


package variableAndDataTypes;

class CastingPracticeII {
    public static void main(String[] args) {
        int a = 6;
        double b = 5.5;
        int sum = a + (int)b;
        System.out.println(sum);
    }
}
