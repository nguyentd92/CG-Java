public class ConcatArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2= {6,7,8,9};

        int[] arr = concatArray(arr1, arr2);

        for (int i : arr) {
            System.out.printf("%d ", i);
        }
    }

    private static int[] concatArray(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;

        int[] arr = new int[len1 + len2];

        for (int i = 0; i < len1; i++) {
            arr[i] = arr1[i];
        }

        for (int i = 0; i < len2; i++) {
            arr[len1 + i] = arr2[i];
        }

        return arr;
    }
}
