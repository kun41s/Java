/*
Description
While registering on a website, a person needs to enter his/her email ID, after which the website will check for duplicate entries. In other words, it will check to see if the ID has been registered previously by another user.

Now, you are assigned the task of checking whether a particular email that comes in for registration already exists or not.

You are given an array of emails that are already registered with the website in an unsorted manner: [“chandler.bing@xyz.com”, “ross.geller@xyz.com”, “rachel.greene@xyz.com”, “joey.tribbiani@xyz.com”, “monica.geller@xyz.com”, “phoebe.buffay@xyz.com”, “sheldon.copper@xyz.com”, “marie.george@xyz.com”].

Now, suppose a new entry called monica.geller@xyz.com comes in. Write a code that returns the index at which the email already exists, and if it doesn’t exist, return -1.

Input:
The input is the new entry, that is, monica.geller@xyz.com which needs to be checked in the array of emails that are already registered.

Output:
        1. If the new entry is found in the array of emails, then the output will be the index at which it is found.
        2. If the new entry is not found in the array of emails, then the output will be -1
 */

package DataStructureAndAlgorithm.LinearSearch;

class SearchingForEmailsInUnsortedArray {
    public static void main(String[] args)
    {
        String[] emails = {"chandler.bing@xyz.com","ross.geller@xyz.com","rachel.greene@xyz.com","joey.tribbiani@xyz.com","monica.geller@xyz.com","phoebe.buffay@xyz.com","sheldon.copper@xyz.com","marie.george@xyz.com"};

        String NewEmail="monica.geller@xyz.com";

        // Write your code here
        int i=0;

        for (String s: emails)
        {
            if(NewEmail == s)
                break;

            i++;
        }
        if(i==emails.length) System.out.println("-1");
        else System.out.println(i);
    }
}