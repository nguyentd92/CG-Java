import java.util.Scanner;

public class ReverseArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size;
        int[] array;

        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);

        array = initialArray(size);

        System.out.println("Array:");
        printArray(array);

        reverseArray(array);

        System.out.println("\nArray after reverse");
        printArray(array);
    }

    private static void reverseArray(int[] array) {
        int size = array.length;

        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
    }

    private static void printArray(int[] array) {
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }

    private static int[] initialArray(int size) {
        int [] array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        return array;
    }
}
