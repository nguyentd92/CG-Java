import java.util.Scanner;

public class ConvertTemperature {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double output = 0;

        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    output = convertFromFahrenheitToCelsius();
                    break;
                case 2:
                    output = convertFromCelsiusToFahrenheit();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please type the correct option");
                    continue;
            }

            System.out.printf("Result: %.2f \n", output);
        } while (choice != 0);
    }

    private static double convertFromCelsiusToFahrenheit() {
        double celsius = getInputFromConsole("Celsius");

        return (9.0 / 5) * celsius + 32;
    }

    private static double convertFromFahrenheitToCelsius() {
        double fahrenheit = getInputFromConsole("Fahrenheit");

        return (5.0 / 9) * (fahrenheit - 32);
    }

    private static double getInputFromConsole(String unitName) {
        System.out.printf(unitName + ": ");
        return scanner.nextDouble();
    }
}
