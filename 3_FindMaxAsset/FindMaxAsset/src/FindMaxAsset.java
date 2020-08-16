import java.util.Scanner;

public class FindMaxAsset {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = initAssetArray();

        printArray(array);

        int indexOfMax = findIndexOfMax(array);
        int max = array[indexOfMax];

        System.out.println("The largest property value in the list is " + max + " ,at position " + indexOfMax);
    }

    private static int findIndexOfMax(int[] array) {
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j;
            }
        }

        return index;
    }

    private static void printArray(int[] array) {
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }

    private static int[] initAssetArray() {
        int size;

        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        int[] array = new int[size];

        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        return array;
    }
}
