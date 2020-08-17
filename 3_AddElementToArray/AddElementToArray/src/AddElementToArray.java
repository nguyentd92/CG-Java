import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int index;
        int val;
        boolean isCompatible = false;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.printf("Position you want to add: ");
            index = scanner.nextInt();

            isCompatible = index >= 0 && index < array.length;
        } while(!isCompatible);

        System.out.printf("Value: ");
        val = scanner.nextInt();

        for (int i = array.length - 1; i >= 0; i--) {
            if(i == index) {
                array[i] = val;
                break;
            }

            array[i] = array[i - 1];
            array[i-1] = val;
        }

        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.printf("%d ", i);
        }
    }
}
