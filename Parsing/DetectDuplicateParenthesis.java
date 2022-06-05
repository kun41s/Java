/*
Description
Write a program that can evaluate a given balanced expression for the duplicate parenthesis if it contains. If the expression includes duplicate parenthesis then print “Input string contains duplicate parenthesis” else print “Input string does not contain duplicate parenthesis”.

Your application should take the following as input:

    The input string in a single line without any space between the characters.


Note: The program should only test for duplicate parenthesis which means the other brackets ‘{‘ or ‘[‘ will be just as normal characters like ‘a’ or ‘1’

Sample Input:
(((a+1))+(b+1))

Sample output:
Input string contains duplicate parenthesis

Sample Input:
(909)

Sample output:
Input string does not contain duplicate parenthesis


 */

package Parsing;

import java.util.Scanner;
import java.util.Stack;

public class DetectDuplicateParenthesis {
    public static String findDuplicateParenthesis(String inputString) {
        //write your code here
        Stack<Character> st = new Stack<>();
        for (int i=0; i<inputString.length(); i++){
            char ch = inputString.charAt(i);
            if (ch != ')'){
                st.push(ch);
            }else {
                char top = st.peek();
                st.pop();
                int count = 0;

                while (top != '('){
                    top = st.peek();
                    count++;
                }

                if (count <= 1){
                    return "Input string contains duplicate parenthesis";
                }
            }

        }

        return "Input string does not contain duplicate parenthesis";
    }


    public static void main(String[] args){
        DetectDuplicateParenthesis obj = new DetectDuplicateParenthesis();
        String inputString = new String();
        Scanner in = new Scanner(System.in);
        inputString = in.nextLine();
        System.out.println(obj.findDuplicateParenthesis(inputString));
    }
}
