/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Carter I. Walker
 */

package ex28;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        //Necessary variables
        Scanner input = new Scanner(System.in);
        int total = 0;

        //Main for loop structure
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Enter a number:");
            total = total + input.nextInt();
        }

        //Final output
        System.out.println("The total is " + total);
    }
}
