package MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sizes = readArray(scanner);
        int rows = sizes[0];
        int cols = sizes[1];

        int[][] matrix = createMatrix(rows, cols, scanner);
        printMatrix(matrix);
        findMaxSum(matrix);

    }

    private static int findMaxSum(int[][] matrix){

        int maxSum = 0;
        int currentSum = 0;
        int roundsInner = 0;
        int roundsOutteer = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                if(roundsInner<3){
                currentSum += matrix[i][j];
                }
                roundsInner++;
            }
        }
                return maxSum;
    }
    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static int[][] createMatrix(int r, int c, Scanner scanner) {
        int matrix[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            int[] line = readArray(scanner);
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = line[j];

            }
        }
        return matrix;
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
