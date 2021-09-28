/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Carter I. Walker
 */

package ex25;
import java.util.Scanner;

public class App
{
    public static int passwordValidator (String password)
    {
        //Check if password is only numbers
        if (password.matches("^[0-9]+"))
        {
            return 1;
        }
        //Check if password is only letters
        else if (password.matches("^[A-Z a-z]+$"))
        {
            return 2;
        }
        else if (password.matches("^[A-Z a-z 0-9]+$") && password.length() >= 8)
        {
            return 3;
        }
        else if (password.length() >= 8)
        {
            return 4;
        }
        else return 2;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String password;
        int strength;

        System.out.println("Pleas enter a password to test It's strength:");
        password = input.nextLine();

        strength = passwordValidator(password);
        System.out.println("Password strength: " + strength);
    }

}
