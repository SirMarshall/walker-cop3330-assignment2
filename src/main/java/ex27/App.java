/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Carter I. Walker
 */

package ex27;
import java.util.Scanner;

public class App {

    public static int validateFirstName(String firstName)
    {
        if (firstName.length() == 0)
        {
            System.out.println("The first name must be filled in.");
            return 2;
        }
        else if (firstName.length() <= 1)
        {
            System.out.println("The first name must be at least 2 characters long.");
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static int validateLastName(String lastName)
    {
        if (lastName.length() == 0)
        {
            System.out.println("The last name must be filled in.");
            return 2;
        }
        else if (lastName.length() <= 1)
        {
            System.out.println("The last name must be at least 2 characters long.");
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static int validateZipCode(String zipCode)
    {
        if (zipCode.matches("^[0-9]+"))
        {
            return 0;
        }
        else
        {
            System.out.println("The zipcode must be a 5 digit number.");
            return 1;
        }
    }

    public static int validateEmployeeID(String employeeID)
    {
        if (employeeID.matches("[A-Z]{2}[-][0-9]{4}"))
        {
            return 0;
        }
        else
        {
            System.out.println("The employee ID must be in the format of AA-1234");
            return 1;
        }
    }

    public static void validateInput(String firstName, String lastName, String zipCode, String employeeID) {
        int errorCount = 0;
        errorCount = errorCount + validateFirstName(firstName);
        errorCount = errorCount + validateLastName(lastName);
        errorCount = errorCount + validateZipCode(zipCode);
        errorCount = errorCount + validateEmployeeID(employeeID);

        if (errorCount == 0)
        {
            System.out.println("There were no errors found.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName, lastName, zipCode, employeeID;

        System.out.println("Enter the first name:");
        firstName = input.next();

        System.out.println("Enter the last name:");
        lastName = input.next();

        System.out.println("Enter the ZIP code:");
        zipCode = input.next();

        System.out.println("Enter the employee ID:");
        employeeID = input.next();

        validateInput(firstName, lastName, zipCode, employeeID);
    }
}
