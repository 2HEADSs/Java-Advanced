package MultidimensionalArraysExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sizes = readArray(scanner);
        int rows = sizes[0];
        int cols = sizes[1];

        int[][] matrix = new int[rows][cols];
        createMatrix(matrix, scanner);

        findMaxSum(matrix);


    }

    private static void findMaxSum(int[][] matrix) {
        int maxSum = Integer.MIN_VALUE;
        ArrayDeque<int[][]> maxSumArrays = new ArrayDeque<>();
        int currentSum = 0;

        for (int i = 0; i < matrix.length - 2; i++) {
            int[][] currentArray = new int[3][3];

            for (int j = i; j < matrix[i].length - 2; j++) {
                currentSum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2] +
                        matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2] +
                        matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];

                if (currentSum > maxSum) {
                    maxSum = currentSum;

                    currentArray[0][0] = matrix[i][j];
                    currentArray[0][1] = matrix[i][j + 1];
                    currentArray[0][2] = matrix[i][j + 2];
                    currentArray[1][0] = matrix[i + 1][j];
                    currentArray[1][1] = matrix[i + 1][j + 1];
                    currentArray[1][2] = matrix[i + 1][j + 2];
                    currentArray[2][0] = matrix[i + 2][j];
                    currentArray[2][1] = matrix[i + 2][j + 1];
                    currentArray[2][2] = matrix[i + 2][j + 2];
                    maxSumArrays.push(currentArray);
                }
            }
        }
        System.out.println("Sum = " + maxSum);
        printMatrix(maxSumArrays.pop());
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static void createMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = readArray(scanner);
        }

    }

    private static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int e : arr) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
