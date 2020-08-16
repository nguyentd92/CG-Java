import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        int a;
        int b;
        int greatestCommonFactor = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = scanner.nextInt();
        System.out.println("Enter b: ");
        b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        greatestCommonFactor = findGreatestCommonFactor(a, b);

        System.out.printf("Greatest Common Factor of %d, %d is %d", a, b, greatestCommonFactor);
    }

    private static int findGreatestCommonFactor(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
                continue;
            }

            b = b - a;
        }

        return a;
    }
}
