import java.util.Scanner;

public class SayHi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to CG! How could I call you Sir?");
        System.out.printf("Type your name:");

        String name = scanner.nextLine();

        printHello(name);
    }

    private static void printHello(String name) {
        System.out.printf("Nice to miss you %s!", name);
    }
}
