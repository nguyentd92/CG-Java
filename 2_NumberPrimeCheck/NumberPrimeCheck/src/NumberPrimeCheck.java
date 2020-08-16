import java.util.Scanner;

public class NumberPrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Check number is prime");
        System.out.printf("Num: ");

        int num = scanner.nextInt();

        boolean isPrime = checkPrime(num);

        System.out.printf("%d is " + (isPrime ? "" : "not ") + "prime", num);
    }

    private static boolean checkPrime(int num) {
        if(num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }

        return true;
    }
}
