public class FindMaxInMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int max;

        matrix = matrixRandom(10, 10);

        max = findMax(matrix);

        System.out.printf("Max: %d\n", max);

        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];

            for (int i1 = 0; i1 < row.length; i1++) {
                System.out.printf("%2d ", row[i1]);
            }

            System.out.println();
        }
    }

    private static int findMax(int[][] matrix) {
        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];

            for (int i1 = 0; i1 < row.length; i1++) {
                if(max < row[i1]) {
                    max = row[i1];
                }
            }
        }

        return max;
    }

    private static int[][] matrixRandom(int row, int col) {
        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int i1 = 0; i1 < col; i1++) {
                matrix[i][i1] = (int)(Math.random() * 100);
            }
        }

        return matrix;
    }
}
