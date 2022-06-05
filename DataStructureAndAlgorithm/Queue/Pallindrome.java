package DataStructureAndAlgorithm.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pallindrome {

    public void checkPalindrome(String input) {

        Queue queue = new LinkedList();
        //Write your code here
        for (int i = input.length()-1; i >=0; i--) {
            queue.add(input.charAt(i));
        }

        String reverseString = "";

        while (!queue.isEmpty()) {
            reverseString = reverseString+queue.remove();
        }
        if (input.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");
    }

    public static void main(String[] args) {
        Pallindrome obj = new Pallindrome();
        Scanner in = new Scanner(System.in);
        String inputString = in .nextLine();
        obj.checkPalindrome(inputString);

    }
}
