public class Program {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        int size = 100000;
        int[] arr = initArray(size);

        stopWatch.start();

        callSelectionSortAlgorithms(arr);

        stopWatch.stop();

        stopWatch.showTime();
    }

    private static void printArray(int[] arr) {
        System.out.println();

        for (int i : arr) {
            System.out.printf("%7d", i);
        }

        System.out.println();
    }

    private static void callSelectionSortAlgorithms(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;

            for (int i1 = i; i1 < arr.length; i1++) {
                if(min > arr[i1]) {
                    min = arr[i1];
                    minIndex = i1;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    private static int[] initArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * size * 10);
        }

        return arr;
    }
}
