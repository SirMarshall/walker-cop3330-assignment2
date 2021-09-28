package ex26;

public class paymentCalculator
{
    public static double calculateMonthsUntilPaidOff (int balance, double APR, int payment)
    {
        double n;
        double i = (APR / 365);

        n = -(1/30) * Math.log((1 + balance/payment * (1 - Math.pow(1 + i, 30)) / Math.log(1 + i)));
        System.out.println("N is " + n);
        return n;
    }
}
