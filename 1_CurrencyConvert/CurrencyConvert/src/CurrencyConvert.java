import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Convert Machine");
        System.out.printf("USD amount: ");

        double usd = scanner.nextDouble();

        double vnd = usdToVnd(usd);

        System.out.printf("$%.2f is about %.2f vnd", usd, vnd);
    }

    private static double usdToVnd(double usd) {
        return 23000 * usd;
    }
}
