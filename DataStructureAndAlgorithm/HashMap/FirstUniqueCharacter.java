/*
Description

You will be given a string, and you have to print the first unique character of the string, i.e., the non-repeating character of the string.

Note:

    The string may contain duplicates.
    If there is no unique character, then print -1.


Input: The input will be in the following format:

    The first line will be a string.

Output: The output should be in the following format:

    Print the first unique character of the string or -1 if no unique character is found.


Sample Input-1:

abcdabdef


Sample output-1:

c

The input is a string "abcdabdef". The output is character c from the input string, as c is the only character that is not repeated in the string.


Sample input-2:

aabb


Sample output-2:

-1

The input is a string "aabb". The output is -1, as there is no non-repeating character present in the input string.
 */


package DataStructureAndAlgorithm.HashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstUniqueCharacter {
    public static void main(String arg[]) {

        Scanner in = new Scanner(System.in);

        //storing the input string to String variable "str"
        String str = in.nextLine();
        //write your code here
        Map<Character, Integer> h = new LinkedHashMap<Character, Integer>();
        Boolean flag = false;
        for (int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if (h.containsKey(ch) == false ){
                h.put(ch, 1);
            } else {
                h.put(ch, h.get(ch) + 1);
            }
        }

        for (Character ch : h.keySet()) {
            if (h.get(ch) == 1) {
                System.out.println(ch);
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(-1);
    }
}