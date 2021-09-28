/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Carter I. Walker
 */

package ex24;
import java.util.Scanner;

class App
{
    public static boolean isAnagram (String one, String two)
    {
        //Check if same length
        if (one.length() != two.length())
        {
            return false;
        }

        //Primary loop for anagram detection
        else
        {
            char key1 = 0, key2 = 0;
            for (int i = 0; i < one.length(); i++) {
                //Isolates index at a time of string one to compare
                key1 = one.charAt(i);

                for (int j = 0; j < two.length(); j++) {
                    //Isolates index at a time of string two to compare
                    key2 = two.charAt(j);

                    //If key is valid, break for loop.
                    if (key1 == key2) {
                        break;
                    }
                }
                if (key1 != key2) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String one,two;
        boolean anagram;

        System.out.println("Please enter two strings, and I'll tell you if they are anagrams:");

        System.out.println("Enter the first string:");
        one = input.next();

        System.out.println("Enter the second string:");
        two = input.next();

        anagram = isAnagram(one,two);

        if(anagram == true)
        {
            System.out.println("\"" + one + "\" and \"" + two + "\" are anagrams.");
        }
        else
        {
            System.out.println("\"" + one + "\" and \"" + two + "\" are not " +
                    "anagrams.");
        }

    }
}

