import java.util.Scanner;

public class NumberToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.println("Enter your number");
        number = scanner.nextInt();

        printNumberInText(number);
    }

    private static void printNumberInText(int i) {
        System.out.println("" + i + ": " + convertNumberToText(i));
    }

    private static String convertNumberToText(int number) {
        return readMoreThan9Digit(number);
    }

    private static String readMoreThan9Digit(int number) {
        int billion = 1000000000;
        if(number >= billion) {
            int extant = number % billion;
            return read1Digit(number / billion) + " billion" + (extant == 0 ? "" : ",") + " " + readMoreThan6Digit(extant);
        }

        return readMoreThan6Digit(number);
    }

    private static String readMoreThan6Digit(int number) {
        int million = 1000000;
        if(number >= million) {
            int extant = number % million;
            return readMoreThan3Digit(number / million) + " million" + (extant == 0 ? "" : ",") +  " " + readMoreThan3Digit(extant);
        }

        return  readMoreThan3Digit(number);
    }

    private static String readMoreThan3Digit(int number) {

        if (number < 1000) return "" + read3Digit(number);

        int digit4More = number / 1000;
        int extant = number % 1000;

        return read3Digit(digit4More) + " thousands " + read3Digit(extant);
    }

    private static String read3Digit(int number) {
        if (number < 100) return "" + read2Digit(number);

        int digit3 = number / 100;

        int extant = number % 100;

        return read1Digit(digit3) + " hundreds " + (extant == 0 ? " " : "and ") + read2Digit(extant);
    }

    private static String read1Digit(int number) {
        switch (number) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }

    private static String read2Digit(int number) {
        if (number < 10) {
            return read1Digit(number);
        }

        int digit2 = number / 10;
        int digit1 = number % 10;

        if (number >= 16 && number < 20) {
            return read1Digit(digit1) + "teen";
        }

        switch (number) {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
        }

        switch (digit2) {
            case 2:
                return "twenty " + read1Digit(digit1);
            case 3:
                return "thirty " + read1Digit(digit1);
            case 4:
                return "forty " + read1Digit(digit1);
            case 5:
                return "fifty " + read1Digit(digit1);
        }
        ;

        return read1Digit(digit2) + "ty " + read1Digit(digit1);
    }
}
