package MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = createMatrix(size, scanner);

        int primaryDiagonal = sumPrimaryDiagonal(matrix);
        int secondaryDiagonal = sumSecondaryDiagonal(matrix);
        System.out.println(Math.abs(primaryDiagonal - secondaryDiagonal));

    }

    private static int sumSecondaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][matrix.length-1-i];
        }
        return sum;
    }

    private static int sumPrimaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][i];
        }
        return sum;
    }

    private static int[][] createMatrix(int size, Scanner scanner) {
        int matrix[][] = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            int[] input = readArray(scanner);
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input[j];
            }
        }
        return matrix;
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
