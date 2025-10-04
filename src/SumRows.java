import java.util.Arrays;

public class SumRows {
    public static int[] sumRows(int[][] matrix) {
        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            result[i] = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {7, 8, 9},
                {2, 2, 2}
        };
        System.out.println(Arrays.toString(sumRows(array)));
    }
}
