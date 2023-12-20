package MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixofPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = readArray(scanner);
        int r = input[0];
        int c = input[1];

        int[][][] matrix = createMatrix(r, c);

        printMatrix(matrix);
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static int[][][] createMatrix(int r, int c) {
        int first = 97;
        int next = first;
        int[][][] matrix = new int[r][c][3];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < 3; k++) {
                    if (k == 1) {
                        matrix[i][j][k] = next;
                    } else {
                        matrix[i][j][k] = first;
                    }
                }
                next++;
            }
            first++;
            next = first;
        }
        return matrix;
    }

    private static void printMatrix(int[][][] matrix) {
        for (int[][] arrOuter : matrix) {
            for (int[] arrInner : arrOuter) {
                for (int i = 0; i < arrInner.length; i++) {
                    System.out.print((char) arrInner[i]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
