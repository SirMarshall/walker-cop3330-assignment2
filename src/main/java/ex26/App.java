package ex26;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int balance;
        double APR, months;
        int payment;

        System.out.println("What is your balance?");
        balance = input.nextInt();

        System.out.println("What is your APR on the card (as a percent)?");
        APR = input.nextDouble() * 100;

        System.out.println("What is the monthly payment you can make?");
        payment = input.nextInt();

        months = paymentCalculator.calculateMonthsUntilPaidOff(balance, APR, payment);

        System.out.println("It will take you " + months + " to pay off this card.");
    }
}
