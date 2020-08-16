import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double interest = 0, principal = 1.0 , interestRate = 1.0;
        byte month = 1;

        System.out.printf("Enter principle amount: ");
        principal = scanner.nextDouble();

        System.out.printf("Enter number of months: ");
        month = scanner.nextByte();

        System.out.printf("Enter annual interest rate in percentage: ");
        interestRate = scanner.nextFloat();

        interest = calcInterest(principal, month, interestRate);

        System.out.printf("Interest: %.2f", interest);

    }

    private static double calcInterest(double principal, byte month, double interestRate) {
        double interest = 0;

        for (int i = 0; i < month; i++) {
            interest += (principal + interest) * (interestRate/100)/12;
        }

        return interest;
    }
}
