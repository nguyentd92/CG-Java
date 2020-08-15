import java.util.Scanner;

public class DateOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("What's month you want to know?");
        System.out.printf("Month:");

        short month = scanner.nextShort();

        short days = countDaysOfMonth(month);

        System.out.printf("Month has " + days + " days");
    }

    private static short countDaysOfMonth(short month) {
        try {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    return 28;
                default: return 30;
            }
        } catch (Exception exception){
            throw exception;
        }
    }
}
