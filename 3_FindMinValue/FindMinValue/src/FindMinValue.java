public class FindMinValue {
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int[] arr2 = {};
        int index = findIndexOfMin(arr2);
        if(index >= 0) {
            System.out.println("The smallest element in the array is: " + arr[index]);
        } else {
            System.out.println("Array Empty");
        }
    }

    private static int findIndexOfMin(int[] arr) {
        try {
            int index = 1;
            int min = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if(min > arr[i]) {
                    min = arr[i];
                    index = i;
                }
            }

            return index;
        } catch (Exception exception){
            return -1;
        }
    }
}