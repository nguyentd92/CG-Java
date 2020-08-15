import java.util.Scanner;

public class LeafYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Check leaf year:");
        System.out.printf("Year: ");

        int year = scanner.nextInt();

        boolean isLeafYear = checkIsLeafYear(year);

        System.out.printf("" + year + " is " + (isLeafYear ? "" : "not") + " leaf year");
    }

    private static boolean checkIsLeafYear(int year) {
        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        return year % 4 == 0;
    }
}
