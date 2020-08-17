import java.util.Scanner;

public class RemoveElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.printf("Type the val you want to remove:");
        Scanner scanner = new Scanner(System.in);

        int val = scanner.nextInt();

        removeElementFromArray(val, arr);

        for (int i : arr) {
            System.out.printf("%d ", i);
        }
    }

    private static void removeElementFromArray(int val, int[] array) {
        boolean isFind = false;
        int lastIndex = array.length - 1;
        for (int i = 0; i <= lastIndex; i++) {
            if(!isFind && val == array[i]) isFind = true;

            if(isFind) {
                if(i == lastIndex) {
                    array[i] = 0;
                    continue;
                }

                array[i] = array[i + 1];
            }
        }
    }
}
