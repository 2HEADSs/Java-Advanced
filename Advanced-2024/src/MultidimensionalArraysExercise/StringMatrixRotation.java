package MultidimensionalArraysExercise;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int degrees = readDegrees(command);


        ArrayDeque<String[]> inputsList = new ArrayDeque<>();
        int[] dimensions = readLines(scanner, inputsList);
        int rows = dimensions[0];
        int cols = dimensions[1];

        String[][] matrix = new String[rows][cols];
        fillMatrix(inputsList, rows, cols, matrix);
        switch (degrees) {
            case 90:
                //                                 7     3
                String[][] output90 = new String[cols][rows];
                createOutputMatrix90(output90, matrix, cols, rows);
                System.out.println(90);
                break;
            case 180:
                String[][]output180 = new String[rows][cols];
                System.out.println(180);
                break;
            case 270:
                String[][]output270 = new String[cols][rows];
                System.out.println(270);
                break;
            case 360:
                String[][]output360 = new String[rows][cols];
                System.out.println(360);
                break;
        }

        System.out.println();
    }

    private static void createOutputMatrix90(String[][] output90,String[][] matrix, int cols, int rows) {
            //7
        int currentRows = cols; //7
        int currentCols = rows; //3
        for (int i = 0; i < output90.length; i++) {
            for (int j = 0; j < output90[i].length; j++) {
                output90[i][j] = matrix[matrix.length-1-i][j];
            }
        }
    }

    private static void fillMatrix(ArrayDeque<String[]> inputsList, int rows, int cols, String[][] matrix) {
        for (int row = 0; row < rows; row++) {
            String[]currentRow = new  String[cols];
            String[]rowFromQueue = inputsList.remove();
            for (int i = 0; i < currentRow.length; i++) {
                if(i <rowFromQueue.length){
                currentRow[i] = rowFromQueue[i];
                }else {
                    currentRow[i] = "";
                }
            }
            matrix[row] = currentRow;
        }


    }

    private static int[] readLines(Scanner scanner, ArrayDeque<String[]> inputsList) {
        int rows = 0;
        int cols = 0;

        String line = scanner.nextLine();
        while (!line.equals("END")) {
            rows++;
            String[] input = line.split("");
            inputsList.add(input);
            if (input.length > cols) {
                cols = input.length;
            }
            line = scanner.nextLine();
        }
        return new int[]{rows, cols};
    }


    private static int readDegrees(String command) {
        Pattern pattern = Pattern.compile("\\(([^)]+)\\)");
        Matcher matcher = pattern.matcher(command);
        int degrees = 0;
        if (matcher.find()) {
            degrees = Integer.parseInt(matcher.group(1));
        }
        return degrees;
    }
}
