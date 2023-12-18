package MultidimensionalArrays;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WrongMeasurements2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readMatrix(scanner);

        int[] arrwithWrongValues = readArray(scanner);
        int wrongValue = matrix[arrwithWrongValues[0]][arrwithWrongValues[1]];
        List<int[]> correctValues = new ArrayList<>();

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == wrongValue) {
                    int sum = 0;
                    // TOP
                    if (isBound(matrix, r - 1, c) && matrix[r - 1][c] != wrongValue) {
                        sum += matrix[r - 1][c];
                    }
                    // LEFT
                    if (isBound(matrix, r, c - 1) && matrix[r][c - 1] != wrongValue) {
                        sum += matrix[r][c - 1];
                    }
                    // RIGHT
                    if (isBound(matrix, r, c + 1) && matrix[r][c + 1] != wrongValue) {
                        sum += matrix[r][c + 1];
                    }
                    //DOWN
                    if (isBound(matrix, r + 1, c) && matrix[r + 1][c] != wrongValue) {
                        sum += matrix[r + 1][c];
                    }
                    int[] position = {r, c, sum};
                    correctValues.add(position);
                }
            }

        }
        for(int[] params: correctValues){
            matrix[params[0]][params[1]] = params[2];
        }

        printMatrix(matrix);

    }

    private static boolean isBound(int[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length
                && c >= 0 && c < matrix[r].length;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int e : arr) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }

    private static int[][] readMatrix(Scanner scanner) {
        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][];

        for (int r = 0; r < size; r++) {
            matrix[r] = readArray(scanner);
        }
        return matrix;
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

}
